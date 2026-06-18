public class CalculateService implements DiscountService {

  @Override
  public double discountForLoanComission(double comission, double comissionRate,
                                         double discountRate) {
    return comission - (comission * discountRate);

  }

  @Override
  public double discountForPaymentComission(double amount, double discountRate) {
    return amount - (amount * discountRate);
  }
}
