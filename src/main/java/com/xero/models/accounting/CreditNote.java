/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.accounting;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.models.accounting.Allocation;
import com.xero.models.accounting.Contact;
import com.xero.models.accounting.CurrencyCode;
import com.xero.models.accounting.LineAmountTypes;
import com.xero.models.accounting.LineItem;
import com.xero.models.accounting.Payment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * CreditNote
 */

public class CreditNote {
  /**
   * See Credit Note Types
   */
  public enum TypeEnum {
    ACCPAYCREDIT("ACCPAYCREDIT"),
    
    ACCRECCREDIT("ACCRECCREDIT");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  
  @JsonProperty("Type")
  private TypeEnum type;

  
  @JsonProperty("Contact")
  private Contact contact = null;

  @JsonDeserialize(using = com.xero.api.CustomDateDeserializer.class)
  @JsonProperty("Date")
  private LocalDate date;

  /**
   * See Credit Note Status Codes
   */
  public enum StatusEnum {
    DRAFT("DRAFT"),
    
    SUBMITTED("SUBMITTED"),
    
    DELETED("DELETED"),
    
    AUTHORISED("AUTHORISED"),
    
    PAID("PAID"),
    
    VOIDED("VOIDED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  
  @JsonProperty("Status")
  private StatusEnum status;

  
  @JsonProperty("LineAmountTypes")
  private LineAmountTypes lineAmountTypes = null;

  
  @JsonProperty("LineItems")
  private List<LineItem> lineItems = null;

  
  @JsonProperty("SubTotal")
  private Double subTotal;

  
  @JsonProperty("TotalTax")
  private Double totalTax;

  
  @JsonProperty("Total")
  private Double total;

  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
  @JsonProperty("UpdatedDateUTC")
  private OffsetDateTime updatedDateUTC;

  
  @JsonProperty("CurrencyCode")
  private CurrencyCode currencyCode = null;

  @JsonDeserialize(using = com.xero.api.CustomDateDeserializer.class)
  @JsonProperty("FullyPaidOnDate")
  private LocalDate fullyPaidOnDate;

  
  @JsonProperty("CreditNoteID")
  private UUID creditNoteID;

  
  @JsonProperty("CreditNoteNumber")
  private String creditNoteNumber;

  
  @JsonProperty("Reference")
  private String reference;

  
  @JsonProperty("SentToContact")
  private Boolean sentToContact;

  
  @JsonProperty("CurrencyRate")
  private Double currencyRate;

  
  @JsonProperty("RemainingCredit")
  private Double remainingCredit;

  
  @JsonProperty("Allocations")
  private List<Allocation> allocations = null;

  
  @JsonProperty("Payments")
  private List<Payment> payments = null;

  
  @JsonProperty("BrandingThemeID")
  private UUID brandingThemeID;

  
  @JsonProperty("HasAttachments")
  private Boolean hasAttachments;

  public CreditNote type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * See Credit Note Types
   * @return type
  **/
  @ApiModelProperty(value = "See Credit Note Types")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public CreditNote contact(Contact contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @ApiModelProperty(value = "")
  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public CreditNote date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * The date the credit note is issued YYYY-MM-DD. If the Date element is not specified then it will default to the current date based on the timezone setting of the organisation
   * @return date
  **/
  @ApiModelProperty(value = "The date the credit note is issued YYYY-MM-DD. If the Date element is not specified then it will default to the current date based on the timezone setting of the organisation")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public CreditNote status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * See Credit Note Status Codes
   * @return status
  **/
  @ApiModelProperty(value = "See Credit Note Status Codes")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public CreditNote lineAmountTypes(LineAmountTypes lineAmountTypes) {
    this.lineAmountTypes = lineAmountTypes;
    return this;
  }

   /**
   * Get lineAmountTypes
   * @return lineAmountTypes
  **/
  @ApiModelProperty(value = "")
  public LineAmountTypes getLineAmountTypes() {
    return lineAmountTypes;
  }

  public void setLineAmountTypes(LineAmountTypes lineAmountTypes) {
    this.lineAmountTypes = lineAmountTypes;
  }

  public CreditNote lineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public CreditNote addLineItemsItem(LineItem lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<LineItem>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * See Invoice Line Items
   * @return lineItems
  **/
  @ApiModelProperty(value = "See Invoice Line Items")
  public List<LineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
  }

  public CreditNote subTotal(Double subTotal) {
    this.subTotal = subTotal;
    return this;
  }

   /**
   * The subtotal of the credit note excluding taxes
   * @return subTotal
  **/
  @ApiModelProperty(value = "The subtotal of the credit note excluding taxes")
  public Double getSubTotal() {
    return subTotal;
  }

  public void setSubTotal(Double subTotal) {
    this.subTotal = subTotal;
  }

  public CreditNote totalTax(Double totalTax) {
    this.totalTax = totalTax;
    return this;
  }

   /**
   * The total tax on the credit note
   * @return totalTax
  **/
  @ApiModelProperty(value = "The total tax on the credit note")
  public Double getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(Double totalTax) {
    this.totalTax = totalTax;
  }

  public CreditNote total(Double total) {
    this.total = total;
    return this;
  }

   /**
   * The total of the Credit Note(subtotal + total tax)
   * @return total
  **/
  @ApiModelProperty(value = "The total of the Credit Note(subtotal + total tax)")
  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }

  public CreditNote updatedDateUTC(OffsetDateTime updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
    return this;
  }

   /**
   * UTC timestamp of last update to the credit note
   * @return updatedDateUTC
  **/
  @ApiModelProperty(value = "UTC timestamp of last update to the credit note")
  public OffsetDateTime getUpdatedDateUTC() {
    return updatedDateUTC;
  }

  public void setUpdatedDateUTC(OffsetDateTime updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
  }

  public CreditNote currencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(value = "")
  public CurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  public CreditNote fullyPaidOnDate(LocalDate fullyPaidOnDate) {
    this.fullyPaidOnDate = fullyPaidOnDate;
    return this;
  }

   /**
   * Date when credit note was fully paid(UTC format)
   * @return fullyPaidOnDate
  **/
  @ApiModelProperty(value = "Date when credit note was fully paid(UTC format)")
  public LocalDate getFullyPaidOnDate() {
    return fullyPaidOnDate;
  }

  public void setFullyPaidOnDate(LocalDate fullyPaidOnDate) {
    this.fullyPaidOnDate = fullyPaidOnDate;
  }

  public CreditNote creditNoteID(UUID creditNoteID) {
    this.creditNoteID = creditNoteID;
    return this;
  }

   /**
   * Xero generated unique identifier
   * @return creditNoteID
  **/
  @ApiModelProperty(value = "Xero generated unique identifier")
  public UUID getCreditNoteID() {
    return creditNoteID;
  }

  public void setCreditNoteID(UUID creditNoteID) {
    this.creditNoteID = creditNoteID;
  }

  public CreditNote creditNoteNumber(String creditNoteNumber) {
    this.creditNoteNumber = creditNoteNumber;
    return this;
  }

   /**
   * ACCRECCREDIT – Unique alpha numeric code identifying credit note (when missing will auto-generate from your Organisation Invoice Settings)
   * @return creditNoteNumber
  **/
  @ApiModelProperty(value = "ACCRECCREDIT – Unique alpha numeric code identifying credit note (when missing will auto-generate from your Organisation Invoice Settings)")
  public String getCreditNoteNumber() {
    return creditNoteNumber;
  }

  public void setCreditNoteNumber(String creditNoteNumber) {
    this.creditNoteNumber = creditNoteNumber;
  }

  public CreditNote reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * ACCRECCREDIT only – additional reference number
   * @return reference
  **/
  @ApiModelProperty(value = "ACCRECCREDIT only – additional reference number")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

   /**
   * boolean to indicate if a credit note has been sent to a contact via  the Xero app (currently read only)
   * @return sentToContact
  **/
  @ApiModelProperty(value = "boolean to indicate if a credit note has been sent to a contact via  the Xero app (currently read only)")
  public Boolean getSentToContact() {
    return sentToContact;
  }

  public CreditNote currencyRate(Double currencyRate) {
    this.currencyRate = currencyRate;
    return this;
  }

   /**
   * The currency rate for a multicurrency invoice. If no rate is specified, the XE.com day rate is used
   * @return currencyRate
  **/
  @ApiModelProperty(value = "The currency rate for a multicurrency invoice. If no rate is specified, the XE.com day rate is used")
  public Double getCurrencyRate() {
    return currencyRate;
  }

  public void setCurrencyRate(Double currencyRate) {
    this.currencyRate = currencyRate;
  }

  public CreditNote remainingCredit(Double remainingCredit) {
    this.remainingCredit = remainingCredit;
    return this;
  }

   /**
   * The remaining credit balance on the Credit Note
   * @return remainingCredit
  **/
  @ApiModelProperty(value = "The remaining credit balance on the Credit Note")
  public Double getRemainingCredit() {
    return remainingCredit;
  }

  public void setRemainingCredit(Double remainingCredit) {
    this.remainingCredit = remainingCredit;
  }

  public CreditNote allocations(List<Allocation> allocations) {
    this.allocations = allocations;
    return this;
  }

  public CreditNote addAllocationsItem(Allocation allocationsItem) {
    if (this.allocations == null) {
      this.allocations = new ArrayList<Allocation>();
    }
    this.allocations.add(allocationsItem);
    return this;
  }

   /**
   * See Allocations
   * @return allocations
  **/
  @ApiModelProperty(value = "See Allocations")
  public List<Allocation> getAllocations() {
    return allocations;
  }

  public void setAllocations(List<Allocation> allocations) {
    this.allocations = allocations;
  }

  public CreditNote payments(List<Payment> payments) {
    this.payments = payments;
    return this;
  }

  public CreditNote addPaymentsItem(Payment paymentsItem) {
    if (this.payments == null) {
      this.payments = new ArrayList<Payment>();
    }
    this.payments.add(paymentsItem);
    return this;
  }

   /**
   * See Payments
   * @return payments
  **/
  @ApiModelProperty(value = "See Payments")
  public List<Payment> getPayments() {
    return payments;
  }

  public void setPayments(List<Payment> payments) {
    this.payments = payments;
  }

  public CreditNote brandingThemeID(UUID brandingThemeID) {
    this.brandingThemeID = brandingThemeID;
    return this;
  }

   /**
   * See BrandingThemes
   * @return brandingThemeID
  **/
  @ApiModelProperty(value = "See BrandingThemes")
  public UUID getBrandingThemeID() {
    return brandingThemeID;
  }

  public void setBrandingThemeID(UUID brandingThemeID) {
    this.brandingThemeID = brandingThemeID;
  }

  public CreditNote hasAttachments(Boolean hasAttachments) {
    this.hasAttachments = hasAttachments;
    return this;
  }

   /**
   * boolean to indicate if a credit note has an attachment
   * @return hasAttachments
  **/
  @ApiModelProperty(value = "boolean to indicate if a credit note has an attachment")
  public Boolean getHasAttachments() {
    return hasAttachments;
  }

  public void setHasAttachments(Boolean hasAttachments) {
    this.hasAttachments = hasAttachments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditNote creditNote = (CreditNote) o;
    return Objects.equals(this.type, creditNote.type) &&
        Objects.equals(this.contact, creditNote.contact) &&
        Objects.equals(this.date, creditNote.date) &&
        Objects.equals(this.status, creditNote.status) &&
        Objects.equals(this.lineAmountTypes, creditNote.lineAmountTypes) &&
        Objects.equals(this.lineItems, creditNote.lineItems) &&
        Objects.equals(this.subTotal, creditNote.subTotal) &&
        Objects.equals(this.totalTax, creditNote.totalTax) &&
        Objects.equals(this.total, creditNote.total) &&
        Objects.equals(this.updatedDateUTC, creditNote.updatedDateUTC) &&
        Objects.equals(this.currencyCode, creditNote.currencyCode) &&
        Objects.equals(this.fullyPaidOnDate, creditNote.fullyPaidOnDate) &&
        Objects.equals(this.creditNoteID, creditNote.creditNoteID) &&
        Objects.equals(this.creditNoteNumber, creditNote.creditNoteNumber) &&
        Objects.equals(this.reference, creditNote.reference) &&
        Objects.equals(this.sentToContact, creditNote.sentToContact) &&
        Objects.equals(this.currencyRate, creditNote.currencyRate) &&
        Objects.equals(this.remainingCredit, creditNote.remainingCredit) &&
        Objects.equals(this.allocations, creditNote.allocations) &&
        Objects.equals(this.payments, creditNote.payments) &&
        Objects.equals(this.brandingThemeID, creditNote.brandingThemeID) &&
        Objects.equals(this.hasAttachments, creditNote.hasAttachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, contact, date, status, lineAmountTypes, lineItems, subTotal, totalTax, total, updatedDateUTC, currencyCode, fullyPaidOnDate, creditNoteID, creditNoteNumber, reference, sentToContact, currencyRate, remainingCredit, allocations, payments, brandingThemeID, hasAttachments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditNote {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lineAmountTypes: ").append(toIndentedString(lineAmountTypes)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    subTotal: ").append(toIndentedString(subTotal)).append("\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    fullyPaidOnDate: ").append(toIndentedString(fullyPaidOnDate)).append("\n");
    sb.append("    creditNoteID: ").append(toIndentedString(creditNoteID)).append("\n");
    sb.append("    creditNoteNumber: ").append(toIndentedString(creditNoteNumber)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    sentToContact: ").append(toIndentedString(sentToContact)).append("\n");
    sb.append("    currencyRate: ").append(toIndentedString(currencyRate)).append("\n");
    sb.append("    remainingCredit: ").append(toIndentedString(remainingCredit)).append("\n");
    sb.append("    allocations: ").append(toIndentedString(allocations)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    brandingThemeID: ").append(toIndentedString(brandingThemeID)).append("\n");
    sb.append("    hasAttachments: ").append(toIndentedString(hasAttachments)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

