public class Main {
  static void main(String[] args) {
    // Create loans
    Loan corpLoan = new CorpLoan("C1", 10000);
    Loan retailLoan = new RetailLoan("R1", 5000);

    System.out.println(corpLoan.getCommission());
    System.out.println(retailLoan.getCommission());

  }
}