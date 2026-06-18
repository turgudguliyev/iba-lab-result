public class RetailLoan extends Loan {
  public double commission;

  public RetailLoan(int id, double amount, double commission) {
    super(id, amount);
    this.commission = commission;
  }

  public double getCommission() {
    return commission * 0.05;
  }

  public void setCommission(double commission) {
    this.commission = commission;
  }
}
