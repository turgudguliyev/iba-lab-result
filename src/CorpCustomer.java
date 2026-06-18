public class CorpCustomer extends Customer {

  public CorpCustomer(int id, String name, Loan loan) {
    super(id, name, loan);
  }

  @Override
  public double getDiscountRate() {
    return 0.005; // 0.5%
  }
}