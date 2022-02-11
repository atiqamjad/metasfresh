@from:cucumber
Feature: credit limit

  Background:
    Given the existing user with login 'metasfresh' receives a random a API token for the existing role with name 'WebUI'
    And metasfresh has date and time 2021-04-16T13:30:13+01:00[Europe/Berlin]
    And set sys config boolean value true for sys config SKIP_WP_PROCESSOR_FOR_AUTOMATION

  @from:cucumber
  Scenario: validate the error thrown by the credit limit set on business partner when generating the shipments, then remove the credit limit, generate shipments and validate them
    And metasfresh contains M_Products:
      | Identifier | Name       |
      | p_1        | cl_product |
    And metasfresh contains M_PricingSystems
      | Identifier | Name                   | Value                   | OPT.Description               | OPT.IsActive |
      | ps_1       | cl_pricing_system_name | cl_pricing_system_value | cl_pricing_system_description | true         |
    And metasfresh contains M_PriceLists
      | Identifier | M_PricingSystem_ID.Identifier | OPT.C_Country.CountryCode | C_Currency.ISO_Code | Name               | OPT.Description | SOTrx | IsTaxIncluded | PricePrecision | OPT.IsActive |
      | pl_1       | ps_1                          | DE                        | EUR                 | cl_price_list_name | null            | true  | false         | 2              | true         |
    And metasfresh contains M_PriceList_Versions
      | Identifier | M_PriceList_ID.Identifier | Name              | ValidFrom  |
      | plv_1      | pl_1                      | cl_salesOrder-PLV | 2021-04-01 |
    And metasfresh contains M_ProductPrices
      | Identifier | M_PriceList_Version_ID.Identifier | M_Product_ID.Identifier | PriceStd | C_UOM_ID.X12DE355 | C_TaxCategory_ID.InternalName |
      | pp_1       | plv_1                             | p_1                     | 10.0     | PCE               | Normal                        |
    And metasfresh contains C_BPartners:
      | Identifier    | Name           | OPT.IsVendor | OPT.IsCustomer | M_PricingSystem_ID.Identifier |
      | endcustomer_1 | cl_Endcustomer | N            | Y              | ps_1                          |
    And metasfresh contains C_BPartner_Locations:
      | Identifier | GLN           | C_BPartner_ID.Identifier |
      | l_1        | cl_bPLocation | endcustomer_1            |
    And metasfresh contains C_Orders:
      | Identifier | IsSOTrx | C_BPartner_ID.Identifier | DateOrdered |
      | o_1        | true    | endcustomer_1            | 2021-04-17  |
    And metasfresh contains C_OrderLines:
      | Identifier | C_Order_ID.Identifier | M_Product_ID.Identifier | QtyEntered |
      | ol_1       | o_1                   | p_1                     | 10         |
    When the order identified by o_1 is completed
    And after not more than 30s, M_ShipmentSchedules are found:
      | Identifier | C_OrderLine_ID.Identifier | IsToRecompute |
      | s_s_1      | ol_1                      | N             |
    And metasfresh contains C_BPartner_CreditLimit:
      | C_BPartner_CreditLimit_ID.Identifier | C_BPartner_ID.Identifier | Amount | ApprovedBy_ID | Processed |
      | cl_1                                 | endcustomer_1            | 8      | 100           | true      |
    And upsert C_BPartner_Stats
      | C_BPartner_ID.Identifier | SOCreditStatus.Code |
      | endcustomer_1            | S                   |

    And metasfresh contains M_Inventories:
      | Identifier | M_Warehouse_ID | MovementDate |
      | i_1        | 540008         | 2021-04-17   |
    And metasfresh contains M_InventoriesLines:
      | Identifier | M_Inventory_ID.Identifier | M_Product_ID.Identifier | UOM.X12DE355 | QtyCount | QtyBooked |
      | il_1       | i_1                       | p_1                     | PCE          | 10       | 0         |
    And the inventory identified by i_1 is completed

    And the user creates a JsonCreateShipmentRequest and stores it in the context
      | M_ShipmentSchedule_ID.Identifier | MovementQty | M_Product_ID.Identifier | DeliveryRule | MovementDate              |
      | s_s_1                            | 10          | p_1                     | F            | 2021-04-18T10:15:30+02:00 |
    When the metasfresh REST-API endpoint path 'api/v2/shipments' receives a 'POST' request with the payload from context and responds with '400' status code

    And there are no M_ShipmentSchedule_QtyPicked records created for the following shipment schedules
      | M_ShipmentSchedule_ID.Identifier |
      | s_s_1                            |

    And upsert C_BPartner_Stats
      | C_BPartner_ID.Identifier | SOCreditStatus.Code |
      | endcustomer_1            | O                   |
    And update C_BPartner_CreditLimits
      | C_BPartner_CreditLimit_ID.Identifier | Processed |
      | cl_1                                 | false     |

    And the metasfresh REST-API endpoint path 'api/v2/shipments' receives a 'POST' request with the payload from context and responds with '200' status code

    Then validate created M_ShipmentSchedule_QtyPicked records
      | M_ShipmentSchedule_ID.Identifier | QtyPicked | Processed | IsAnonymousHuPickedOnTheFly |
      | s_s_1                            | 10        | true      | true                        |
    And locate M_InOut by shipment schedule Id
      | M_InOut_ID.Identifier | M_ShipmentSchedule_ID.Identifier |
      | s_1                   | s_s_1                            |
    And validate the created shipments
      | Shipment.Identifier | C_BPartner_ID.Identifier | C_BPartner_Location_ID.Identifier | dateordered | poreference | processed | docStatus |
      | s_1                 | endcustomer_1            | l_1                               | 2021-04-17  | null        | true      | CO        |
    And validate the created shipment lines
      | Shipment.Identifier | M_Product_ID.Identifier | movementqty | processed |
      | s_1                 | p_1                     | 10          | true      |