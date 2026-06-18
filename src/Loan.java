public abstract class Loan {
  private String id;
  private double amount;

  public Loan() {
  }

  public Loan(String id, double amount) {

  }

  public String getId() {
    return id;
  }

  public double getAmount() {
    return amount;
  }

  public abstract double getCommission();
}
