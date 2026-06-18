public class Main {
  static void main() {
    Customer customer = new Customer(1, "Farid");
    Loan loan = new Loan(1, 100.5, Type.RETAILER, customer);
    System.out.println(loan.loanComission(100.00));
    System.out.println(loan.discount(100.00));
  }
}
