public interface DiscountService {
  double discountLoanComission(double comission, double disccountRate);

  double discountPaymentComission(double loanAmount);

  double loanComission(double loanAmount, double commRate);
}
