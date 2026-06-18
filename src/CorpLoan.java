public class CorpLoan extends Loan {
  private static final double ComissionRate = 0.012;

  public CorpLoan() {
  }

  public CorpLoan(String id, double amount) {
    super(id, amount);
  }

  @Override
  public double getCommission() {
    return getAmount() * ComissionRate;
  }
}
