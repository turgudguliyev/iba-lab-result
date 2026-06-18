public class RetailLoan extends Loan {
  private static final double ComissionRate = 0.012;

  public RetailLoan() {
  }

  public RetailLoan(String id, double amount) {
    super(id, amount);
  }

  @Override
  public double getCommission() {
    return getAmount() * ComissionRate;
  }
}
