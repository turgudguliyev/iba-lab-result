public class RetailCustomer extends Customer implements DiscountService {
  Double discount;
  Double amount;

  public RetailCustomer(String id, String name, Loan loan) {
    this.discount = 2d;
    this.amount = loan.getAmount();
  }


  @Override
  public double discountForLoanCommission() {
    return 2;
  }

  @Override
  public double discountForPaymentCommission() {
    return 0;
  }
}
