public class CorpCustomer extends Customer {

  public CorpCustomer(Long id, String name, Loan loan) {
    super(id, name, loan);
  }

  @Override
  public double discountForLoanCommission() {
    return 0.5;
  }

  @Override
  public double discountForPaymentCommission() {
    return 0.5;
  }
}
