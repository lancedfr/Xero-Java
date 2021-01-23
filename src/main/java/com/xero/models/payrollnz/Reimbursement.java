/*
 * Xero Payroll NZ
 * This is the Xero Payroll API for orgs in the NZ region.
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrollnz;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.UUID;

/** Reimbursement */
public class Reimbursement {
  StringUtil util = new StringUtil();

  @JsonProperty("reimbursementID")
  private UUID reimbursementID;

  @JsonProperty("name")
  private String name;

  @JsonProperty("accountID")
  private UUID accountID;

  @JsonProperty("currentRecord")
  private Boolean currentRecord;
  /** See Reimbursement Categories */
  public enum ReimbursementCategoryEnum {
    GST("GST"),

    NOGST("NoGST"),

    GSTINCLUSIVE("GSTInclusive");

    private String value;

    ReimbursementCategoryEnum(String value) {
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
    public static ReimbursementCategoryEnum fromValue(String value) {
      for (ReimbursementCategoryEnum b : ReimbursementCategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("reimbursementCategory")
  private ReimbursementCategoryEnum reimbursementCategory;
  /** See Calculation Types */
  public enum CalculationTypeEnum {
    UNKNOWN("Unknown"),

    FIXEDAMOUNT("FixedAmount"),

    RATEPERUNIT("RatePerUnit");

    private String value;

    CalculationTypeEnum(String value) {
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
    public static CalculationTypeEnum fromValue(String value) {
      for (CalculationTypeEnum b : CalculationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("calculationType")
  private CalculationTypeEnum calculationType;

  @JsonProperty("standardAmount")
  private String standardAmount;
  /** Optional Type Of Units. Applicable when calculation type is Rate Per Unit */
  public enum StandardTypeOfUnitsEnum {
    HOURS("Hours"),

    KM("km");

    private String value;

    StandardTypeOfUnitsEnum(String value) {
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
    public static StandardTypeOfUnitsEnum fromValue(String value) {
      for (StandardTypeOfUnitsEnum b : StandardTypeOfUnitsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("standardTypeOfUnits")
  private StandardTypeOfUnitsEnum standardTypeOfUnits;

  @JsonProperty("standardRatePerUnit")
  private Double standardRatePerUnit;

  public Reimbursement reimbursementID(UUID reimbursementID) {
    this.reimbursementID = reimbursementID;
    return this;
  }

  /**
   * Xero unique identifier for a reimbursement
   *
   * @return reimbursementID
   */
  @ApiModelProperty(value = "Xero unique identifier for a reimbursement")
  public UUID getReimbursementID() {
    return reimbursementID;
  }

  public void setReimbursementID(UUID reimbursementID) {
    this.reimbursementID = reimbursementID;
  }

  public Reimbursement name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the reimbursement
   *
   * @return name
   */
  @ApiModelProperty(required = true, value = "Name of the reimbursement")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Reimbursement accountID(UUID accountID) {
    this.accountID = accountID;
    return this;
  }

  /**
   * Xero unique identifier for the account used for the reimbursement
   *
   * @return accountID
   */
  @ApiModelProperty(
      required = true,
      value = "Xero unique identifier for the account used for the reimbursement")
  public UUID getAccountID() {
    return accountID;
  }

  public void setAccountID(UUID accountID) {
    this.accountID = accountID;
  }

  public Reimbursement currentRecord(Boolean currentRecord) {
    this.currentRecord = currentRecord;
    return this;
  }

  /**
   * Indicates that whether the reimbursement is active
   *
   * @return currentRecord
   */
  @ApiModelProperty(value = "Indicates that whether the reimbursement is active")
  public Boolean getCurrentRecord() {
    return currentRecord;
  }

  public void setCurrentRecord(Boolean currentRecord) {
    this.currentRecord = currentRecord;
  }

  public Reimbursement reimbursementCategory(ReimbursementCategoryEnum reimbursementCategory) {
    this.reimbursementCategory = reimbursementCategory;
    return this;
  }

  /**
   * See Reimbursement Categories
   *
   * @return reimbursementCategory
   */
  @ApiModelProperty(value = "See Reimbursement Categories")
  public ReimbursementCategoryEnum getReimbursementCategory() {
    return reimbursementCategory;
  }

  public void setReimbursementCategory(ReimbursementCategoryEnum reimbursementCategory) {
    this.reimbursementCategory = reimbursementCategory;
  }

  public Reimbursement calculationType(CalculationTypeEnum calculationType) {
    this.calculationType = calculationType;
    return this;
  }

  /**
   * See Calculation Types
   *
   * @return calculationType
   */
  @ApiModelProperty(value = "See Calculation Types")
  public CalculationTypeEnum getCalculationType() {
    return calculationType;
  }

  public void setCalculationType(CalculationTypeEnum calculationType) {
    this.calculationType = calculationType;
  }

  public Reimbursement standardAmount(String standardAmount) {
    this.standardAmount = standardAmount;
    return this;
  }

  /**
   * Optional Fixed Rate Amount. Applicable when calculation type is Fixed Amount
   *
   * @return standardAmount
   */
  @ApiModelProperty(
      value = "Optional Fixed Rate Amount. Applicable when calculation type is Fixed Amount")
  public String getStandardAmount() {
    return standardAmount;
  }

  public void setStandardAmount(String standardAmount) {
    this.standardAmount = standardAmount;
  }

  public Reimbursement standardTypeOfUnits(StandardTypeOfUnitsEnum standardTypeOfUnits) {
    this.standardTypeOfUnits = standardTypeOfUnits;
    return this;
  }

  /**
   * Optional Type Of Units. Applicable when calculation type is Rate Per Unit
   *
   * @return standardTypeOfUnits
   */
  @ApiModelProperty(
      value = "Optional Type Of Units. Applicable when calculation type is Rate Per Unit")
  public StandardTypeOfUnitsEnum getStandardTypeOfUnits() {
    return standardTypeOfUnits;
  }

  public void setStandardTypeOfUnits(StandardTypeOfUnitsEnum standardTypeOfUnits) {
    this.standardTypeOfUnits = standardTypeOfUnits;
  }

  public Reimbursement standardRatePerUnit(Double standardRatePerUnit) {
    this.standardRatePerUnit = standardRatePerUnit;
    return this;
  }

  /**
   * Optional Rate Per Unit. Applicable when calculation type is Rate Per Unit
   *
   * @return standardRatePerUnit
   */
  @ApiModelProperty(
      value = "Optional Rate Per Unit. Applicable when calculation type is Rate Per Unit")
  public Double getStandardRatePerUnit() {
    return standardRatePerUnit;
  }

  public void setStandardRatePerUnit(Double standardRatePerUnit) {
    this.standardRatePerUnit = standardRatePerUnit;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reimbursement reimbursement = (Reimbursement) o;
    return Objects.equals(this.reimbursementID, reimbursement.reimbursementID)
        && Objects.equals(this.name, reimbursement.name)
        && Objects.equals(this.accountID, reimbursement.accountID)
        && Objects.equals(this.currentRecord, reimbursement.currentRecord)
        && Objects.equals(this.reimbursementCategory, reimbursement.reimbursementCategory)
        && Objects.equals(this.calculationType, reimbursement.calculationType)
        && Objects.equals(this.standardAmount, reimbursement.standardAmount)
        && Objects.equals(this.standardTypeOfUnits, reimbursement.standardTypeOfUnits)
        && Objects.equals(this.standardRatePerUnit, reimbursement.standardRatePerUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        reimbursementID,
        name,
        accountID,
        currentRecord,
        reimbursementCategory,
        calculationType,
        standardAmount,
        standardTypeOfUnits,
        standardRatePerUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reimbursement {\n");
    sb.append("    reimbursementID: ").append(toIndentedString(reimbursementID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accountID: ").append(toIndentedString(accountID)).append("\n");
    sb.append("    currentRecord: ").append(toIndentedString(currentRecord)).append("\n");
    sb.append("    reimbursementCategory: ")
        .append(toIndentedString(reimbursementCategory))
        .append("\n");
    sb.append("    calculationType: ").append(toIndentedString(calculationType)).append("\n");
    sb.append("    standardAmount: ").append(toIndentedString(standardAmount)).append("\n");
    sb.append("    standardTypeOfUnits: ")
        .append(toIndentedString(standardTypeOfUnits))
        .append("\n");
    sb.append("    standardRatePerUnit: ")
        .append(toIndentedString(standardRatePerUnit))
        .append("\n");
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
