/*
 * Xero Payroll AU API
 * This is the Xero Payroll API for orgs in Australia region.
 *
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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneId;

/** Timesheet */
public class Timesheet {
  StringUtil util = new StringUtil();

  @JsonProperty("EmployeeID")
  private UUID employeeID;

  @JsonProperty("StartDate")
  private String startDate;

  @JsonProperty("EndDate")
  private String endDate;

  @JsonProperty("Status")
  private TimesheetStatus status;

  @JsonProperty("Hours")
  private Double hours;

  @JsonProperty("TimesheetID")
  private UUID timesheetID;

  @JsonProperty("TimesheetLines")
  private List<TimesheetLine> timesheetLines = new ArrayList<TimesheetLine>();

  @JsonProperty("UpdatedDateUTC")
  private String updatedDateUTC;

  @JsonProperty("ValidationErrors")
  private List<ValidationError> validationErrors = new ArrayList<ValidationError>();

  public Timesheet employeeID(UUID employeeID) {
    this.employeeID = employeeID;
    return this;
  }

  /**
   * The Xero identifier for an employee
   *
   * @return employeeID
   */
  @ApiModelProperty(
      example = "72a0d0c2-0cf8-4f0b-ade1-33231f47b41b",
      required = true,
      value = "The Xero identifier for an employee")
  public UUID getEmployeeID() {
    return employeeID;
  }

  public void setEmployeeID(UUID employeeID) {
    this.employeeID = employeeID;
  }

  public Timesheet startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Period start date (YYYY-MM-DD)
   *
   * @return startDate
   */
  @ApiModelProperty(
      example = "/Date(322560000000+0000)/",
      required = true,
      value = "Period start date (YYYY-MM-DD)")
  public String getStartDate() {
    return startDate;
  }

  public LocalDate getStartDateAsDate() {
    if (this.startDate != null) {
      try {
        return util.convertStringToDate(this.startDate);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public void setStartDate(LocalDate startDate) {
    // CONVERT LocalDate args into MS DateFromat String
    Instant instant = startDate.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();
    long timeInMillis = instant.toEpochMilli();

    this.startDate = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

  public Timesheet endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Period end date (YYYY-MM-DD)
   *
   * @return endDate
   */
  @ApiModelProperty(
      example = "/Date(322560000000+0000)/",
      required = true,
      value = "Period end date (YYYY-MM-DD)")
  public String getEndDate() {
    return endDate;
  }

  public LocalDate getEndDateAsDate() {
    if (this.endDate != null) {
      try {
        return util.convertStringToDate(this.endDate);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public void setEndDate(LocalDate endDate) {
    // CONVERT LocalDate args into MS DateFromat String
    Instant instant = endDate.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();
    long timeInMillis = instant.toEpochMilli();

    this.endDate = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

  public Timesheet status(TimesheetStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  @ApiModelProperty(value = "")
  public TimesheetStatus getStatus() {
    return status;
  }

  public void setStatus(TimesheetStatus status) {
    this.status = status;
  }

  public Timesheet hours(Double hours) {
    this.hours = hours;
    return this;
  }

  /**
   * Timesheet total hours
   *
   * @return hours
   */
  @ApiModelProperty(example = "31.0", value = "Timesheet total hours")
  public Double getHours() {
    return hours;
  }

  public void setHours(Double hours) {
    this.hours = hours;
  }

  public Timesheet timesheetID(UUID timesheetID) {
    this.timesheetID = timesheetID;
    return this;
  }

  /**
   * The Xero identifier for a Payroll Timesheet
   *
   * @return timesheetID
   */
  @ApiModelProperty(
      example = "049765fc-4506-48fb-bf88-3578dec0ec47",
      value = "The Xero identifier for a Payroll Timesheet")
  public UUID getTimesheetID() {
    return timesheetID;
  }

  public void setTimesheetID(UUID timesheetID) {
    this.timesheetID = timesheetID;
  }

  public Timesheet timesheetLines(List<TimesheetLine> timesheetLines) {
    this.timesheetLines = timesheetLines;
    return this;
  }

  public Timesheet addTimesheetLinesItem(TimesheetLine timesheetLinesItem) {
    if (this.timesheetLines == null) {
      this.timesheetLines = new ArrayList<TimesheetLine>();
    }
    this.timesheetLines.add(timesheetLinesItem);
    return this;
  }

  /**
   * Get timesheetLines
   *
   * @return timesheetLines
   */
  @ApiModelProperty(value = "")
  public List<TimesheetLine> getTimesheetLines() {
    return timesheetLines;
  }

  public void setTimesheetLines(List<TimesheetLine> timesheetLines) {
    this.timesheetLines = timesheetLines;
  }

  /**
   * Last modified timestamp
   *
   * @return updatedDateUTC
   */
  @ApiModelProperty(example = "/Date(1583967733054+0000)/", value = "Last modified timestamp")
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

  public Timesheet validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public Timesheet addValidationErrorsItem(ValidationError validationErrorsItem) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Timesheet timesheet = (Timesheet) o;
    return Objects.equals(this.employeeID, timesheet.employeeID)
        && Objects.equals(this.startDate, timesheet.startDate)
        && Objects.equals(this.endDate, timesheet.endDate)
        && Objects.equals(this.status, timesheet.status)
        && Objects.equals(this.hours, timesheet.hours)
        && Objects.equals(this.timesheetID, timesheet.timesheetID)
        && Objects.equals(this.timesheetLines, timesheet.timesheetLines)
        && Objects.equals(this.updatedDateUTC, timesheet.updatedDateUTC)
        && Objects.equals(this.validationErrors, timesheet.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        employeeID,
        startDate,
        endDate,
        status,
        hours,
        timesheetID,
        timesheetLines,
        updatedDateUTC,
        validationErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Timesheet {\n");
    sb.append("    employeeID: ").append(toIndentedString(employeeID)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    timesheetID: ").append(toIndentedString(timesheetID)).append("\n");
    sb.append("    timesheetLines: ").append(toIndentedString(timesheetLines)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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
