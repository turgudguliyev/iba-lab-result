public class RetailCustomer extends Customer implements DiscountService {

  public RetailCustomer(int id, String name, String loan) {
    super(id, name, loan);

  }

  @Override
  public double getDiscountForLoanCommission(double commission) {
    return commission - (commission * 0.02);
  }

  @Override
  public double getDiscountForPaymentCommission(double commission) {
    return commission - (commission * 0.02);
  }


  @Override
  public double getDiscountForLoanCommission() {
    return 0;
  }

  @Override
  public double getDiscountForPaymentCommission() {
    return 0;
  }

  @Override
  public double getFinalCommission() {
    return 0;
  }
}
