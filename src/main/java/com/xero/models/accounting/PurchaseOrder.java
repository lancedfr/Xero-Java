/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.2.6
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.accounting;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZoneId;

/** PurchaseOrder */
public class PurchaseOrder {
  StringUtil util = new StringUtil();

  @JsonProperty("Contact")
  private Contact contact;

  @JsonProperty("LineItems")
  private List<LineItem> lineItems = new ArrayList<LineItem>();

  @JsonProperty("Date")
  private String date;

  @JsonProperty("DeliveryDate")
  private String deliveryDate;

  @JsonProperty("LineAmountTypes")
  private LineAmountTypes lineAmountTypes;

  @JsonProperty("PurchaseOrderNumber")
  private String purchaseOrderNumber;

  @JsonProperty("Reference")
  private String reference;

  @JsonProperty("BrandingThemeID")
  private UUID brandingThemeID;

  @JsonProperty("CurrencyCode")
  private CurrencyCode currencyCode;
  /** See Purchase Order Status Codes */
  public enum StatusEnum {
    DRAFT("DRAFT"),

    SUBMITTED("SUBMITTED"),

    AUTHORISED("AUTHORISED"),

    BILLED("BILLED"),

    DELETED("DELETED");

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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("Status")
  private StatusEnum status;

  @JsonProperty("SentToContact")
  private Boolean sentToContact;

  @JsonProperty("DeliveryAddress")
  private String deliveryAddress;

  @JsonProperty("AttentionTo")
  private String attentionTo;

  @JsonProperty("Telephone")
  private String telephone;

  @JsonProperty("DeliveryInstructions")
  private String deliveryInstructions;

  @JsonProperty("ExpectedArrivalDate")
  private String expectedArrivalDate;

  @JsonProperty("PurchaseOrderID")
  private UUID purchaseOrderID;

  @JsonProperty("CurrencyRate")
  private Double currencyRate;

  @JsonProperty("SubTotal")
  private Double subTotal;

  @JsonProperty("TotalTax")
  private Double totalTax;

  @JsonProperty("Total")
  private Double total;

  @JsonProperty("TotalDiscount")
  private Double totalDiscount;

  @JsonProperty("HasAttachments")
  private Boolean hasAttachments = false;

  @JsonProperty("UpdatedDateUTC")
  private String updatedDateUTC;

  @JsonProperty("StatusAttributeString")
  private String statusAttributeString;

  @JsonProperty("ValidationErrors")
  private List<ValidationError> validationErrors = new ArrayList<ValidationError>();

  @JsonProperty("Warnings")
  private List<ValidationError> warnings = new ArrayList<ValidationError>();

  @JsonProperty("Attachments")
  private List<Attachment> attachments = new ArrayList<Attachment>();

  public PurchaseOrder contact(Contact contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Get contact
   *
   * @return contact
   */
  @ApiModelProperty(value = "")
  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public PurchaseOrder lineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public PurchaseOrder addLineItemsItem(LineItem lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<LineItem>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

  /**
   * See LineItems
   *
   * @return lineItems
   */
  @ApiModelProperty(value = "See LineItems")
  public List<LineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
  }

  public PurchaseOrder date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Date purchase order was issued – YYYY-MM-DD. If the Date element is not specified then it will
   * default to the current date based on the timezone setting of the organisation
   *
   * @return date
   */
  @ApiModelProperty(
      value =
          "Date purchase order was issued – YYYY-MM-DD. If the Date element is not specified then"
              + " it will default to the current date based on the timezone setting of the"
              + " organisation")
  public String getDate() {
    return date;
  }

  public LocalDate getDateAsDate() {
    if (this.date != null) {
      try {
        return util.convertStringToDate(this.date);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public void setDate(LocalDate date) {
    // CONVERT LocalDate args into MS DateFromat String
    Instant instant = date.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();
    long timeInMillis = instant.toEpochMilli();

    this.date = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

  public PurchaseOrder deliveryDate(String deliveryDate) {
    this.deliveryDate = deliveryDate;
    return this;
  }

  /**
   * Date the goods are to be delivered – YYYY-MM-DD
   *
   * @return deliveryDate
   */
  @ApiModelProperty(value = "Date the goods are to be delivered – YYYY-MM-DD")
  public String getDeliveryDate() {
    return deliveryDate;
  }

  public LocalDate getDeliveryDateAsDate() {
    if (this.deliveryDate != null) {
      try {
        return util.convertStringToDate(this.deliveryDate);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  public void setDeliveryDate(String deliveryDate) {
    this.deliveryDate = deliveryDate;
  }

  public void setDeliveryDate(LocalDate deliveryDate) {
    // CONVERT LocalDate args into MS DateFromat String
    Instant instant = deliveryDate.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();
    long timeInMillis = instant.toEpochMilli();

    this.deliveryDate = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

  public PurchaseOrder lineAmountTypes(LineAmountTypes lineAmountTypes) {
    this.lineAmountTypes = lineAmountTypes;
    return this;
  }

  /**
   * Get lineAmountTypes
   *
   * @return lineAmountTypes
   */
  @ApiModelProperty(value = "")
  public LineAmountTypes getLineAmountTypes() {
    return lineAmountTypes;
  }

  public void setLineAmountTypes(LineAmountTypes lineAmountTypes) {
    this.lineAmountTypes = lineAmountTypes;
  }

  public PurchaseOrder purchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
    return this;
  }

  /**
   * Unique alpha numeric code identifying purchase order (when missing will auto-generate from your
   * Organisation Invoice Settings)
   *
   * @return purchaseOrderNumber
   */
  @ApiModelProperty(
      value =
          "Unique alpha numeric code identifying purchase order (when missing will auto-generate"
              + " from your Organisation Invoice Settings)")
  public String getPurchaseOrderNumber() {
    return purchaseOrderNumber;
  }

  public void setPurchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
  }

  public PurchaseOrder reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Additional reference number
   *
   * @return reference
   */
  @ApiModelProperty(value = "Additional reference number")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public PurchaseOrder brandingThemeID(UUID brandingThemeID) {
    this.brandingThemeID = brandingThemeID;
    return this;
  }

  /**
   * See BrandingThemes
   *
   * @return brandingThemeID
   */
  @ApiModelProperty(value = "See BrandingThemes")
  public UUID getBrandingThemeID() {
    return brandingThemeID;
  }

  public void setBrandingThemeID(UUID brandingThemeID) {
    this.brandingThemeID = brandingThemeID;
  }

  public PurchaseOrder currencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Get currencyCode
   *
   * @return currencyCode
   */
  @ApiModelProperty(value = "")
  public CurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  public PurchaseOrder status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * See Purchase Order Status Codes
   *
   * @return status
   */
  @ApiModelProperty(value = "See Purchase Order Status Codes")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public PurchaseOrder sentToContact(Boolean sentToContact) {
    this.sentToContact = sentToContact;
    return this;
  }

  /**
   * Boolean to set whether the purchase order should be marked as “sent”. This can be set only on
   * purchase orders that have been approved or billed
   *
   * @return sentToContact
   */
  @ApiModelProperty(
      value =
          "Boolean to set whether the purchase order should be marked as “sent”. This can be set"
              + " only on purchase orders that have been approved or billed")
  public Boolean getSentToContact() {
    return sentToContact;
  }

  public void setSentToContact(Boolean sentToContact) {
    this.sentToContact = sentToContact;
  }

  public PurchaseOrder deliveryAddress(String deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
    return this;
  }

  /**
   * The address the goods are to be delivered to
   *
   * @return deliveryAddress
   */
  @ApiModelProperty(value = "The address the goods are to be delivered to")
  public String getDeliveryAddress() {
    return deliveryAddress;
  }

  public void setDeliveryAddress(String deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  public PurchaseOrder attentionTo(String attentionTo) {
    this.attentionTo = attentionTo;
    return this;
  }

  /**
   * The person that the delivery is going to
   *
   * @return attentionTo
   */
  @ApiModelProperty(value = "The person that the delivery is going to")
  public String getAttentionTo() {
    return attentionTo;
  }

  public void setAttentionTo(String attentionTo) {
    this.attentionTo = attentionTo;
  }

  public PurchaseOrder telephone(String telephone) {
    this.telephone = telephone;
    return this;
  }

  /**
   * The phone number for the person accepting the delivery
   *
   * @return telephone
   */
  @ApiModelProperty(value = "The phone number for the person accepting the delivery")
  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public PurchaseOrder deliveryInstructions(String deliveryInstructions) {
    this.deliveryInstructions = deliveryInstructions;
    return this;
  }

  /**
   * A free text feild for instructions (500 characters max)
   *
   * @return deliveryInstructions
   */
  @ApiModelProperty(value = "A free text feild for instructions (500 characters max)")
  public String getDeliveryInstructions() {
    return deliveryInstructions;
  }

  public void setDeliveryInstructions(String deliveryInstructions) {
    this.deliveryInstructions = deliveryInstructions;
  }

  public PurchaseOrder expectedArrivalDate(String expectedArrivalDate) {
    this.expectedArrivalDate = expectedArrivalDate;
    return this;
  }

  /**
   * The date the goods are expected to arrive.
   *
   * @return expectedArrivalDate
   */
  @ApiModelProperty(value = "The date the goods are expected to arrive.")
  public String getExpectedArrivalDate() {
    return expectedArrivalDate;
  }

  public LocalDate getExpectedArrivalDateAsDate() {
    if (this.expectedArrivalDate != null) {
      try {
        return util.convertStringToDate(this.expectedArrivalDate);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  public void setExpectedArrivalDate(String expectedArrivalDate) {
    this.expectedArrivalDate = expectedArrivalDate;
  }

  public void setExpectedArrivalDate(LocalDate expectedArrivalDate) {
    // CONVERT LocalDate args into MS DateFromat String
    Instant instant = expectedArrivalDate.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();
    long timeInMillis = instant.toEpochMilli();

    this.expectedArrivalDate = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

  public PurchaseOrder purchaseOrderID(UUID purchaseOrderID) {
    this.purchaseOrderID = purchaseOrderID;
    return this;
  }

  /**
   * Xero generated unique identifier for purchase order
   *
   * @return purchaseOrderID
   */
  @ApiModelProperty(value = "Xero generated unique identifier for purchase order")
  public UUID getPurchaseOrderID() {
    return purchaseOrderID;
  }

  public void setPurchaseOrderID(UUID purchaseOrderID) {
    this.purchaseOrderID = purchaseOrderID;
  }

  public PurchaseOrder currencyRate(Double currencyRate) {
    this.currencyRate = currencyRate;
    return this;
  }

  /**
   * The currency rate for a multicurrency purchase order. If no rate is specified, the XE.com day
   * rate is used.
   *
   * @return currencyRate
   */
  @ApiModelProperty(
      value =
          "The currency rate for a multicurrency purchase order. If no rate is specified, the"
              + " XE.com day rate is used.")
  public Double getCurrencyRate() {
    return currencyRate;
  }

  public void setCurrencyRate(Double currencyRate) {
    this.currencyRate = currencyRate;
  }

  /**
   * Total of purchase order excluding taxes
   *
   * @return subTotal
   */
  @ApiModelProperty(value = "Total of purchase order excluding taxes")
  public Double getSubTotal() {
    return subTotal;
  }

  /**
   * Total tax on purchase order
   *
   * @return totalTax
   */
  @ApiModelProperty(value = "Total tax on purchase order")
  public Double getTotalTax() {
    return totalTax;
  }

  /**
   * Total of Purchase Order tax inclusive (i.e. SubTotal + TotalTax)
   *
   * @return total
   */
  @ApiModelProperty(value = "Total of Purchase Order tax inclusive (i.e. SubTotal + TotalTax)")
  public Double getTotal() {
    return total;
  }

  /**
   * Total of discounts applied on the purchase order line items
   *
   * @return totalDiscount
   */
  @ApiModelProperty(value = "Total of discounts applied on the purchase order line items")
  public Double getTotalDiscount() {
    return totalDiscount;
  }

  /**
   * boolean to indicate if a purchase order has an attachment
   *
   * @return hasAttachments
   */
  @ApiModelProperty(
      example = "false",
      value = "boolean to indicate if a purchase order has an attachment")
  public Boolean getHasAttachments() {
    return hasAttachments;
  }

  /**
   * Last modified date UTC format
   *
   * @return updatedDateUTC
   */
  @ApiModelProperty(example = "/Date(1573755038314)/", value = "Last modified date UTC format")
  public String getUpdatedDateUTC() {
    return updatedDateUTC;
  }

  public OffsetDateTime getUpdatedDateUTCAsDate() {
    if (this.updatedDateUTC != null) {
      try {
        return util.convertStringToOffsetDateTime(this.updatedDateUTC);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  public PurchaseOrder statusAttributeString(String statusAttributeString) {
    this.statusAttributeString = statusAttributeString;
    return this;
  }

  /**
   * A string to indicate if a invoice status
   *
   * @return statusAttributeString
   */
  @ApiModelProperty(value = "A string to indicate if a invoice status")
  public String getStatusAttributeString() {
    return statusAttributeString;
  }

  public void setStatusAttributeString(String statusAttributeString) {
    this.statusAttributeString = statusAttributeString;
  }

  public PurchaseOrder validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public PurchaseOrder addValidationErrorsItem(ValidationError validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new ArrayList<ValidationError>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

  /**
   * Displays array of validation error messages from the API
   *
   * @return validationErrors
   */
  @ApiModelProperty(value = "Displays array of validation error messages from the API")
  public List<ValidationError> getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
  }

  public PurchaseOrder warnings(List<ValidationError> warnings) {
    this.warnings = warnings;
    return this;
  }

  public PurchaseOrder addWarningsItem(ValidationError warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<ValidationError>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

  /**
   * Displays array of warning messages from the API
   *
   * @return warnings
   */
  @ApiModelProperty(value = "Displays array of warning messages from the API")
  public List<ValidationError> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<ValidationError> warnings) {
    this.warnings = warnings;
  }

  public PurchaseOrder attachments(List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public PurchaseOrder addAttachmentsItem(Attachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<Attachment>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

  /**
   * Displays array of attachments from the API
   *
   * @return attachments
   */
  @ApiModelProperty(value = "Displays array of attachments from the API")
  public List<Attachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseOrder purchaseOrder = (PurchaseOrder) o;
    return Objects.equals(this.contact, purchaseOrder.contact)
        && Objects.equals(this.lineItems, purchaseOrder.lineItems)
        && Objects.equals(this.date, purchaseOrder.date)
        && Objects.equals(this.deliveryDate, purchaseOrder.deliveryDate)
        && Objects.equals(this.lineAmountTypes, purchaseOrder.lineAmountTypes)
        && Objects.equals(this.purchaseOrderNumber, purchaseOrder.purchaseOrderNumber)
        && Objects.equals(this.reference, purchaseOrder.reference)
        && Objects.equals(this.brandingThemeID, purchaseOrder.brandingThemeID)
        && Objects.equals(this.currencyCode, purchaseOrder.currencyCode)
        && Objects.equals(this.status, purchaseOrder.status)
        && Objects.equals(this.sentToContact, purchaseOrder.sentToContact)
        && Objects.equals(this.deliveryAddress, purchaseOrder.deliveryAddress)
        && Objects.equals(this.attentionTo, purchaseOrder.attentionTo)
        && Objects.equals(this.telephone, purchaseOrder.telephone)
        && Objects.equals(this.deliveryInstructions, purchaseOrder.deliveryInstructions)
        && Objects.equals(this.expectedArrivalDate, purchaseOrder.expectedArrivalDate)
        && Objects.equals(this.purchaseOrderID, purchaseOrder.purchaseOrderID)
        && Objects.equals(this.currencyRate, purchaseOrder.currencyRate)
        && Objects.equals(this.subTotal, purchaseOrder.subTotal)
        && Objects.equals(this.totalTax, purchaseOrder.totalTax)
        && Objects.equals(this.total, purchaseOrder.total)
        && Objects.equals(this.totalDiscount, purchaseOrder.totalDiscount)
        && Objects.equals(this.hasAttachments, purchaseOrder.hasAttachments)
        && Objects.equals(this.updatedDateUTC, purchaseOrder.updatedDateUTC)
        && Objects.equals(this.statusAttributeString, purchaseOrder.statusAttributeString)
        && Objects.equals(this.validationErrors, purchaseOrder.validationErrors)
        && Objects.equals(this.warnings, purchaseOrder.warnings)
        && Objects.equals(this.attachments, purchaseOrder.attachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        contact,
        lineItems,
        date,
        deliveryDate,
        lineAmountTypes,
        purchaseOrderNumber,
        reference,
        brandingThemeID,
        currencyCode,
        status,
        sentToContact,
        deliveryAddress,
        attentionTo,
        telephone,
        deliveryInstructions,
        expectedArrivalDate,
        purchaseOrderID,
        currencyRate,
        subTotal,
        totalTax,
        total,
        totalDiscount,
        hasAttachments,
        updatedDateUTC,
        statusAttributeString,
        validationErrors,
        warnings,
        attachments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseOrder {\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    deliveryDate: ").append(toIndentedString(deliveryDate)).append("\n");
    sb.append("    lineAmountTypes: ").append(toIndentedString(lineAmountTypes)).append("\n");
    sb.append("    purchaseOrderNumber: ")
        .append(toIndentedString(purchaseOrderNumber))
        .append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    brandingThemeID: ").append(toIndentedString(brandingThemeID)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sentToContact: ").append(toIndentedString(sentToContact)).append("\n");
    sb.append("    deliveryAddress: ").append(toIndentedString(deliveryAddress)).append("\n");
    sb.append("    attentionTo: ").append(toIndentedString(attentionTo)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    deliveryInstructions: ")
        .append(toIndentedString(deliveryInstructions))
        .append("\n");
    sb.append("    expectedArrivalDate: ")
        .append(toIndentedString(expectedArrivalDate))
        .append("\n");
    sb.append("    purchaseOrderID: ").append(toIndentedString(purchaseOrderID)).append("\n");
    sb.append("    currencyRate: ").append(toIndentedString(currencyRate)).append("\n");
    sb.append("    subTotal: ").append(toIndentedString(subTotal)).append("\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    totalDiscount: ").append(toIndentedString(totalDiscount)).append("\n");
    sb.append("    hasAttachments: ").append(toIndentedString(hasAttachments)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    statusAttributeString: ")
        .append(toIndentedString(statusAttributeString))
        .append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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
