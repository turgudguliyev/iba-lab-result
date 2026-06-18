public abstract class Loan {
  public Long id;
  public double amount;

  public Loan(Long id, double amount) {
    this.id = id;
    this.amount = amount;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public abstract double getCommission();

  @Override
  public String toString() {
    return "Loan{" +
        "id=" + id +
        ", amount=" + amount +
        ", commission=" + getCommission() +
        '}';
  }
}
