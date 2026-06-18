public class RetailCustomer extends Customer implements Commision, Discountamount {

  public RetailCustomer(int id, String name, Loan loan) {
    super(id, name, loan);
  }

  public RetailCustomer() {
  }

  /**
   * @return
   */
  @Override
  public CustomerType getCustomertype() {
    return CustomerType.RetailCustomer;
  }

  /**
   * @return
   */
  @Override
  public double commission() {
    return 5;
  }

  /**
   * @return
   */
  @Override
  public double discountamount() {
    return 2;
  }
}
