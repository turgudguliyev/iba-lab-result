public class RetailLoan extends Loan {


  public RetailLoan(String id, double amount) {
    super(id, amount);
  }

  @Override
  public double calculateComission() {
    return getAmount() * 5 / 100;
  }


}