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
import com.xero.models.accounting.AccountType;
import com.xero.models.accounting.TaxType;
import com.xero.models.accounting.TrackingCategory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * JournalLine
 */

public class JournalLine {
  
  @JsonProperty("JournalLineID")
  private UUID journalLineID;

  
  @JsonProperty("AccountID")
  private UUID accountID;

  
  @JsonProperty("AccountCode")
  private String accountCode;

  
  @JsonProperty("AccountType")
  private AccountType accountType = null;

  
  @JsonProperty("AccountName")
  private String accountName;

  
  @JsonProperty("Description")
  private String description;

  
  @JsonProperty("NetAmount")
  private Float netAmount;

  
  @JsonProperty("GrossAmount")
  private Float grossAmount;

  
  @JsonProperty("TaxAmount")
  private Float taxAmount;

  
  @JsonProperty("TaxType")
  private TaxType taxType = null;

  
  @JsonProperty("TaxName")
  private String taxName;

  
  @JsonProperty("TrackingCategories")
  private List<TrackingCategory> trackingCategories = null;

  public JournalLine journalLineID(UUID journalLineID) {
    this.journalLineID = journalLineID;
    return this;
  }

   /**
   * Xero identifier for Journal
   * @return journalLineID
  **/
  @ApiModelProperty(example = "7be9db36-3598-4755-ba5c-c2dbc8c4a7a2", value = "Xero identifier for Journal")
  public UUID getJournalLineID() {
    return journalLineID;
  }

  public void setJournalLineID(UUID journalLineID) {
    this.journalLineID = journalLineID;
  }

  public JournalLine accountID(UUID accountID) {
    this.accountID = accountID;
    return this;
  }

   /**
   * See Accounts
   * @return accountID
  **/
  @ApiModelProperty(example = "ceef66a5-a545-413b-9312-78a53caadbc4", value = "See Accounts")
  public UUID getAccountID() {
    return accountID;
  }

  public void setAccountID(UUID accountID) {
    this.accountID = accountID;
  }

  public JournalLine accountCode(String accountCode) {
    this.accountCode = accountCode;
    return this;
  }

   /**
   * See Accounts
   * @return accountCode
  **/
  @ApiModelProperty(example = "90.0", value = "See Accounts")
  public String getAccountCode() {
    return accountCode;
  }

  public void setAccountCode(String accountCode) {
    this.accountCode = accountCode;
  }

  public JournalLine accountType(AccountType accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @ApiModelProperty(value = "")
  public AccountType getAccountType() {
    return accountType;
  }

  public void setAccountType(AccountType accountType) {
    this.accountType = accountType;
  }

  public JournalLine accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * See AccountCodes
   * @return accountName
  **/
  @ApiModelProperty(example = "Checking Account", value = "See AccountCodes")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public JournalLine description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description from the source transaction line item. Only returned if populated.
   * @return description
  **/
  @ApiModelProperty(example = "My business checking account", value = "The description from the source transaction line item. Only returned if populated.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public JournalLine netAmount(Float netAmount) {
    this.netAmount = netAmount;
    return this;
  }

   /**
   * Net amount of journal line. This will be a positive value for a debit and negative for a credit
   * @return netAmount
  **/
  @ApiModelProperty(example = "4130.98", value = "Net amount of journal line. This will be a positive value for a debit and negative for a credit")
  public Float getNetAmount() {
    return netAmount;
  }

  public void setNetAmount(Float netAmount) {
    this.netAmount = netAmount;
  }

  public JournalLine grossAmount(Float grossAmount) {
    this.grossAmount = grossAmount;
    return this;
  }

   /**
   * Gross amount of journal line (NetAmount + TaxAmount).
   * @return grossAmount
  **/
  @ApiModelProperty(example = "4130.98", value = "Gross amount of journal line (NetAmount + TaxAmount).")
  public Float getGrossAmount() {
    return grossAmount;
  }

  public void setGrossAmount(Float grossAmount) {
    this.grossAmount = grossAmount;
  }

   /**
   * Total tax on a journal line
   * @return taxAmount
  **/
  @ApiModelProperty(example = "0.0", value = "Total tax on a journal line")
  public Float getTaxAmount() {
    return taxAmount;
  }

  public JournalLine taxType(TaxType taxType) {
    this.taxType = taxType;
    return this;
  }

   /**
   * Get taxType
   * @return taxType
  **/
  @ApiModelProperty(value = "")
  public TaxType getTaxType() {
    return taxType;
  }

  public void setTaxType(TaxType taxType) {
    this.taxType = taxType;
  }

  public JournalLine taxName(String taxName) {
    this.taxName = taxName;
    return this;
  }

   /**
   * see TaxRates
   * @return taxName
  **/
  @ApiModelProperty(example = "Tax Exempt", value = "see TaxRates")
  public String getTaxName() {
    return taxName;
  }

  public void setTaxName(String taxName) {
    this.taxName = taxName;
  }

  public JournalLine trackingCategories(List<TrackingCategory> trackingCategories) {
    this.trackingCategories = trackingCategories;
    return this;
  }

  public JournalLine addTrackingCategoriesItem(TrackingCategory trackingCategoriesItem) {
    if (this.trackingCategories == null) {
      this.trackingCategories = new ArrayList<TrackingCategory>();
    }
    this.trackingCategories.add(trackingCategoriesItem);
    return this;
  }

   /**
   * Optional Tracking Category – see Tracking. Any JournalLine can have a maximum of 2 &lt;TrackingCategory&gt; elements.
   * @return trackingCategories
  **/
  @ApiModelProperty(value = "Optional Tracking Category – see Tracking. Any JournalLine can have a maximum of 2 <TrackingCategory> elements.")
  public List<TrackingCategory> getTrackingCategories() {
    return trackingCategories;
  }

  public void setTrackingCategories(List<TrackingCategory> trackingCategories) {
    this.trackingCategories = trackingCategories;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JournalLine journalLine = (JournalLine) o;
    return Objects.equals(this.journalLineID, journalLine.journalLineID) &&
        Objects.equals(this.accountID, journalLine.accountID) &&
        Objects.equals(this.accountCode, journalLine.accountCode) &&
        Objects.equals(this.accountType, journalLine.accountType) &&
        Objects.equals(this.accountName, journalLine.accountName) &&
        Objects.equals(this.description, journalLine.description) &&
        Objects.equals(this.netAmount, journalLine.netAmount) &&
        Objects.equals(this.grossAmount, journalLine.grossAmount) &&
        Objects.equals(this.taxAmount, journalLine.taxAmount) &&
        Objects.equals(this.taxType, journalLine.taxType) &&
        Objects.equals(this.taxName, journalLine.taxName) &&
        Objects.equals(this.trackingCategories, journalLine.trackingCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(journalLineID, accountID, accountCode, accountType, accountName, description, netAmount, grossAmount, taxAmount, taxType, taxName, trackingCategories);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JournalLine {\n");
    
    sb.append("    journalLineID: ").append(toIndentedString(journalLineID)).append("\n");
    sb.append("    accountID: ").append(toIndentedString(accountID)).append("\n");
    sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    netAmount: ").append(toIndentedString(netAmount)).append("\n");
    sb.append("    grossAmount: ").append(toIndentedString(grossAmount)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
    sb.append("    taxName: ").append(toIndentedString(taxName)).append("\n");
    sb.append("    trackingCategories: ").append(toIndentedString(trackingCategories)).append("\n");
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

