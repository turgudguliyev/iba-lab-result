public class CorpCustomer extends Customer implements Commision, Discountamount {

  public CorpCustomer(int id, String name, Loan loan) {
    super(id, name, loan);
  }

  public CorpCustomer() {
  }

  /**
   * @return
   */
  @Override
  public CustomerType getCustomertype() {
    return CustomerType.CorpCustomer;
  }

  /**
   * @return
   */
  @Override
  public double commission() {
    return 1.2;
  }

  /**
   * @return
   */
  @Override
  public double discountamount() {
    return 0.5;
  }
}