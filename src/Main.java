//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  static void main(String[] args) {

    CorpCustomer corpCustomer = new CorpCustomer("1", "ABB", new Loan("1", 1000d));

    System.out.println((corpCustomer.amount * corpCustomer.discountForLoanCommission()) / 100);

    RetailCustomer retailCustomer = new RetailCustomer("2", "Haci", new Loan("2", 280d));

    System.out.println((retailCustomer.amount * retailCustomer.discountForLoanCommission()) / 100);
  }
}