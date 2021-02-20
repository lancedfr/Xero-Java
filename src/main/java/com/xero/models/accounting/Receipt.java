/*
 * Xero Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
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
import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneId;

/** Receipt */
public class Receipt {
  StringUtil util = new StringUtil();

  @JsonProperty("Date")
  private String date;

  @JsonProperty("Contact")
  private Contact contact;

  @JsonProperty("LineItems")
  private List<LineItem> lineItems = new ArrayList<LineItem>();

  @JsonProperty("User")
  private User user;

  @JsonProperty("Reference")
  private String reference;

  @JsonProperty("LineAmountTypes")
  private LineAmountTypes lineAmountTypes;

  @JsonProperty("SubTotal")
  private Double subTotal;

  @JsonProperty("TotalTax")
  private Double totalTax;

  @JsonProperty("Total")
  private Double total;

  @JsonProperty("ReceiptID")
  private UUID receiptID;
  /** Current status of receipt – see status types */
  public enum StatusEnum {
    DRAFT("DRAFT"),

    SUBMITTED("SUBMITTED"),

    AUTHORISED("AUTHORISED"),

    DECLINED("DECLINED"),

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

  @JsonProperty("ReceiptNumber")
  private String receiptNumber;

  @JsonProperty("UpdatedDateUTC")
  private String updatedDateUTC;

  @JsonProperty("HasAttachments")
  private Boolean hasAttachments = false;

  @JsonProperty("Url")
  private String url;

  @JsonProperty("ValidationErrors")
  private List<ValidationError> validationErrors = new ArrayList<ValidationError>();

  @JsonProperty("Warnings")
  private List<ValidationError> warnings = new ArrayList<ValidationError>();

  @JsonProperty("Attachments")
  private List<Attachment> attachments = new ArrayList<Attachment>();

  public Receipt date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Date of receipt – YYYY-MM-DD
   *
   * @return date
   */
  @ApiModelProperty(value = "Date of receipt – YYYY-MM-DD")
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

  public Receipt contact(Contact contact) {
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

  public Receipt lineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public Receipt addLineItemsItem(LineItem lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<LineItem>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

  /**
   * Get lineItems
   *
   * @return lineItems
   */
  @ApiModelProperty(value = "")
  public List<LineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<LineItem> lineItems) {
    this.lineItems = lineItems;
  }

  public Receipt user(User user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   *
   * @return user
   */
  @ApiModelProperty(value = "")
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Receipt reference(String reference) {
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

  public Receipt lineAmountTypes(LineAmountTypes lineAmountTypes) {
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

  public Receipt subTotal(Double subTotal) {
    this.subTotal = subTotal;
    return this;
  }

  /**
   * Total of receipt excluding taxes
   *
   * @return subTotal
   */
  @ApiModelProperty(value = "Total of receipt excluding taxes")
  public Double getSubTotal() {
    return subTotal;
  }

  public void setSubTotal(Double subTotal) {
    this.subTotal = subTotal;
  }

  public Receipt totalTax(Double totalTax) {
    this.totalTax = totalTax;
    return this;
  }

  /**
   * Total tax on receipt
   *
   * @return totalTax
   */
  @ApiModelProperty(value = "Total tax on receipt")
  public Double getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(Double totalTax) {
    this.totalTax = totalTax;
  }

  public Receipt total(Double total) {
    this.total = total;
    return this;
  }

  /**
   * Total of receipt tax inclusive (i.e. SubTotal + TotalTax)
   *
   * @return total
   */
  @ApiModelProperty(value = "Total of receipt tax inclusive (i.e. SubTotal + TotalTax)")
  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }

  public Receipt receiptID(UUID receiptID) {
    this.receiptID = receiptID;
    return this;
  }

  /**
   * Xero generated unique identifier for receipt
   *
   * @return receiptID
   */
  @ApiModelProperty(value = "Xero generated unique identifier for receipt")
  public UUID getReceiptID() {
    return receiptID;
  }

  public void setReceiptID(UUID receiptID) {
    this.receiptID = receiptID;
  }

  public Receipt status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Current status of receipt – see status types
   *
   * @return status
   */
  @ApiModelProperty(value = "Current status of receipt – see status types")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * Xero generated sequence number for receipt in current claim for a given user
   *
   * @return receiptNumber
   */
  @ApiModelProperty(
      value = "Xero generated sequence number for receipt in current claim for a given user")
  public String getReceiptNumber() {
    return receiptNumber;
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

  /**
   * boolean to indicate if a receipt has an attachment
   *
   * @return hasAttachments
   */
  @ApiModelProperty(example = "false", value = "boolean to indicate if a receipt has an attachment")
  public Boolean getHasAttachments() {
    return hasAttachments;
  }

  /**
   * URL link to a source document – shown as “Go to [appName]” in the Xero app
   *
   * @return url
   */
  @ApiModelProperty(
      value = "URL link to a source document – shown as “Go to [appName]” in the Xero app")
  public String getUrl() {
    return url;
  }

  public Receipt validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public Receipt addValidationErrorsItem(ValidationError validationErrorsItem) {
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

  public Receipt warnings(List<ValidationError> warnings) {
    this.warnings = warnings;
    return this;
  }

  public Receipt addWarningsItem(ValidationError warningsItem) {
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

  public Receipt attachments(List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public Receipt addAttachmentsItem(Attachment attachmentsItem) {
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
    Receipt receipt = (Receipt) o;
    return Objects.equals(this.date, receipt.date)
        && Objects.equals(this.contact, receipt.contact)
        && Objects.equals(this.lineItems, receipt.lineItems)
        && Objects.equals(this.user, receipt.user)
        && Objects.equals(this.reference, receipt.reference)
        && Objects.equals(this.lineAmountTypes, receipt.lineAmountTypes)
        && Objects.equals(this.subTotal, receipt.subTotal)
        && Objects.equals(this.totalTax, receipt.totalTax)
        && Objects.equals(this.total, receipt.total)
        && Objects.equals(this.receiptID, receipt.receiptID)
        && Objects.equals(this.status, receipt.status)
        && Objects.equals(this.receiptNumber, receipt.receiptNumber)
        && Objects.equals(this.updatedDateUTC, receipt.updatedDateUTC)
        && Objects.equals(this.hasAttachments, receipt.hasAttachments)
        && Objects.equals(this.url, receipt.url)
        && Objects.equals(this.validationErrors, receipt.validationErrors)
        && Objects.equals(this.warnings, receipt.warnings)
        && Objects.equals(this.attachments, receipt.attachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        date,
        contact,
        lineItems,
        user,
        reference,
        lineAmountTypes,
        subTotal,
        totalTax,
        total,
        receiptID,
        status,
        receiptNumber,
        updatedDateUTC,
        hasAttachments,
        url,
        validationErrors,
        warnings,
        attachments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Receipt {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    lineAmountTypes: ").append(toIndentedString(lineAmountTypes)).append("\n");
    sb.append("    subTotal: ").append(toIndentedString(subTotal)).append("\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    receiptID: ").append(toIndentedString(receiptID)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    receiptNumber: ").append(toIndentedString(receiptNumber)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    hasAttachments: ").append(toIndentedString(hasAttachments)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
