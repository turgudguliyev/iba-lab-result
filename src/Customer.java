public class Customer {

  public Loan loan;
  private String name;
  private int id;
  private double discountRate;

  public Customer() {

  }

  public Customer(String name, int id, Loan loan, double discountRate) {
    this.name = name;
    this.id = id;
    this.loan = loan;
    this.discountRate = discountRate;

  }

  public String getName() {
    return name;
  }

  public Loan getLoan() {
    return loan;
  }

  public double getDiscountRate() {
    return discountRate;
  }
}
