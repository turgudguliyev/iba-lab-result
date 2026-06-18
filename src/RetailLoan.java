public class RetailLoan extends Loan {

  public static final LoanType TYPE = LoanType.RETAIL;

  public RetailLoan(Long id, double amount) {
    super(id, amount);
  }

  @Override
  public double getCommission() {
    return 5.0;
  }

  public LoanType getType() {
    return TYPE;
  }

  @Override
  public String toString() {
    return "RetailLoan{" +
        "id=" + id +
        ", amount=" + amount +
        ", commission=" + getCommission() +
        '}';
  }
}
