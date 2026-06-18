public class Main {

  static void main(String[] args) {
    //CorpLoan
    Loan corpLoan = new CorpLoan(1L, 10000);
    Customer corpCustomer =
        new CorpCustomer(1L, "Test MMC", corpLoan);

    System.out.println(corpLoan);

    double commissionAmount;

    commissionAmount = corpCustomer.getLoan().getAmount()
        * corpCustomer.getLoan().getCommission()
        / 100;

    System.out.println("Commision Amount: " + commissionAmount);

    double discountAmount;

    discountAmount = commissionAmount
        * corpCustomer.discountForLoanCommission()
        / 100;
    System.out.println("Discount Amount: " + discountAmount);

    double finalCommission =
        commissionAmount - discountAmount;

    System.out.println("Final Commision: " + finalCommission);

    //RetailLoan
    Loan retailLoan = new RetailLoan(2L, 5000);
    Customer retailCustomer = new RetailCustomer(2L, "Testov Test", retailLoan);
    System.out.println(retailLoan);

    double commissionAmount2;

    commissionAmount2 = retailCustomer.getLoan().getAmount()
        * retailCustomer.getLoan().getCommission()
        / 100;

    System.out.println("Commision Amount: " + commissionAmount2);

    double discountAmount2;

    discountAmount2 = commissionAmount2
        * retailCustomer.discountForLoanCommission()
        / 100;

    System.out.println("Discount Amount: " + discountAmount2);

    double finalCommission2 =
        commissionAmount2 - discountAmount2;

    System.out.println("Final Commision: " + finalCommission2);

  }
}