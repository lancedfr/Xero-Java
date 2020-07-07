/*
 * Xero Payroll AU
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * The version of the OpenAPI document: 2.2.6
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrollau;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.ZoneId;

/** LeavePeriod */
public class LeavePeriod {
  StringUtil util = new StringUtil();

  @JsonProperty("NumberOfUnits")
  private Double numberOfUnits;

  @JsonProperty("PayPeriodEndDate")
  private String payPeriodEndDate;

  @JsonProperty("PayPeriodStartDate")
  private String payPeriodStartDate;

  @JsonProperty("LeavePeriodStatus")
  private LeavePeriodStatus leavePeriodStatus;

  public LeavePeriod numberOfUnits(Double numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
    return this;
  }

  /**
   * The Number of Units for the leave
   *
   * @return numberOfUnits
   */
  @ApiModelProperty(example = "22.8", value = "The Number of Units for the leave")
  public Double getNumberOfUnits() {
    return numberOfUnits;
  }

  public void setNumberOfUnits(Double numberOfUnits) {
    this.numberOfUnits = numberOfUnits;
  }

  public LeavePeriod payPeriodEndDate(String payPeriodEndDate) {
    this.payPeriodEndDate = payPeriodEndDate;
    return this;
  }

  /**
   * The Pay Period End Date (YYYY-MM-DD)
   *
   * @return payPeriodEndDate
   */
  @ApiModelProperty(
      example = "/Date(322560000000+0000)/",
      value = "The Pay Period End Date (YYYY-MM-DD)")
  public String getPayPeriodEndDate() {
    return payPeriodEndDate;
  }

  public LocalDate getPayPeriodEndDateAsDate() {
    if (this.payPeriodEndDate != null) {
      try {
        return util.convertStringToDate(this.payPeriodEndDate);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  public void setPayPeriodEndDate(String payPeriodEndDate) {
    this.payPeriodEndDate = payPeriodEndDate;
  }

  public void setPayPeriodEndDate(LocalDate payPeriodEndDate) {
    // CONVERT LocalDate args into MS DateFromat String
    Instant instant = payPeriodEndDate.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();
    long timeInMillis = instant.toEpochMilli();

    this.payPeriodEndDate = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

  public LeavePeriod payPeriodStartDate(String payPeriodStartDate) {
    this.payPeriodStartDate = payPeriodStartDate;
    return this;
  }

  /**
   * The Pay Period Start Date (YYYY-MM-DD)
   *
   * @return payPeriodStartDate
   */
  @ApiModelProperty(
      example = "/Date(322560000000+0000)/",
      value = "The Pay Period Start Date (YYYY-MM-DD)")
  public String getPayPeriodStartDate() {
    return payPeriodStartDate;
  }

  public LocalDate getPayPeriodStartDateAsDate() {
    if (this.payPeriodStartDate != null) {
      try {
        return util.convertStringToDate(this.payPeriodStartDate);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  public void setPayPeriodStartDate(String payPeriodStartDate) {
    this.payPeriodStartDate = payPeriodStartDate;
  }

  public void setPayPeriodStartDate(LocalDate payPeriodStartDate) {
    // CONVERT LocalDate args into MS DateFromat String
    Instant instant = payPeriodStartDate.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();
    long timeInMillis = instant.toEpochMilli();

    this.payPeriodStartDate = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

  public LeavePeriod leavePeriodStatus(LeavePeriodStatus leavePeriodStatus) {
    this.leavePeriodStatus = leavePeriodStatus;
    return this;
  }

  /**
   * Get leavePeriodStatus
   *
   * @return leavePeriodStatus
   */
  @ApiModelProperty(value = "")
  public LeavePeriodStatus getLeavePeriodStatus() {
    return leavePeriodStatus;
  }

  public void setLeavePeriodStatus(LeavePeriodStatus leavePeriodStatus) {
    this.leavePeriodStatus = leavePeriodStatus;
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
    return Objects.equals(this.numberOfUnits, leavePeriod.numberOfUnits)
        && Objects.equals(this.payPeriodEndDate, leavePeriod.payPeriodEndDate)
        && Objects.equals(this.payPeriodStartDate, leavePeriod.payPeriodStartDate)
        && Objects.equals(this.leavePeriodStatus, leavePeriod.leavePeriodStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfUnits, payPeriodEndDate, payPeriodStartDate, leavePeriodStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeavePeriod {\n");
    sb.append("    numberOfUnits: ").append(toIndentedString(numberOfUnits)).append("\n");
    sb.append("    payPeriodEndDate: ").append(toIndentedString(payPeriodEndDate)).append("\n");
    sb.append("    payPeriodStartDate: ").append(toIndentedString(payPeriodStartDate)).append("\n");
    sb.append("    leavePeriodStatus: ").append(toIndentedString(leavePeriodStatus)).append("\n");
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
