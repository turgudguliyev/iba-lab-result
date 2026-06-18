public class CorpLoan extends Loan {

  public CorpLoan(Long id, double amount) {
    super(id, amount, 1.2);
  }

  public double calculatecomission() {

    return amount * 0.012;
  }
}