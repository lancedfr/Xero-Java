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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** SalaryAndWageObject */
public class SalaryAndWageObject {
  StringUtil util = new StringUtil();

  @JsonProperty("pagination")
  private Pagination pagination;

  @JsonProperty("problem")
  private Problem problem;

  @JsonProperty("salaryAndWages")
  private SalaryAndWage salaryAndWages;

  public SalaryAndWageObject pagination(Pagination pagination) {
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

  public SalaryAndWageObject problem(Problem problem) {
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

  public SalaryAndWageObject salaryAndWages(SalaryAndWage salaryAndWages) {
    this.salaryAndWages = salaryAndWages;
    return this;
  }

  /**
   * Get salaryAndWages
   *
   * @return salaryAndWages
   */
  @ApiModelProperty(value = "")
  public SalaryAndWage getSalaryAndWages() {
    return salaryAndWages;
  }

  public void setSalaryAndWages(SalaryAndWage salaryAndWages) {
    this.salaryAndWages = salaryAndWages;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalaryAndWageObject salaryAndWageObject = (SalaryAndWageObject) o;
    return Objects.equals(this.pagination, salaryAndWageObject.pagination)
        && Objects.equals(this.problem, salaryAndWageObject.problem)
        && Objects.equals(this.salaryAndWages, salaryAndWageObject.salaryAndWages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, problem, salaryAndWages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalaryAndWageObject {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    problem: ").append(toIndentedString(problem)).append("\n");
    sb.append("    salaryAndWages: ").append(toIndentedString(salaryAndWages)).append("\n");
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
