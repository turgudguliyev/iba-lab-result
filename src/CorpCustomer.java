class CorpCustomer extends Customer {

  public CorpCustomer(long id, String name, Loan loan) {
    super(id, name, loan);
  }

  public double calculateFinalCommission() {
    CorpLoan corpLoan = (CorpLoan) loan;

    double commission = corpLoan.calculatecomission();
    double discount = 0.005; // 0.5%

    return commission - (commission * discount);
  }


}