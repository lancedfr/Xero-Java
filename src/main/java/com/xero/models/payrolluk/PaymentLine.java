/*
 * Xero Payroll UK
 * This is the Xero Payroll API for orgs in the UK region.
 *
 * The version of the OpenAPI document: 2.3.0
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
import java.util.UUID;

/** PaymentLine */
public class PaymentLine {
  StringUtil util = new StringUtil();

  @JsonProperty("paymentLineID")
  private UUID paymentLineID;

  @JsonProperty("amount")
  private Double amount;

  @JsonProperty("accountNumber")
  private String accountNumber;

  @JsonProperty("sortCode")
  private String sortCode;

  @JsonProperty("accountName")
  private String accountName;

  public PaymentLine paymentLineID(UUID paymentLineID) {
    this.paymentLineID = paymentLineID;
    return this;
  }

  /**
   * Xero identifier for payroll payment line
   *
   * @return paymentLineID
   */
  @ApiModelProperty(value = "Xero identifier for payroll payment line")
  public UUID getPaymentLineID() {
    return paymentLineID;
  }

  public void setPaymentLineID(UUID paymentLineID) {
    this.paymentLineID = paymentLineID;
  }

  public PaymentLine amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount of the payment line
   *
   * @return amount
   */
  @ApiModelProperty(value = "The amount of the payment line")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public PaymentLine accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * The account number
   *
   * @return accountNumber
   */
  @ApiModelProperty(value = "The account number")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public PaymentLine sortCode(String sortCode) {
    this.sortCode = sortCode;
    return this;
  }

  /**
   * The account sort code
   *
   * @return sortCode
   */
  @ApiModelProperty(value = "The account sort code")
  public String getSortCode() {
    return sortCode;
  }

  public void setSortCode(String sortCode) {
    this.sortCode = sortCode;
  }

  public PaymentLine accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * The account name
   *
   * @return accountName
   */
  @ApiModelProperty(value = "The account name")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentLine paymentLine = (PaymentLine) o;
    return Objects.equals(this.paymentLineID, paymentLine.paymentLineID)
        && Objects.equals(this.amount, paymentLine.amount)
        && Objects.equals(this.accountNumber, paymentLine.accountNumber)
        && Objects.equals(this.sortCode, paymentLine.sortCode)
        && Objects.equals(this.accountName, paymentLine.accountName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentLineID, amount, accountNumber, sortCode, accountName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentLine {\n");
    sb.append("    paymentLineID: ").append(toIndentedString(paymentLineID)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    sortCode: ").append(toIndentedString(sortCode)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
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
