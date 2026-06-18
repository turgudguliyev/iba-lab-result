public class Corploan extends Loan implements DiscountService {


  public Corploan(String LoanID, double LoanAmount) {
    super(LoanID, LoanAmount);

  }

  @Override
  public double discountLoanComission(double comission, double disccountRate) {
    return comission - comission * disccountRate / 100;
  }

  @Override
  public double discountPaymentComission(double loanAmount) {
    return 0;
  }

  @Override
  public double loanComission(double loanAmount, double commRate) {
    return loanAmount * commRate / 100;
  }


}
