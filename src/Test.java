//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
  //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
  // to see how IntelliJ IDEA suggests fixing it.
  IO.println("Hello and welcome!");


  Customer customer = new Customer(1, "Farid");
  Loan loan = new Loan(1, 100.5, Type.RETAILER, customer);
  System.out.println(loan.loanComission(100.00));
  System.out.println(loan.discount(100.00));
}
