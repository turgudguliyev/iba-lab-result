public class Payment {
  private final String id;
  private final Double amount;

  public Payment(String id, Double amount) {
    this.id = id;
    this.amount = amount;
  }

  public String getId() {
    return id;
  }

  public Double getAmount() {
    return amount;
  }
}
