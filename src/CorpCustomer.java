public class CorpCustomer extends Customer implements DiscountService {
  public CorpCustomer(int id, String name, Loan loan) {
    super(id, name, loan);
  }


  public double discountForLoanCommission(double commission) {
    return commission * 0.005;
  }


  @Override
  public double discountForPaymentCommission(double commission) {
    return commission * 0.005;
  }
}