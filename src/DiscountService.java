public interface DiscountService {
  double getDiscountForLoanCommission(double commission);

  double getDiscountForPaymentCommission(double commission);

  double getDiscountForLoanCommission();

  double getDiscountForPaymentCommission();
}