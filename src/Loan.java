public class Loan {
  public String id;
  public double amount;


  public Loan(String id, double amount) {
    this.id = id;
    this.amount = amount;
  }


  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }

  public double getAmount() {
    return amount;
  }


  public void setAmount(double amount) {
    this.amount = amount;
  }

  public double calculateComission() {
    return 0;
  }

}