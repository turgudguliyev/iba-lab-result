public interface DiscountService {
  double discountForLoanComission(double amount, double comissionRate, double discountRate);

  double discountForPaymentComission(double amount, double discountRate);


}
