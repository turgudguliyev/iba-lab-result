public class RetailLoan extends Loan {

  public RetailLoan(Long id, double amount) {
    super(id, amount, 5.0);
  }

  public double calculatecomission() {

    return amount * 0.05;
  }
}