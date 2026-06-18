public class Main {

  static void main(String[] args) {

    Loan corpLoan = new Loan(1, 500);
    Loan retailLoan = new Loan(2, 1000);
    CorpCustomer corpCustomer = new CorpCustomer("Saadat", 1, corpLoan, 0.005);
    RetailCustomer retailCustomer = new RetailCustomer("Samir", 2, retailLoan, 0.02);
    DiscountService service = new CalculateService();

    double result1 = service.discountForLoanComission
                                (corpCustomer.getLoan().getAmount(),
                                    0.012, corpCustomer.getDiscountRate());
    double result2 = service.discountForPaymentComission
                                (retailCustomer.getLoan().getAmount(),
                                    retailCustomer.getDiscountRate());


  }
}
