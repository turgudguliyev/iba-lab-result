public class Main {
  static void main(String[] args) {
    double commCorpRate = 1.2;
    double commRetRate = 5;

    double discCorpRate = 0.5;
    double discRetRate = 2;

    double corpCommAmount = 0;
    double retCommAmount = 0;

    Corploan corploan = new Corploan("323IPFO0005", 5000);
    CorpCustomer corpCustomer = new CorpCustomer("7235600", "SANAN", corploan);

    System.out.println("before comission applied corpLoan comission rate = " + commCorpRate);
    commCorpRate = corploan.discountLoanComission(commCorpRate, discCorpRate);
    System.out.println("before comission applied corpLoan comission rate = " + commCorpRate);
    System.out.println("loan comission for corploan 50k = " +
        corploan.loanComission(corploan.getLoanAmount(), commCorpRate));

    RetailLoan retLoan = new RetailLoan("155IPFO0005", 5000);
    RetailCustomer retailCustomer = new RetailCustomer("7235601", "VUGAR", retLoan);

    System.out.println("before comission applied retLoan comission rate = " + commRetRate);
    commRetRate = retLoan.discountLoanComission(commRetRate, discRetRate);
    System.out.println("before comission applied retLoan comission rate = " + commRetRate);
    System.out.println("loan comission for retloan 50k = " +
        retLoan.loanComission(retLoan.getLoanAmount(), commRetRate));


  }
}
