public class RetailCustomer extends Customer implements DiscountService {
  public RetailCustomer(int id, String name, Loan loan) {
    super(id, name, loan);
  }


  public double discountForLoanCommission(double commission) {
    return commission * 0.02;
  }


  @Override
  public double discountForPaymentCommission(double commission) {
    return commission * 0.02;
  }
}