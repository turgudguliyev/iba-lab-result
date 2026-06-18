public class Customer {
  Long id;
  String name;
  Loan loan;


  public Customer(Long id,
                  String name,
                  Loan loan) {
    this.id = id;
    this.name = name;
    this.loan = loan;
  }
}
