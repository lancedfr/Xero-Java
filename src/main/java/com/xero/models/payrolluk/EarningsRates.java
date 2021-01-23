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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** EarningsRates */
public class EarningsRates {
  StringUtil util = new StringUtil();

  @JsonProperty("pagination")
  private Pagination pagination;

  @JsonProperty("problem")
  private Problem problem;

  @JsonProperty("earningsRates")
  private List<EarningsRate> earningsRates = new ArrayList<EarningsRate>();

  public EarningsRates pagination(Pagination pagination) {
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

  public EarningsRates problem(Problem problem) {
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

  public EarningsRates earningsRates(List<EarningsRate> earningsRates) {
    this.earningsRates = earningsRates;
    return this;
  }

  public EarningsRates addEarningsRatesItem(EarningsRate earningsRatesItem) {
    if (this.earningsRates == null) {
      this.earningsRates = new ArrayList<EarningsRate>();
    }
    this.earningsRates.add(earningsRatesItem);
    return this;
  }

  /**
   * Get earningsRates
   *
   * @return earningsRates
   */
  @ApiModelProperty(value = "")
  public List<EarningsRate> getEarningsRates() {
    return earningsRates;
  }

  public void setEarningsRates(List<EarningsRate> earningsRates) {
    this.earningsRates = earningsRates;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EarningsRates earningsRates = (EarningsRates) o;
    return Objects.equals(this.pagination, earningsRates.pagination)
        && Objects.equals(this.problem, earningsRates.problem)
        && Objects.equals(this.earningsRates, earningsRates.earningsRates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, problem, earningsRates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EarningsRates {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    problem: ").append(toIndentedString(problem)).append("\n");
    sb.append("    earningsRates: ").append(toIndentedString(earningsRates)).append("\n");
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
