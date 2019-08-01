/*
 * #%L
 * metasfresh-e2e
 * %%
 * Copyright (C) 2019 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program. If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

/// <reference types="Cypress" />

import { getLanguageSpecific } from '../../support/utils/utils';
import { salesInvoices } from '../../page_objects/sales_invoices';
import { SalesInvoice, SalesInvoiceLine } from '../../support/utils/sales_invoice';
import { DocumentActionKey, DocumentStatusKey } from '../../support/utils/constants';

describe('Create Adjustment Charge price difference (Nachbelastung Preisdifferenz) for Sales Invoice', function() {
  const adjustmentChargePriceDifference = 'Nachbelastung - Preisdifferenz';
  let originalSalesInvoiceNumber;
  let originalPriceList;
  let originalCurrency;
  let originalProduct;
  let originalSalesInvoiceID;

  let originalSalesInvoiceTotalAmount;
  let newTotalAmount;

  const newProductPrice = '0.123456'; // must be lower than the original price

  // Sales Invoice
  const salesInvoiceTargetDocumentType = 'Sales Invoice';
  const businessPartnerName = 'Test Lieferant 1';
  const productName = 'Convenience Salat 250g';
  const originalQuantity = 200;

  before(function() {
    // This wait is stupid.
    // It also appears to be a good workaround for the problems in
    // cypress/support/utils/utils.js:1
    cy.wait(5000);
  });

  it('Prepare sales invoice', function() {
    cy.fixture('sales/sales_invoice.json').then(salesInvoiceJson => {
      new SalesInvoice(businessPartnerName, salesInvoiceTargetDocumentType)
        .addLine(
          new SalesInvoiceLine().setProduct(productName).setQuantity(originalQuantity)
          // todo @dh: how to add a "per test" packing item
          // .setPackingItem('IFCO 6410 x 10 Stk')
          // .setTuQuantity(2)
        )
        // .addLine(
        // todo @dh: how to add this line which depends on the packing item?
        //   new SalesInvoiceLine()
        //     .setProduct('IFCO 6410_P001512')
        //     .setQuantity(2)
        // )
        // .setPriceList(priceListName)
        .setDocumentAction(getLanguageSpecific(salesInvoiceJson, DocumentActionKey.Complete))
        .setDocumentStatus(getLanguageSpecific(salesInvoiceJson, DocumentStatusKey.Completed))
        .apply();
    });

    // this is stupid. it seems that with cypress you can ONLY read the alias in the same "it" block. so i cannot retrieve my aliases
    // in an organised (to be read "sane") fashion inside 'Save values needed for the next step', but must do it here, even though
    // this step should only create the SI.
    // WAT??!!
    cy.get('@newInvoiceDocumentId').then(function({ documentId /* this is destructuring */ }) {
      originalSalesInvoiceID = documentId;
      cy.log(`originalSalesInvoiceID is ${originalSalesInvoiceID}`);
    });
  });

  it('Sales Invoice is Completed', function() {
    cy.expectDocumentStatus(DocumentStatusKey.Completed);
  });

  it('Sales Invoice is not paid', function() {
    cy.getCheckboxValue('IsPaid').then(checkBoxValue => {
      cy.log(`IsPaid = ${checkBoxValue}`);
      assert.equal(checkBoxValue, false);
    });
  });

  it('Save values needed for the next steps', function() {
    cy.getStringFieldValue('DocumentNo').then(documentNumber => {
      originalSalesInvoiceNumber = documentNumber;
    });

    cy.getStringFieldValue('M_PriceList_ID').then(priceList => {
      originalPriceList = priceList;
    });

    cy.getStringFieldValue('C_Currency_ID').then(currency => {
      originalCurrency = currency;
    });

    cy.selectTab('C_InvoiceLine');
    cy.selectSingleTabRow();
    cy.openAdvancedEdit();
    cy.getStringFieldValue('M_Product_ID', true).then(product => {
      // this needs to be saved again because the UI may show more text than the one from `productName`
      originalProduct = product;
    });

    // cy.getStringFieldValue('QtyEntered', true).then(qty => {
    //   originalQuantity = qty;
    // });

    cy.get('.header-breadcrumb-sitename').then(si => {
      originalSalesInvoiceTotalAmount = parseFloat(si.html().split(' ')[2]); // the format is "DOC_NO MM/DD/YYYY total"
    });
    cy.pressDoneButton();
  });

  it('Create the Adjustment Charge', function() {
    cy.executeHeaderActionWithDialog('C_Invoice_Create_AdjustmentCharge');

    cy.selectInListField('C_DocType_ID', adjustmentChargePriceDifference, true, null, true);

    cy.pressStartButton(100);
  });

  it('Open the Referenced Sales Invoice documents', function() {
    cy.openReferencedDocuments('AD_RelationType_ID-540184');
  });

  it('Expect there is only 1 Sales Invoice row and open it', function() {
    salesInvoices.getRows().should('have.length', 1);

    // select the first Table Row and click it (open it)
    salesInvoices
      .getRows()
      .eq(0)
      .dblclick();
  });

  it('The Sales Invoice is an Adjustment Charge price difference ', function() {
    cy.expectDocumentStatus(DocumentStatusKey.Drafted);
    cy.getStringFieldValue('C_DocTypeTarget_ID').should('be.equal', adjustmentChargePriceDifference);
  });

  it('Has the same properties and reference to the original', function() {
    cy.getStringFieldValue('DocumentNo').should('not.be.equal', originalSalesInvoiceNumber);
    cy.getStringFieldValue('M_PriceList_ID').should('be.equal', originalPriceList);
    cy.getStringFieldValue('C_Currency_ID').should('be.equal', originalCurrency);
  });

  it('Has the same properties and reference to the original -- Advanced edit', function() {
    cy.openAdvancedEdit();
    cy.getStringFieldValue('Ref_Invoice_ID', true).should('be.equal', originalSalesInvoiceNumber);
    cy.pressDoneButton();
  });

  it('Has the same properties and reference to the original -- Line advanced edit', function() {
    cy.selectTab('C_InvoiceLine');
    cy.selectSingleTabRow();
    cy.openAdvancedEdit();
    cy.getStringFieldValue('M_Product_ID', true).should('be.equal', originalProduct);
    cy.getStringFieldValue('QtyEntered', true).should('be.equal', originalQuantity.toString(10));
    cy.pressDoneButton();
  });

  it('Set a lower price for that product (Price rectification)', function() {
    cy.selectTab('C_InvoiceLine');
    cy.selectSingleTabRow();
    cy.openAdvancedEdit();
    cy.writeIntoStringField('PriceEntered', newProductPrice, true, null, true);
    cy.pressDoneButton(200);
  });

  it('Save the new total amount', function() {
    cy.get('.header-breadcrumb-sitename').then(function(si) {
      newTotalAmount = parseFloat(si.html().split(' ')[2]); // the format is "DOC_NO MM/DD/YYYY total"
    });
  });

  it('Complete the Adjustment Charge SI', function() {
    // complete it and verify the status
    cy.fixture('misc/misc_dictionary.json').then(miscDictionary => {
      cy.processDocument(
        getLanguageSpecific(miscDictionary, DocumentActionKey.Complete),
        getLanguageSpecific(miscDictionary, DocumentStatusKey.Completed)
      );
    });
  });

  it('Total amount should be lower than the original SI', function() {
    expect(newTotalAmount).lessThan(originalSalesInvoiceTotalAmount);
  });

  it('Adjustment Charge SI is not paid', function() {
    cy.getCheckboxValue('IsPaid').then(checkBoxValue => {
      cy.log(`IsPaid = ${checkBoxValue}`);
      assert.equal(checkBoxValue, false);
    });
  });

  it('Original Sales Invoice is not paid', function() {
    cy.visitWindow('167', originalSalesInvoiceID);
    cy.getCheckboxValue('IsPaid').then(checkBoxValue => {
      cy.log(`IsPaid = ${checkBoxValue}`);
      assert.equal(checkBoxValue, false);
    });
  });
});
