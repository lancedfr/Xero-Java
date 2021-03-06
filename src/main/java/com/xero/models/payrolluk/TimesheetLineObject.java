/*
 * Xero Payroll UK
 * This is the Xero Payroll API for orgs in the UK region.
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrolluk;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** TimesheetLineObject */
public class TimesheetLineObject {
  StringUtil util = new StringUtil();

  @JsonProperty("pagination")
  private Pagination pagination;

  @JsonProperty("problem")
  private Problem problem;

  @JsonProperty("timesheetLine")
  private TimesheetLine timesheetLine;

  public TimesheetLineObject pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

  /**
   * Get pagination
   *
   * @return pagination
   */
  @ApiModelProperty(value = "")
  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  public TimesheetLineObject problem(Problem problem) {
    this.problem = problem;
    return this;
  }

  /**
   * Get problem
   *
   * @return problem
   */
  @ApiModelProperty(value = "")
  public Problem getProblem() {
    return problem;
  }

  public void setProblem(Problem problem) {
    this.problem = problem;
  }

  public TimesheetLineObject timesheetLine(TimesheetLine timesheetLine) {
    this.timesheetLine = timesheetLine;
    return this;
  }

  /**
   * Get timesheetLine
   *
   * @return timesheetLine
   */
  @ApiModelProperty(value = "")
  public TimesheetLine getTimesheetLine() {
    return timesheetLine;
  }

  public void setTimesheetLine(TimesheetLine timesheetLine) {
    this.timesheetLine = timesheetLine;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimesheetLineObject timesheetLineObject = (TimesheetLineObject) o;
    return Objects.equals(this.pagination, timesheetLineObject.pagination)
        && Objects.equals(this.problem, timesheetLineObject.problem)
        && Objects.equals(this.timesheetLine, timesheetLineObject.timesheetLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, problem, timesheetLine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimesheetLineObject {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    problem: ").append(toIndentedString(problem)).append("\n");
    sb.append("    timesheetLine: ").append(toIndentedString(timesheetLine)).append("\n");
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
