public class Main {
  static void main(String[] args) {

    DiscountService service = new DiscountService();

    Customer corpCustomer = new CorpCustomer(
        "2809070",
        "Hesen",
        new CorpLoan("Loan1", 1000)
    );

    Customer retailCustomer = new RetailCustomer(
        "5687347",
        "Abdulla",
        new RetailLoan("Loan2", 1000)
    );

    System.out.println(service.calculateFinalCommission(corpCustomer));
    System.out.println(service.calculateFinalCommission(retailCustomer));
  }
}