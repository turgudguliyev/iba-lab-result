public class Loan {
  double amount;
  private final Long id;
  private final double commissionRate;

  public Loan(Long id, double amount, double commissionRate) {
    this.id = id;
    this.amount = amount;
    this.commissionRate = commissionRate;
  }

  public Long getId() {
    return id;
  }

  public double getAmount() {
    return amount;
  }

  public double getCommissionRate() {
    return commissionRate;
  }
}