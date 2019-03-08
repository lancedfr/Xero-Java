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
import com.xero.models.accounting.Contact;
import com.xero.models.accounting.LineAmountTypes;
import com.xero.models.accounting.LineItem;
import com.xero.models.accounting.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Receipt
 */

public class Receipt {
  @JsonDeserialize(using = com.xero.api.CustomDateDeserializer.class)
  @JsonProperty("Date")
  private LocalDate date;

  
  @JsonProperty("Contact")
  private Contact contact = null;

  
  @JsonProperty("Lineitems")
  private List<LineItem> lineitems = new ArrayList<LineItem>();

  
  @JsonProperty("User")
  private User user = null;

  
  @JsonProperty("Reference")
  private String reference;

  
  @JsonProperty("LineAmountTypes")
  private LineAmountTypes lineAmountTypes = null;

  
  @JsonProperty("SubTotal")
  private Double subTotal;

  
  @JsonProperty("TotalTax")
  private Double totalTax;

  
  @JsonProperty("Total")
  private Double total;

  
  @JsonProperty("ReceiptID")
  private UUID receiptID;

  /**
   * Current status of receipt – see status types
   */
  public enum StatusEnum {
    DRAFT("DRAFT"),
    
    SUBMITTED("SUBMITTED"),
    
    AUTHORIZED("AUTHORIZED"),
    
    DECLINED("DECLINED");

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

  
  @JsonProperty("ReceiptNumber")
  private String receiptNumber;

  @JsonDeserialize(using = com.xero.api.CustomOffsetDateTimeDeserializer.class)
  @JsonProperty("UpdatedDateUTC")
  private OffsetDateTime updatedDateUTC;

  
  @JsonProperty("HasAttachments")
  private Boolean hasAttachments;

  
  @JsonProperty("Url")
  private String url;

  public Receipt date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Date of receipt – YYYY-MM-DD
   * @return date
  **/
  @ApiModelProperty(required = true, value = "Date of receipt – YYYY-MM-DD")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public Receipt contact(Contact contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @ApiModelProperty(required = true, value = "")
  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public Receipt lineitems(List<LineItem> lineitems) {
    this.lineitems = lineitems;
    return this;
  }

  public Receipt addLineitemsItem(LineItem lineitemsItem) {
    this.lineitems.add(lineitemsItem);
    return this;
  }

   /**
   * Get lineitems
   * @return lineitems
  **/
  @ApiModelProperty(required = true, value = "")
  public List<LineItem> getLineitems() {
    return lineitems;
  }

  public void setLineitems(List<LineItem> lineitems) {
    this.lineitems = lineitems;
  }

  public Receipt user(User user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(required = true, value = "")
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
   * @return reference
  **/
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
   * @return lineAmountTypes
  **/
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
   * @return subTotal
  **/
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
   * @return totalTax
  **/
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
   * @return total
  **/
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
   * @return receiptID
  **/
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
   * @return status
  **/
  @ApiModelProperty(value = "Current status of receipt – see status types")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

   /**
   * Xero generated sequence number for receipt in current claim for a given user
   * @return receiptNumber
  **/
  @ApiModelProperty(value = "Xero generated sequence number for receipt in current claim for a given user")
  public String getReceiptNumber() {
    return receiptNumber;
  }

   /**
   * Last modified date UTC format
   * @return updatedDateUTC
  **/
  @ApiModelProperty(value = "Last modified date UTC format")
  public OffsetDateTime getUpdatedDateUTC() {
    return updatedDateUTC;
  }

   /**
   * boolean to indicate if a receipt has an attachment
   * @return hasAttachments
  **/
  @ApiModelProperty(value = "boolean to indicate if a receipt has an attachment")
  public Boolean getHasAttachments() {
    return hasAttachments;
  }

   /**
   * URL link to a source document – shown as “Go to [appName]” in the Xero app
   * @return url
  **/
  @ApiModelProperty(value = "URL link to a source document – shown as “Go to [appName]” in the Xero app")
  public String getUrl() {
    return url;
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
    return Objects.equals(this.date, receipt.date) &&
        Objects.equals(this.contact, receipt.contact) &&
        Objects.equals(this.lineitems, receipt.lineitems) &&
        Objects.equals(this.user, receipt.user) &&
        Objects.equals(this.reference, receipt.reference) &&
        Objects.equals(this.lineAmountTypes, receipt.lineAmountTypes) &&
        Objects.equals(this.subTotal, receipt.subTotal) &&
        Objects.equals(this.totalTax, receipt.totalTax) &&
        Objects.equals(this.total, receipt.total) &&
        Objects.equals(this.receiptID, receipt.receiptID) &&
        Objects.equals(this.status, receipt.status) &&
        Objects.equals(this.receiptNumber, receipt.receiptNumber) &&
        Objects.equals(this.updatedDateUTC, receipt.updatedDateUTC) &&
        Objects.equals(this.hasAttachments, receipt.hasAttachments) &&
        Objects.equals(this.url, receipt.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, contact, lineitems, user, reference, lineAmountTypes, subTotal, totalTax, total, receiptID, status, receiptNumber, updatedDateUTC, hasAttachments, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Receipt {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    lineitems: ").append(toIndentedString(lineitems)).append("\n");
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

