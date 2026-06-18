public class CorpLoan extends Loan {

  private static final LoanType TYPE = LoanType.CORP;

  public CorpLoan(Long id, double amount) {
    super(id, amount);
  }

  @Override
  public double getCommission() {
    return 1.2;
  }

  public LoanType getType() {
    return TYPE;
  }

  @Override
  public String toString() {
    return "CorpLoan{" +
        "id=" + id +
        ", amount=" + amount +
        ", commission=" + getCommission() +
        '}';
  }
}
