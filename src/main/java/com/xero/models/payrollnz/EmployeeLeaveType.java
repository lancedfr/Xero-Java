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

/** EmployeeLeaveType */
public class EmployeeLeaveType {
  StringUtil util = new StringUtil();

  @JsonProperty("leaveTypeID")
  private UUID leaveTypeID;
  /** The schedule of accrual */
  public enum ScheduleOfAccrualEnum {
    ANNUALLYAFTER6MONTHS("AnnuallyAfter6Months"),

    ONANNIVERSARYDATE("OnAnniversaryDate"),

    PERCENTAGEOFGROSSEARNINGS("PercentageOfGrossEarnings"),

    NOACCRUALS("NoAccruals");

    private String value;

    ScheduleOfAccrualEnum(String value) {
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
    public static ScheduleOfAccrualEnum fromValue(String value) {
      for (ScheduleOfAccrualEnum b : ScheduleOfAccrualEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("scheduleOfAccrual")
  private ScheduleOfAccrualEnum scheduleOfAccrual;

  @JsonProperty("hoursAccruedAnnually")
  private Double hoursAccruedAnnually;

  @JsonProperty("maximumToAccrue")
  private Double maximumToAccrue;

  @JsonProperty("openingBalance")
  private Double openingBalance;

  @JsonProperty("rateAccruedHourly")
  private Double rateAccruedHourly;

  @JsonProperty("percentageOfGrossEarnings")
  private Double percentageOfGrossEarnings;

  @JsonProperty("includeHolidayPayEveryPay")
  private Boolean includeHolidayPayEveryPay;

  @JsonProperty("showAnnualLeaveInAdvance")
  private Boolean showAnnualLeaveInAdvance;

  @JsonProperty("annualLeaveTotalAmountPaid")
  private Double annualLeaveTotalAmountPaid;

  public EmployeeLeaveType leaveTypeID(UUID leaveTypeID) {
    this.leaveTypeID = leaveTypeID;
    return this;
  }

  /**
   * The Xero identifier for leave type
   *
   * @return leaveTypeID
   */
  @ApiModelProperty(value = "The Xero identifier for leave type")
  public UUID getLeaveTypeID() {
    return leaveTypeID;
  }

  public void setLeaveTypeID(UUID leaveTypeID) {
    this.leaveTypeID = leaveTypeID;
  }

  public EmployeeLeaveType scheduleOfAccrual(ScheduleOfAccrualEnum scheduleOfAccrual) {
    this.scheduleOfAccrual = scheduleOfAccrual;
    return this;
  }

  /**
   * The schedule of accrual
   *
   * @return scheduleOfAccrual
   */
  @ApiModelProperty(value = "The schedule of accrual")
  public ScheduleOfAccrualEnum getScheduleOfAccrual() {
    return scheduleOfAccrual;
  }

  public void setScheduleOfAccrual(ScheduleOfAccrualEnum scheduleOfAccrual) {
    this.scheduleOfAccrual = scheduleOfAccrual;
  }

  public EmployeeLeaveType hoursAccruedAnnually(Double hoursAccruedAnnually) {
    this.hoursAccruedAnnually = hoursAccruedAnnually;
    return this;
  }

  /**
   * The number of hours accrued for the leave annually. This is 0 when the scheduleOfAccrual chosen
   * is \&quot;OnHourWorked\&quot;
   *
   * @return hoursAccruedAnnually
   */
  @ApiModelProperty(
      value =
          "The number of hours accrued for the leave annually. This is 0 when the"
              + " scheduleOfAccrual chosen is \"OnHourWorked\"")
  public Double getHoursAccruedAnnually() {
    return hoursAccruedAnnually;
  }

  public void setHoursAccruedAnnually(Double hoursAccruedAnnually) {
    this.hoursAccruedAnnually = hoursAccruedAnnually;
  }

  public EmployeeLeaveType maximumToAccrue(Double maximumToAccrue) {
    this.maximumToAccrue = maximumToAccrue;
    return this;
  }

  /**
   * The maximum number of hours that can be accrued for the leave
   *
   * @return maximumToAccrue
   */
  @ApiModelProperty(value = "The maximum number of hours that can be accrued for the leave")
  public Double getMaximumToAccrue() {
    return maximumToAccrue;
  }

  public void setMaximumToAccrue(Double maximumToAccrue) {
    this.maximumToAccrue = maximumToAccrue;
  }

  public EmployeeLeaveType openingBalance(Double openingBalance) {
    this.openingBalance = openingBalance;
    return this;
  }

  /**
   * The initial number of hours assigned when the leave was added to the employee
   *
   * @return openingBalance
   */
  @ApiModelProperty(
      value = "The initial number of hours assigned when the leave was added to the employee")
  public Double getOpeningBalance() {
    return openingBalance;
  }

  public void setOpeningBalance(Double openingBalance) {
    this.openingBalance = openingBalance;
  }

  public EmployeeLeaveType rateAccruedHourly(Double rateAccruedHourly) {
    this.rateAccruedHourly = rateAccruedHourly;
    return this;
  }

  /**
   * The number of hours added to the leave balance for every hour worked by the employee. This is
   * normally 0, unless the scheduleOfAccrual chosen is \&quot;OnHourWorked\&quot;
   *
   * @return rateAccruedHourly
   */
  @ApiModelProperty(
      value =
          "The number of hours added to the leave balance for every hour worked by the employee."
              + " This is normally 0, unless the scheduleOfAccrual chosen is \"OnHourWorked\"")
  public Double getRateAccruedHourly() {
    return rateAccruedHourly;
  }

  public void setRateAccruedHourly(Double rateAccruedHourly) {
    this.rateAccruedHourly = rateAccruedHourly;
  }

  public EmployeeLeaveType percentageOfGrossEarnings(Double percentageOfGrossEarnings) {
    this.percentageOfGrossEarnings = percentageOfGrossEarnings;
    return this;
  }

  /**
   * Specific for scheduleOfAccrual having percentage of gross earnings. Identifies how much
   * percentage of gross earnings is accrued per pay period.
   *
   * @return percentageOfGrossEarnings
   */
  @ApiModelProperty(
      value =
          "Specific for scheduleOfAccrual having percentage of gross earnings. Identifies how much"
              + " percentage of gross earnings is accrued per pay period.")
  public Double getPercentageOfGrossEarnings() {
    return percentageOfGrossEarnings;
  }

  public void setPercentageOfGrossEarnings(Double percentageOfGrossEarnings) {
    this.percentageOfGrossEarnings = percentageOfGrossEarnings;
  }

  public EmployeeLeaveType includeHolidayPayEveryPay(Boolean includeHolidayPayEveryPay) {
    this.includeHolidayPayEveryPay = includeHolidayPayEveryPay;
    return this;
  }

  /**
   * Specific to Holiday pay. Flag determining if pay for leave type is added on each pay run.
   *
   * @return includeHolidayPayEveryPay
   */
  @ApiModelProperty(
      value =
          "Specific to Holiday pay. Flag determining if pay for leave type is added on each pay"
              + " run.")
  public Boolean getIncludeHolidayPayEveryPay() {
    return includeHolidayPayEveryPay;
  }

  public void setIncludeHolidayPayEveryPay(Boolean includeHolidayPayEveryPay) {
    this.includeHolidayPayEveryPay = includeHolidayPayEveryPay;
  }

  public EmployeeLeaveType showAnnualLeaveInAdvance(Boolean showAnnualLeaveInAdvance) {
    this.showAnnualLeaveInAdvance = showAnnualLeaveInAdvance;
    return this;
  }

  /**
   * Specific to Annual Leave. Flag to include leave available to take in advance in the balance in
   * the payslip
   *
   * @return showAnnualLeaveInAdvance
   */
  @ApiModelProperty(
      value =
          "Specific to Annual Leave. Flag to include leave available to take in advance in the"
              + " balance in the payslip")
  public Boolean getShowAnnualLeaveInAdvance() {
    return showAnnualLeaveInAdvance;
  }

  public void setShowAnnualLeaveInAdvance(Boolean showAnnualLeaveInAdvance) {
    this.showAnnualLeaveInAdvance = showAnnualLeaveInAdvance;
  }

  public EmployeeLeaveType annualLeaveTotalAmountPaid(Double annualLeaveTotalAmountPaid) {
    this.annualLeaveTotalAmountPaid = annualLeaveTotalAmountPaid;
    return this;
  }

  /**
   * Specific to Annual Leave. Annual leave balance in dollars
   *
   * @return annualLeaveTotalAmountPaid
   */
  @ApiModelProperty(value = "Specific to Annual Leave. Annual leave balance in dollars")
  public Double getAnnualLeaveTotalAmountPaid() {
    return annualLeaveTotalAmountPaid;
  }

  public void setAnnualLeaveTotalAmountPaid(Double annualLeaveTotalAmountPaid) {
    this.annualLeaveTotalAmountPaid = annualLeaveTotalAmountPaid;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeLeaveType employeeLeaveType = (EmployeeLeaveType) o;
    return Objects.equals(this.leaveTypeID, employeeLeaveType.leaveTypeID)
        && Objects.equals(this.scheduleOfAccrual, employeeLeaveType.scheduleOfAccrual)
        && Objects.equals(this.hoursAccruedAnnually, employeeLeaveType.hoursAccruedAnnually)
        && Objects.equals(this.maximumToAccrue, employeeLeaveType.maximumToAccrue)
        && Objects.equals(this.openingBalance, employeeLeaveType.openingBalance)
        && Objects.equals(this.rateAccruedHourly, employeeLeaveType.rateAccruedHourly)
        && Objects.equals(
            this.percentageOfGrossEarnings, employeeLeaveType.percentageOfGrossEarnings)
        && Objects.equals(
            this.includeHolidayPayEveryPay, employeeLeaveType.includeHolidayPayEveryPay)
        && Objects.equals(this.showAnnualLeaveInAdvance, employeeLeaveType.showAnnualLeaveInAdvance)
        && Objects.equals(
            this.annualLeaveTotalAmountPaid, employeeLeaveType.annualLeaveTotalAmountPaid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        leaveTypeID,
        scheduleOfAccrual,
        hoursAccruedAnnually,
        maximumToAccrue,
        openingBalance,
        rateAccruedHourly,
        percentageOfGrossEarnings,
        includeHolidayPayEveryPay,
        showAnnualLeaveInAdvance,
        annualLeaveTotalAmountPaid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeLeaveType {\n");
    sb.append("    leaveTypeID: ").append(toIndentedString(leaveTypeID)).append("\n");
    sb.append("    scheduleOfAccrual: ").append(toIndentedString(scheduleOfAccrual)).append("\n");
    sb.append("    hoursAccruedAnnually: ")
        .append(toIndentedString(hoursAccruedAnnually))
        .append("\n");
    sb.append("    maximumToAccrue: ").append(toIndentedString(maximumToAccrue)).append("\n");
    sb.append("    openingBalance: ").append(toIndentedString(openingBalance)).append("\n");
    sb.append("    rateAccruedHourly: ").append(toIndentedString(rateAccruedHourly)).append("\n");
    sb.append("    percentageOfGrossEarnings: ")
        .append(toIndentedString(percentageOfGrossEarnings))
        .append("\n");
    sb.append("    includeHolidayPayEveryPay: ")
        .append(toIndentedString(includeHolidayPayEveryPay))
        .append("\n");
    sb.append("    showAnnualLeaveInAdvance: ")
        .append(toIndentedString(showAnnualLeaveInAdvance))
        .append("\n");
    sb.append("    annualLeaveTotalAmountPaid: ")
        .append(toIndentedString(annualLeaveTotalAmountPaid))
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
