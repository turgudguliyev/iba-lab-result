class DiscountService {

  public double discountForLoanCommission(Customer customer) {
    if (customer.getLoan() instanceof CorpLoan) {
      return customer.getLoan().getAmount() * 0.012;
    } else {
      return customer.getLoan().getAmount() * 0.05;
    }
  }

  public double discountForPaymentCommission(Customer customer) {
    double commission = discountForLoanCommission(customer);

    if (customer instanceof CorpCustomer) {
      return commission * 0.005;
    } else {
      return commission * 0.02;
    }
  }

  public double calculateFinalCommission(Customer customer) {
    double commission = discountForLoanCommission(customer);
    double discount = discountForPaymentCommission(customer);

    return commission - discount;
  }
}

