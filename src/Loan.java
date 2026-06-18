public abstract class Loan {
  private final int id;
  private final double amount;

  public Loan(int id, double amount) {
    this.id = id;
    this.amount = amount;
  }

  public int getId() {
    return id;
  }

  public double getAmount() {
    return amount;
  }

  public abstract double calculateCommission();
}