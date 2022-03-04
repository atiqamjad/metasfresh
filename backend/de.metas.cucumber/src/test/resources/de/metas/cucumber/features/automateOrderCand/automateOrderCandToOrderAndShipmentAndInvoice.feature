@from:cucumber
@topic:orderCandidate
Feature: Process order candidate and automatically generate shipment and invoice for it
  As a user
  I create an order candidate and the process EP will automatically generate shipment schedule, shipment, invoice candidate and invoice

  Background:
    Given the existing user with login 'metasfresh' receives a random a API token for the existing role with name 'WebUI'
    And enable sys config 'SKIP_WP_PROCESSOR_FOR_AUTOMATION'
    And preexisting test data is put into tableData
      | C_BPartner_ID.Identifier | C_BPartner_ID | C_BPartner_Location_ID.Identifier | C_BPartner_Location_ID | M_Product_ID.Identifier | M_Product_ID |
      | bpartner_1               | 2156425       | bpartnerLocation_1                | 2205175                | product_1               | 2005577      |


  @from:cucumber
  @topic:orderCandidate
  Scenario: Order candidate to shipment and invoice flow and closed order
    And a 'POST' request with the below payload is sent to the metasfresh REST-API 'api/v2/orders/sales/candidates' and fulfills with '201' status code
  """
{
    "orgCode": "001",
    "externalLineId": "1555",
    "externalHeaderId": "1444",
    "dataSource": "int-Shopware",
    "bpartner": {
        "bpartnerIdentifier": "2156425",
        "bpartnerLocationIdentifier": "2205175",
        "contactIdentifier": "2188224"
    },
    "dateRequired": "2021-08-20",
    "dateOrdered": "2021-07-20",
    "orderDocType": "SalesOrder",
    "paymentTerm": "val-1000002",
    "productIdentifier": 2005577,
    "qty": 10,
    "price": 5,
    "currencyCode": "EUR",
    "discount": 0,
    "poReference": "po_ref_mock",
    "deliveryViaRule": "S",
    "deliveryRule": "F",
    "bpartnerName": "testName"
}
"""

    When a 'PUT' request with the below payload is sent to the metasfresh REST-API 'api/v2/orders/sales/candidates/process' and fulfills with '200' status code
"""
{
    "externalHeaderId": "1444",
    "inputDataSourceName": "int-Shopware",
    "ship": true,
    "invoice": true,
    "closeOrder": true
}
"""

    Then process metasfresh response
      | Order.Identifier | Shipment.Identifier | Invoice.Identifier |
      | order_1          | shipment_1          | invoice_1          |

    And validate created order
      | Order.Identifier | externalId | C_BPartner_ID.Identifier | C_BPartner_Location_ID.Identifier | dateordered | docbasetype | currencyCode | deliveryRule | deliveryViaRule | poReference | processed | docStatus | OPT.BPartnerName |
      | order_1          | 1444       | bpartner_1               | bpartnerLocation_1                | 2021-07-20  | SOO         | EUR          | F            | S               | po_ref_mock | true      | CL        | testName         |

    And validate the created order lines
      | C_OrderLine_ID.Identifier | Order.Identifier | dateordered | M_Product_ID.Identifier | qtydelivered | qtyordered | qtyinvoiced | price | discount | currencyCode | processed |
      | ol_1                      | order_1          | 2021-07-20  | product_1               | 10           | 10         | 10          | 5     | 0        | EUR          | true      |

    And validate created shipments
      | Shipment.Identifier | C_BPartner_ID.Identifier | C_BPartner_Location_ID.Identifier | dateordered | poreference | processed | docStatus |
      | shipment_1          | bpartner_1               | bpartnerLocation_1                | 2021-07-20  | po_ref_mock | true      | CO        |

    And validate the created shipment lines
      | Shipment.Identifier | M_Product_ID.Identifier | movementqty | processed |
      | shipment_1          | product_1               | 10          | true      |

    And validate created invoices
      | Invoice.Identifier | C_BPartner_ID.Identifier | C_BPartner_Location_ID.Identifier | OPT.POReference | paymentTerm | processed | docStatus |
      | invoice_1          | bpartner_1               | bpartnerLocation_1                | po_ref_mock     | 1000002     | true      | CO        |

    And validate created invoice lines
      | Invoice.Identifier | M_Product_ID.Identifier | qtyinvoiced | processed |
      | invoice_1          | product_1               | 10          | true      |


  @from:cucumber
  @topic:orderCandidate
  Scenario: Order candidate to shipment in first step and then invoice with close order
    And a 'POST' request with the below payload is sent to the metasfresh REST-API 'api/v2/orders/sales/candidates' and fulfills with '201' status code
  """
{
    "orgCode": "001",
    "externalLineId": "111",
    "externalHeaderId": "222",
    "dataSource": "int-Shopware",
    "bpartner": {
        "bpartnerIdentifier": "2156425",
        "bpartnerLocationIdentifier": "2205175",
        "contactIdentifier": "2188224"
    },
    "dateRequired": "2021-08-20",
    "dateOrdered": "2021-07-20",
    "orderDocType": "SalesOrder",
    "paymentTerm": "val-1000002",
    "productIdentifier": 2005577,
    "qty": 10,
    "price": 5,
    "currencyCode": "EUR",
    "discount": 0,
    "poReference": "po_ref_mock",
    "deliveryViaRule": "S",
    "deliveryRule": "F",
    "qtyShipped": 8,
    "bpartnerName": "testName"
}
"""
    When a 'PUT' request with the below payload is sent to the metasfresh REST-API 'api/v2/orders/sales/candidates/process' and fulfills with '200' status code
"""
{
    "externalHeaderId": "222",
    "inputDataSourceName": "int-Shopware",
    "ship": true,
    "invoice": false,
    "closeOrder": false
}
"""

    Then process metasfresh response
      | Order.Identifier | Shipment.Identifier | Invoice.Identifier |
      | order_1          | shipment_1          | null               |

    And validate created order
      | Order.Identifier | externalId | C_BPartner_ID.Identifier | C_BPartner_Location_ID.Identifier | dateordered | docbasetype | currencyCode | deliveryRule | deliveryViaRule | poReference | processed | docStatus | OPT.BPartnerName |
      | order_1          | 222        | bpartner_1               | bpartnerLocation_1                | 2021-07-20  | SOO         | EUR          | F            | S               | po_ref_mock | true      | CO        | testName         |

    And validate the created order lines
      | C_OrderLine_ID.Identifier | Order.Identifier | dateordered | M_Product_ID.Identifier | qtydelivered | qtyordered | qtyinvoiced | price | discount | currencyCode | processed |
      | ol_1                      | order_1          | 2021-07-20  | product_1               | 8            | 10         | 0           | 5     | 0        | EUR          | true      |

    And validate created shipments
      | Shipment.Identifier | C_BPartner_ID.Identifier | C_BPartner_Location_ID.Identifier | dateordered | poreference | processed | docStatus |
      | shipment_1          | bpartner_1               | bpartnerLocation_1                | 2021-07-20  | po_ref_mock | true      | CO        |

    And validate the created shipment lines
      | Shipment.Identifier | M_Product_ID.Identifier | movementqty | processed |
      | shipment_1          | product_1               | 8           | true      |

    And a 'PUT' request with the below payload is sent to the metasfresh REST-API 'api/v2/orders/sales/candidates/process' and fulfills with '200' status code
"""
{
    "externalHeaderId": "222",
    "inputDataSourceName": "int-Shopware",
    "ship": false,
    "invoice": true,
    "closeOrder": true
}
"""
    And process metasfresh response
      | Order.Identifier | Shipment.Identifier | Invoice.Identifier |
      | order_1          | null                | invoice_1          |

    And validate created order
      | Order.Identifier | externalId | C_BPartner_ID.Identifier | C_BPartner_Location_ID.Identifier | dateordered | docbasetype | currencyCode | deliveryRule | deliveryViaRule | poReference | processed | docStatus |
      | order_1          | 222        | bpartner_1               | bpartnerLocation_1                | 2021-07-20  | SOO         | EUR          | F            | S               | po_ref_mock | true      | CL        |

    And validate the created order lines
      | C_OrderLine_ID.Identifier | Order.Identifier | dateordered | M_Product_ID.Identifier | qtydelivered | qtyordered | qtyinvoiced | price | discount | currencyCode | processed |
      | ol_1                      | order_1          | 2021-07-20  | product_1               | 8            | 8          | 8           | 5     | 0        | EUR          | true      |

    And validate created invoices
      | Invoice.Identifier | C_BPartner_ID.Identifier | C_BPartner_Location_ID.Identifier | OPT.POReference | paymentTerm | processed | docStatus |
      | invoice_1          | bpartner_1               | bpartnerLocation_1                | po_ref_mock     | 1000002     | true      | CO        |

    And validate created invoice lines
      | Invoice.Identifier | M_Product_ID.Identifier | qtyinvoiced | processed |
      | invoice_1          | product_1               | 8           | true      |


  @from:cucumber
  @topic:orderCandidate
  Scenario: Order candidate to complete order, then shipment endpoint to complete shipment, invoice and close shipment
    And a 'POST' request with the below payload is sent to the metasfresh REST-API 'api/v2/orders/sales/candidates' and fulfills with '201' status code
  """
{
    "orgCode": "001",
    "externalLineId": "333",
    "externalHeaderId": "444",
    "dataSource": "int-Shopware",
    "bpartner": {
        "bpartnerIdentifier": "2156425",
        "bpartnerLocationIdentifier": "2205175",
        "contactIdentifier": "2188224"
    },
    "dateRequired": "2021-08-20",
    "dateOrdered": "2021-07-20",
    "orderDocType": "SalesOrder",
    "paymentTerm": "val-1000002",
    "productIdentifier": 2005577,
    "qty": 10,
    "price": 5,
    "currencyCode": "EUR",
    "discount": 0,
    "poReference": "po_ref_mock",
    "deliveryViaRule": "S",
    "deliveryRule": "F",
    "bpartnerName": "testName"
}
"""
    When a 'PUT' request with the below payload is sent to the metasfresh REST-API 'api/v2/orders/sales/candidates/process' and fulfills with '200' status code
"""
{
    "externalHeaderId": "444",
    "inputDataSourceName": "int-Shopware",
    "ship": false,
    "invoice": false,
    "closeOrder": false
}
"""

    Then process metasfresh response
      | Order.Identifier | Shipment.Identifier | Invoice.Identifier |
      | order_1          | null                | null               |

    And validate created order
      | Order.Identifier | externalId | C_BPartner_ID.Identifier | C_BPartner_Location_ID.Identifier | dateordered | docbasetype | currencyCode | deliveryRule | deliveryViaRule | poReference | processed | docStatus | OPT.BPartnerName |
      | order_1          | 444        | bpartner_1               | bpartnerLocation_1                | 2021-07-20  | SOO         | EUR          | F            | S               | po_ref_mock | true      | CO        | testName         |

    And validate the created order lines
      | C_OrderLine_ID.Identifier | Order.Identifier | dateordered | M_Product_ID.Identifier | qtydelivered | qtyordered | qtyinvoiced | price | discount | currencyCode | processed |
      | ol_1                      | order_1          | 2021-07-20  | product_1               | 0            | 10         | 0           | 5     | 0        | EUR          | true      |

    And a 'PUT' request with the below payload is sent to the metasfresh REST-API 'api/v2/shipments/process' and fulfills with '200' status code
"""
{
    "createShipmentRequest": {
        "shipmentList": [
            {
                "shipmentScheduleIdentifier ": {
                    "externalHeaderId": "444",
                    "externalLineId": "333"
                },
                "movementDate": "2017-01-13T17:09:42.411",
                "location": {
                    "street": "street",
                    "houseNo": "houseNo",
                    "city": "city",
                    "countryCode": "DE",
                    "zipCode": "zipCode"
                },
                "businessPartnerSearchKey": "businessPartnerSearchKey",
                "attributes": [
                    {
                        "attributeCode": "1000020",
                        "valueStr": "1000020",
                        "valueNumber": 30,
                        "valueDate": "2021-04-03"
                    }
                ],
                "movementQuantity": 8,
                "deliveryRule": "F",
                "shipperInternalName": "shipperInternalName"
            }
        ]
    },
    "invoice": true,
    "closeShipmentSchedule": true
}
"""
    And process metasfresh response
      | Order.Identifier | Shipment.Identifier | Invoice.Identifier |
      | null             | shipment_1          | invoice_1          |

    And validate created shipments
      | Shipment.Identifier | C_BPartner_ID.Identifier | C_BPartner_Location_ID.Identifier | dateordered | poreference | processed | docStatus |
      | shipment_1          | bpartner_1               | bpartnerLocation_1                | 2021-07-20  | po_ref_mock | true      | CO        |

    And validate the created shipment lines
      | Shipment.Identifier | M_Product_ID.Identifier | movementqty | processed |
      | shipment_1          | product_1               | 8           | true      |

    And validate created invoices
      | Invoice.Identifier | C_BPartner_ID.Identifier | C_BPartner_Location_ID.Identifier | OPT.POReference | paymentTerm | processed | docStatus |
      | invoice_1          | bpartner_1               | bpartnerLocation_1                | po_ref_mock     | 1000002     | true      | CO        |

    And validate created invoice lines
      | Invoice.Identifier | M_Product_ID.Identifier | qtyinvoiced | processed |
      | invoice_1          | product_1               | 8           | true      |


  @from:cucumber
  @topic:orderCandidate
  Scenario: Order candidate to complete order and partial shipment, then shipment endpoint to complete shipment, invoice and close shipment
    And a 'POST' request with the below payload is sent to the metasfresh REST-API 'api/v2/orders/sales/candidates' and fulfills with '201' status code
  """
{
    "orgCode": "001",
    "externalLineId": "8888",
    "externalHeaderId": "9999",
    "dataSource": "int-Shopware",
    "bpartner": {
        "bpartnerIdentifier": "2156425",
        "bpartnerLocationIdentifier": "2205175",
        "contactIdentifier": "2188224"
    },
    "dateRequired": "2021-08-20",
    "dateOrdered": "2021-07-20",
    "orderDocType": "SalesOrder",
    "paymentTerm": "val-1000002",
    "productIdentifier": 2005577,
    "qty": 10,
    "price": 5,
    "currencyCode": "EUR",
    "discount": 0,
    "poReference": "po_ref_mock",
    "deliveryViaRule": "S",
    "deliveryRule": "F",
    "qtyShipped": 8,
    "bpartnerName": "testName"
}
"""
    When a 'PUT' request with the below payload is sent to the metasfresh REST-API 'api/v2/orders/sales/candidates/process' and fulfills with '200' status code
"""
{
    "externalHeaderId": "9999",
    "inputDataSourceName": "int-Shopware",
    "ship": true,
    "invoice": false,
    "closeOrder": false
}
"""

    Then process metasfresh response
      | Order.Identifier | Shipment.Identifier | Invoice.Identifier |
      | order_1          | shipment_1          | null               |

    And validate created order
      | Order.Identifier | externalId | C_BPartner_ID.Identifier | C_BPartner_Location_ID.Identifier | dateordered | docbasetype | currencyCode | deliveryRule | deliveryViaRule | poReference | processed | docStatus | OPT.BPartnerName |
      | order_1          | 9999       | bpartner_1               | bpartnerLocation_1                | 2021-07-20  | SOO         | EUR          | F            | S               | po_ref_mock | true      | CO        | testName         |

    And validate the created order lines
      | C_OrderLine_ID.Identifier | Order.Identifier | dateordered | M_Product_ID.Identifier | qtydelivered | qtyordered | qtyinvoiced | price | discount | currencyCode | processed |
      | ol_1                      | order_1          | 2021-07-20  | product_1               | 8            | 10         | 0           | 5     | 0        | EUR          | true      |

    And validate created shipments
      | Shipment.Identifier | C_BPartner_ID.Identifier | C_BPartner_Location_ID.Identifier | dateordered | poreference | processed | docStatus |
      | shipment_1          | bpartner_1               | bpartnerLocation_1                | 2021-07-20  | po_ref_mock | true      | CO        |

    And validate the created shipment lines
      | Shipment.Identifier | M_Product_ID.Identifier | movementqty | processed |
      | shipment_1          | product_1               | 8           | true      |

    And validate that there are no M_ShipmentSchedule_Recompute records after no more than 10 seconds for order 'order_1'

    And a 'PUT' request with the below payload is sent to the metasfresh REST-API 'api/v2/shipments/process' and fulfills with '200' status code
"""
{
    "createShipmentRequest": {
        "shipmentList": [
            {
                "shipmentScheduleIdentifier ": {
                    "externalHeaderId": "9999",
                    "externalLineId": "8888"
                },
                "movementDate": "2017-01-13T17:09:42.411",
                "location": {
                    "street": "street",
                    "houseNo": "houseNo",
                    "city": "city",
                    "countryCode": "DE",
                    "zipCode": "zipCode"
                },
                "businessPartnerSearchKey": "businessPartnerSearchKey",
                "attributes": [
                    {
                        "attributeCode": "1000020",
                        "valueStr": "1000020",
                        "valueNumber": 30,
                        "valueDate": "2021-04-03"
                    }
                ],
                "movementQuantity": 2,
                "deliveryRule": "F",
                "shipperInternalName": "shipperInternalName"
            }
        ]
    },
    "invoice": true,
    "closeShipmentSchedule": true
}
"""
    And process metasfresh response
      | Order.Identifier | Shipment.Identifier   | Invoice.Identifier |
      | null             | shipment_1,shipment_2 | invoice_1          |

    And validate created shipments
      | Shipment.Identifier | C_BPartner_ID.Identifier | C_BPartner_Location_ID.Identifier | dateordered | poreference | processed | docStatus |
      | shipment_1          | bpartner_1               | bpartnerLocation_1                | 2021-07-20  | po_ref_mock | true      | CO        |

    And validate the created shipment lines
      | Shipment.Identifier | M_Product_ID.Identifier | movementqty | processed |
      | shipment_1          | product_1               | 8           | true      |

    And validate created shipments
      | Shipment.Identifier | C_BPartner_ID.Identifier | C_BPartner_Location_ID.Identifier | dateordered | poreference | processed | docStatus |
      | shipment_2          | bpartner_1               | bpartnerLocation_1                | 2021-07-20  | po_ref_mock | true      | CO        |

    And validate the created shipment lines
      | Shipment.Identifier | M_Product_ID.Identifier | movementqty | processed |
      | shipment_2          | product_1               | 2           | true      |

    And validate created invoices
      | Invoice.Identifier | C_BPartner_ID.Identifier | C_BPartner_Location_ID.Identifier | OPT.POReference | paymentTerm | processed | docStatus |
      | invoice_1          | bpartner_1               | bpartnerLocation_1                | po_ref_mock     | 1000002     | true      | CO        |

    And validate created invoice lines
      | Invoice.Identifier | M_Product_ID.Identifier | qtyinvoiced | processed |
      | invoice_1          | product_1               | 8           | true      |
      | invoice_1          | product_1               | 2           | true      |