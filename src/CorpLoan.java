public class CorpLoan extends Loan {


  public CorpLoan(String id, double amount) {
    super(id, amount);
  }

  @Override
  public double calculateComission() {
    return getAmount() * 1.2 / 100;
  }


}
