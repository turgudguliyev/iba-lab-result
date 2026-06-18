public class CorpCustomer extends Customer implements DiscountServices {

  @Override
  public double discountForLoanComission() {
    return 0.5;
  }

  @Override
  public double discountForPaymentComission() {
    return 0;
  }
}
