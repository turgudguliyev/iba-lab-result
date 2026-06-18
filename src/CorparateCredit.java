public class CorparateCredit extends Loan {
  public double commission;

  public CorparateCredit(int id, double amount, double commission) {
    super(id, amount);
    this.commission = commission;
  }

  public double getCommission() {
    return commission * 0.012;
  }

  public void setCommission(double commission) {
    this.commission = commission;
  }
}
