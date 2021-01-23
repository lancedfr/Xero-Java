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

/** Benefit */
public class Benefit {
  StringUtil util = new StringUtil();

  @JsonProperty("id")
  private UUID id;

  @JsonProperty("name")
  private String name;
  /** Superannuations Category type */
  public enum CategoryEnum {
    KIWISAVER("KiwiSaver"),

    COMPLYINGFUND("ComplyingFund"),

    OTHER("Other");

    private String value;

    CategoryEnum(String value) {
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
    public static CategoryEnum fromValue(String value) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("category")
  private CategoryEnum category;

  @JsonProperty("liabilityAccountId")
  private UUID liabilityAccountId;

  @JsonProperty("expenseAccountId")
  private UUID expenseAccountId;
  /** Calculation Type of the superannuation either FixedAmount or PercentageOfTaxableEarnings */
  public enum CalculationTypeNZEnum {
    FIXEDAMOUNT("FixedAmount"),

    PERCENTAGEOFTAXABLEEARNINGS("PercentageOfTaxableEarnings");

    private String value;

    CalculationTypeNZEnum(String value) {
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
    public static CalculationTypeNZEnum fromValue(String value) {
      for (CalculationTypeNZEnum b : CalculationTypeNZEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("calculationTypeNZ")
  private CalculationTypeNZEnum calculationTypeNZ;

  @JsonProperty("standardAmount")
  private Double standardAmount;

  @JsonProperty("percentage")
  private Double percentage;

  @JsonProperty("companyMax")
  private Double companyMax;

  @JsonProperty("currentRecord")
  private Boolean currentRecord;

  public Benefit id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The Xero identifier for superannuation
   *
   * @return id
   */
  @ApiModelProperty(value = "The Xero identifier for superannuation")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Benefit name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the superannuations
   *
   * @return name
   */
  @ApiModelProperty(required = true, value = "Name of the superannuations")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Benefit category(CategoryEnum category) {
    this.category = category;
    return this;
  }

  /**
   * Superannuations Category type
   *
   * @return category
   */
  @ApiModelProperty(required = true, value = "Superannuations Category type")
  public CategoryEnum getCategory() {
    return category;
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  public Benefit liabilityAccountId(UUID liabilityAccountId) {
    this.liabilityAccountId = liabilityAccountId;
    return this;
  }

  /**
   * Xero identifier for Liability Account
   *
   * @return liabilityAccountId
   */
  @ApiModelProperty(required = true, value = "Xero identifier for Liability Account")
  public UUID getLiabilityAccountId() {
    return liabilityAccountId;
  }

  public void setLiabilityAccountId(UUID liabilityAccountId) {
    this.liabilityAccountId = liabilityAccountId;
  }

  public Benefit expenseAccountId(UUID expenseAccountId) {
    this.expenseAccountId = expenseAccountId;
    return this;
  }

  /**
   * Xero identifier for Expense Account
   *
   * @return expenseAccountId
   */
  @ApiModelProperty(required = true, value = "Xero identifier for Expense Account")
  public UUID getExpenseAccountId() {
    return expenseAccountId;
  }

  public void setExpenseAccountId(UUID expenseAccountId) {
    this.expenseAccountId = expenseAccountId;
  }

  public Benefit calculationTypeNZ(CalculationTypeNZEnum calculationTypeNZ) {
    this.calculationTypeNZ = calculationTypeNZ;
    return this;
  }

  /**
   * Calculation Type of the superannuation either FixedAmount or PercentageOfTaxableEarnings
   *
   * @return calculationTypeNZ
   */
  @ApiModelProperty(
      value =
          "Calculation Type of the superannuation either FixedAmount or"
              + " PercentageOfTaxableEarnings")
  public CalculationTypeNZEnum getCalculationTypeNZ() {
    return calculationTypeNZ;
  }

  public void setCalculationTypeNZ(CalculationTypeNZEnum calculationTypeNZ) {
    this.calculationTypeNZ = calculationTypeNZ;
  }

  public Benefit standardAmount(Double standardAmount) {
    this.standardAmount = standardAmount;
    return this;
  }

  /**
   * Standard amount of the superannuation
   *
   * @return standardAmount
   */
  @ApiModelProperty(value = "Standard amount of the superannuation")
  public Double getStandardAmount() {
    return standardAmount;
  }

  public void setStandardAmount(Double standardAmount) {
    this.standardAmount = standardAmount;
  }

  public Benefit percentage(Double percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * Percentage of Taxable Earnings of the superannuation
   *
   * @return percentage
   */
  @ApiModelProperty(value = "Percentage of Taxable Earnings of the superannuation")
  public Double getPercentage() {
    return percentage;
  }

  public void setPercentage(Double percentage) {
    this.percentage = percentage;
  }

  public Benefit companyMax(Double companyMax) {
    this.companyMax = companyMax;
    return this;
  }

  /**
   * Company Maximum amount of the superannuation
   *
   * @return companyMax
   */
  @ApiModelProperty(value = "Company Maximum amount of the superannuation")
  public Double getCompanyMax() {
    return companyMax;
  }

  public void setCompanyMax(Double companyMax) {
    this.companyMax = companyMax;
  }

  public Benefit currentRecord(Boolean currentRecord) {
    this.currentRecord = currentRecord;
    return this;
  }

  /**
   * Identifier of a record is active or not.
   *
   * @return currentRecord
   */
  @ApiModelProperty(value = "Identifier of a record is active or not.")
  public Boolean getCurrentRecord() {
    return currentRecord;
  }

  public void setCurrentRecord(Boolean currentRecord) {
    this.currentRecord = currentRecord;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Benefit benefit = (Benefit) o;
    return Objects.equals(this.id, benefit.id)
        && Objects.equals(this.name, benefit.name)
        && Objects.equals(this.category, benefit.category)
        && Objects.equals(this.liabilityAccountId, benefit.liabilityAccountId)
        && Objects.equals(this.expenseAccountId, benefit.expenseAccountId)
        && Objects.equals(this.calculationTypeNZ, benefit.calculationTypeNZ)
        && Objects.equals(this.standardAmount, benefit.standardAmount)
        && Objects.equals(this.percentage, benefit.percentage)
        && Objects.equals(this.companyMax, benefit.companyMax)
        && Objects.equals(this.currentRecord, benefit.currentRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        id,
        name,
        category,
        liabilityAccountId,
        expenseAccountId,
        calculationTypeNZ,
        standardAmount,
        percentage,
        companyMax,
        currentRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Benefit {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    liabilityAccountId: ").append(toIndentedString(liabilityAccountId)).append("\n");
    sb.append("    expenseAccountId: ").append(toIndentedString(expenseAccountId)).append("\n");
    sb.append("    calculationTypeNZ: ").append(toIndentedString(calculationTypeNZ)).append("\n");
    sb.append("    standardAmount: ").append(toIndentedString(standardAmount)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    companyMax: ").append(toIndentedString(companyMax)).append("\n");
    sb.append("    currentRecord: ").append(toIndentedString(currentRecord)).append("\n");
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
