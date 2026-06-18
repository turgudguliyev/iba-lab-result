public class RetailCustomer extends Customer {
  public RetailCustomer(Long id, String name, Loan loan) {
    super(id, name, loan);
  }

  @Override
  public double discountForLoanCommission() {
    return 2.0;
  }

  @Override
  public double discountForPaymentCommission() {
    return 2.0;
  }
}
