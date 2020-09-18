/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.2.15
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.accounting;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/** Element */
public class Element {
  StringUtil util = new StringUtil();

  @JsonProperty("ValidationErrors")
  private List<ValidationError> validationErrors = new ArrayList<ValidationError>();

  @JsonProperty("BatchPaymentID")
  private UUID batchPaymentID;

  @JsonProperty("BankTransactionID")
  private UUID bankTransactionID;

  @JsonProperty("CreditNoteID")
  private UUID creditNoteID;

  @JsonProperty("ContactID")
  private UUID contactID;

  @JsonProperty("InvoiceID")
  private UUID invoiceID;

  @JsonProperty("ItemID")
  private UUID itemID;

  @JsonProperty("PurchaseOrderID")
  private UUID purchaseOrderID;

  public Element validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public Element addValidationErrorsItem(ValidationError validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new ArrayList<ValidationError>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

  /**
   * Array of Validation Error message
   *
   * @return validationErrors
   */
  @ApiModelProperty(value = "Array of Validation Error message")
  public List<ValidationError> getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
  }

  public Element batchPaymentID(UUID batchPaymentID) {
    this.batchPaymentID = batchPaymentID;
    return this;
  }

  /**
   * Unique ID for batch payment object with validation error
   *
   * @return batchPaymentID
   */
  @ApiModelProperty(value = "Unique ID for batch payment object with validation error")
  public UUID getBatchPaymentID() {
    return batchPaymentID;
  }

  public void setBatchPaymentID(UUID batchPaymentID) {
    this.batchPaymentID = batchPaymentID;
  }

  public Element bankTransactionID(UUID bankTransactionID) {
    this.bankTransactionID = bankTransactionID;
    return this;
  }

  /**
   * Get bankTransactionID
   *
   * @return bankTransactionID
   */
  @ApiModelProperty(value = "")
  public UUID getBankTransactionID() {
    return bankTransactionID;
  }

  public void setBankTransactionID(UUID bankTransactionID) {
    this.bankTransactionID = bankTransactionID;
  }

  public Element creditNoteID(UUID creditNoteID) {
    this.creditNoteID = creditNoteID;
    return this;
  }

  /**
   * Get creditNoteID
   *
   * @return creditNoteID
   */
  @ApiModelProperty(value = "")
  public UUID getCreditNoteID() {
    return creditNoteID;
  }

  public void setCreditNoteID(UUID creditNoteID) {
    this.creditNoteID = creditNoteID;
  }

  public Element contactID(UUID contactID) {
    this.contactID = contactID;
    return this;
  }

  /**
   * Get contactID
   *
   * @return contactID
   */
  @ApiModelProperty(value = "")
  public UUID getContactID() {
    return contactID;
  }

  public void setContactID(UUID contactID) {
    this.contactID = contactID;
  }

  public Element invoiceID(UUID invoiceID) {
    this.invoiceID = invoiceID;
    return this;
  }

  /**
   * Get invoiceID
   *
   * @return invoiceID
   */
  @ApiModelProperty(value = "")
  public UUID getInvoiceID() {
    return invoiceID;
  }

  public void setInvoiceID(UUID invoiceID) {
    this.invoiceID = invoiceID;
  }

  public Element itemID(UUID itemID) {
    this.itemID = itemID;
    return this;
  }

  /**
   * Get itemID
   *
   * @return itemID
   */
  @ApiModelProperty(value = "")
  public UUID getItemID() {
    return itemID;
  }

  public void setItemID(UUID itemID) {
    this.itemID = itemID;
  }

  public Element purchaseOrderID(UUID purchaseOrderID) {
    this.purchaseOrderID = purchaseOrderID;
    return this;
  }

  /**
   * Get purchaseOrderID
   *
   * @return purchaseOrderID
   */
  @ApiModelProperty(value = "")
  public UUID getPurchaseOrderID() {
    return purchaseOrderID;
  }

  public void setPurchaseOrderID(UUID purchaseOrderID) {
    this.purchaseOrderID = purchaseOrderID;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Element element = (Element) o;
    return Objects.equals(this.validationErrors, element.validationErrors)
        && Objects.equals(this.batchPaymentID, element.batchPaymentID)
        && Objects.equals(this.bankTransactionID, element.bankTransactionID)
        && Objects.equals(this.creditNoteID, element.creditNoteID)
        && Objects.equals(this.contactID, element.contactID)
        && Objects.equals(this.invoiceID, element.invoiceID)
        && Objects.equals(this.itemID, element.itemID)
        && Objects.equals(this.purchaseOrderID, element.purchaseOrderID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        validationErrors,
        batchPaymentID,
        bankTransactionID,
        creditNoteID,
        contactID,
        invoiceID,
        itemID,
        purchaseOrderID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Element {\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
    sb.append("    batchPaymentID: ").append(toIndentedString(batchPaymentID)).append("\n");
    sb.append("    bankTransactionID: ").append(toIndentedString(bankTransactionID)).append("\n");
    sb.append("    creditNoteID: ").append(toIndentedString(creditNoteID)).append("\n");
    sb.append("    contactID: ").append(toIndentedString(contactID)).append("\n");
    sb.append("    invoiceID: ").append(toIndentedString(invoiceID)).append("\n");
    sb.append("    itemID: ").append(toIndentedString(itemID)).append("\n");
    sb.append("    purchaseOrderID: ").append(toIndentedString(purchaseOrderID)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
