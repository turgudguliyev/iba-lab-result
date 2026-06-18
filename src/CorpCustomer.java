public class CorpCustomer extends Customer implements DiscountService {
  Double discount;
  Double amount;

  public CorpCustomer(String id, String name, Loan loan) {
    this.discount = 0.5;
    this.amount = loan.getAmount();
  }

  public Double getDiscount() {
    return discount;
  }

  @Override
  public double discountForLoanCommission() {
    return 0.5;
  }

  @Override
  public double discountForPaymentCommission() {
    return 0;
  }
}
