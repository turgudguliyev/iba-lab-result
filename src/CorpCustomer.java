public class CorpCustomer extends Customer {
  private double discountRate = 0.05;


  public CorpCustomer(String name, int id, Loan loan, double discountRate) {
    super(name, id, loan, discountRate);
    this.discountRate = discountRate;
  }


  public double getDiscountRate() {
    return discountRate;
  }
}
