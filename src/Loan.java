public class Loan implements DiscountService, LoanComission {
  Type type;
  Customer customer;
  private final int id;
  private final double amount;

  public Loan(int id, double amount, Type type, Customer customer) {
    this.id = id;
    this.amount = amount;
    this.type = type;
    this.customer = customer;
  }

  @Override
  public double discount(double price) {
    if (this.type == Type.RETAILER) {
      price *= 0.02;
    } else {
      price *= 0.05;
    }
    return price;
  }

  @Override
  public double loanComission(double price) {
    if (this.type == Type.RETAILER) {
      price *= 0.05;
    } else {
      price *= 0.01;
    }
    return price;
  }
}
