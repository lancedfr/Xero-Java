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
import java.time.LocalDate;

/** LeavePeriod */
public class LeavePeriod {
  StringUtil util = new StringUtil();

  @JsonProperty("periodStartDate")
  private LocalDate periodStartDate;

  @JsonProperty("periodEndDate")
  private LocalDate periodEndDate;

  @JsonProperty("numberOfUnits")
  private Double numberOfUnits;
  /** Period Status */
  public enum PeriodStatusEnum {
    APPROVED("Approved"),

    COMPLETED("Completed");

    private String value;

    PeriodStatusEnum(String value) {
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
    public static PeriodStatusEnum fromValue(String value) {
      for (PeriodStatusEnum b : PeriodStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("periodStatus")
  private PeriodStatusEnum periodStatus;

  public LeavePeriod periodStartDate(LocalDate periodStartDate) {
    this.periodStartDate = periodStartDate;
    return this;
  }

  /**
   * The Pay Period Start Date (YYYY-MM-DD)
   *
   * @return periodStartDate
   */
  @ApiModelProperty(value = "The Pay Period Start Date (YYYY-MM-DD)")
  public LocalDate getPeriodStartDate() {
    return periodStartDate;
  }

  public void setPeriodStartDate(LocalDate periodStartDate) {
    this.periodStartDate = periodStartDate;
  }

  public LeavePeriod periodEndDate(LocalDate periodEndDate) {
    this.periodEndDate = periodEndDate;
    return this;
  }

  /**
   * The Pay Period End Date (YYYY-MM-DD)
   *
   * @return periodEndDate
   */
  @ApiModelProperty(value = "The Pay Period End Date (YYYY-MM-DD)")
  public LocalDate getPeriodEndDate() {
    return periodEndDate;
  }

  public void setPeriodEndDate(LocalDate periodEndDate) {
    this.periodEndDate = periodEndDate;
  }

  public LeavePeriod numberOfUnits(Double numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
    return this;
  }

  /**
   * The Number of Units for the leave
   *
   * @return numberOfUnits
   */
  @ApiModelProperty(value = "The Number of Units for the leave")
  public Double getNumberOfUnits() {
    return numberOfUnits;
  }

  public void setNumberOfUnits(Double numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
  }

  public LeavePeriod periodStatus(PeriodStatusEnum periodStatus) {
    this.periodStatus = periodStatus;
    return this;
  }

  /**
   * Period Status
   *
   * @return periodStatus
   */
  @ApiModelProperty(value = "Period Status")
  public PeriodStatusEnum getPeriodStatus() {
    return periodStatus;
  }

  public void setPeriodStatus(PeriodStatusEnum periodStatus) {
    this.periodStatus = periodStatus;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeavePeriod leavePeriod = (LeavePeriod) o;
    return Objects.equals(this.periodStartDate, leavePeriod.periodStartDate)
        && Objects.equals(this.periodEndDate, leavePeriod.periodEndDate)
        && Objects.equals(this.numberOfUnits, leavePeriod.numberOfUnits)
        && Objects.equals(this.periodStatus, leavePeriod.periodStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodStartDate, periodEndDate, numberOfUnits, periodStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeavePeriod {\n");
    sb.append("    periodStartDate: ").append(toIndentedString(periodStartDate)).append("\n");
    sb.append("    periodEndDate: ").append(toIndentedString(periodEndDate)).append("\n");
    sb.append("    numberOfUnits: ").append(toIndentedString(numberOfUnits)).append("\n");
    sb.append("    periodStatus: ").append(toIndentedString(periodStatus)).append("\n");
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
