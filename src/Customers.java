public abstract class Customers extends Loan implements DiscountService {
  // private static final String loanId = ;
  private String CustomerId;
  private String FirstName;
  private Loan loan;

  public Customers(double amount, String loanId, String customerId, String FirstName, Loan loan) {
    super(loanId, amount);
    this.CustomerId = customerId;
    this.FirstName = FirstName;
    this.loan = loan;
  }

}