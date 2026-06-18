public class Loan {
  private String LoanID;
  private double LoanAmount;

  public Loan(String LoanID, double LoanAmount) {
    this.LoanID = LoanID;
    this.LoanAmount = LoanAmount;
  }

  public Loan() {

  }

  public String getLoanID() {
    return LoanID;
  }

  public void setLoanID(String LoanID) {
    this.LoanID = LoanID;
  }

  public double getLoanAmount() {
    return LoanAmount;
  }

  public void setLoanAmount(double LoanAmount) {
    this.LoanAmount = LoanAmount;
  }
}
