public class Customer {

  private int id;
  private String name;
  private Loan loan;

  public Customer(int id, String name, Loan loan) {
    this.id = id;
    this.name = name;
    this.loan = loan;
  }

  public Customer() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Loan getLoan() {
    return loan;
  }

  public void setLoan(Loan loan) {
    this.loan = loan;
  }

}


