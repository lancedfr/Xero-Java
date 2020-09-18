/*
 * Xero Payroll NZ
 * This is the Xero Payroll API for orgs in the NZ region.
 *
 * The version of the OpenAPI document: 2.3.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrollnz;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** EmployeeEarningsTemplates */
public class EmployeeEarningsTemplates {
  StringUtil util = new StringUtil();

  @JsonProperty("pagination")
  private Pagination pagination;

  @JsonProperty("problem")
  private Problem problem;

  @JsonProperty("earningTemplates")
  private List<EarningsTemplate> earningTemplates = new ArrayList<EarningsTemplate>();

  public EmployeeEarningsTemplates pagination(Pagination pagination) {
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

  public EmployeeEarningsTemplates problem(Problem problem) {
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

  public EmployeeEarningsTemplates earningTemplates(List<EarningsTemplate> earningTemplates) {
    this.earningTemplates = earningTemplates;
    return this;
  }

  public EmployeeEarningsTemplates addEarningTemplatesItem(EarningsTemplate earningTemplatesItem) {
    if (this.earningTemplates == null) {
      this.earningTemplates = new ArrayList<EarningsTemplate>();
    }
    this.earningTemplates.add(earningTemplatesItem);
    return this;
  }

  /**
   * Get earningTemplates
   *
   * @return earningTemplates
   */
  @ApiModelProperty(value = "")
  public List<EarningsTemplate> getEarningTemplates() {
    return earningTemplates;
  }

  public void setEarningTemplates(List<EarningsTemplate> earningTemplates) {
    this.earningTemplates = earningTemplates;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeEarningsTemplates employeeEarningsTemplates = (EmployeeEarningsTemplates) o;
    return Objects.equals(this.pagination, employeeEarningsTemplates.pagination)
        && Objects.equals(this.problem, employeeEarningsTemplates.problem)
        && Objects.equals(this.earningTemplates, employeeEarningsTemplates.earningTemplates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, problem, earningTemplates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeEarningsTemplates {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    problem: ").append(toIndentedString(problem)).append("\n");
    sb.append("    earningTemplates: ").append(toIndentedString(earningTemplates)).append("\n");
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
