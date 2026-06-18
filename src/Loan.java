class Loan {
  private final String id;
  private final double amount;

  public Loan(String id, double amount) {
    this.id = id;
    this.amount = amount;
  }

  public String getId() {
    return id;
  }

  public double getAmount() {
    return amount;
  }
}