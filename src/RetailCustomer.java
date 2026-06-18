public class RetailCustomer extends Customer {
  private final double discountRate = 0.05;


  public RetailCustomer(String name, int id, Loan loan, double discountRate) {
    super(name, id, loan, discountRate);
  }


  public double getDiscountRate() {
    return discountRate;
  }
}
