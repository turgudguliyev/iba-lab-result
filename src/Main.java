public class Main {
  public static void main(String[] args) {
    CorpCustomer corp = new CorpCustomer(1, "Khagani Huseynalizada", new CorpLoan("L1", 1000));
    RetailCustomer retail = new RetailCustomer(2, "Haciaga Zeynalov", new RetailLoan("L2", 2000));


    //Corparativ musteriler
    double corpCommission = corp.getLoan().calculateComission();
    double corpDiscountAmount = corp.discountForLoanCommission(corpCommission);
    double corpFinal = corpCommission - corpDiscountAmount;
    System.out.println("Corp final commission: " + corpFinal);


    //Retail musteriler
    double retailCommission = retail.getLoan().calculateComission();
    double retailDiscountAmount = retail.discountForLoanCommission(retailCommission);
    double retailFinal = retailCommission - retailDiscountAmount;
    System.out.println("Retail final commission: " + retailFinal);
  }
}