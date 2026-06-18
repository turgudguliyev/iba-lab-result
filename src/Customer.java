public class Customer {
  public int id;
  public String name;
  public Loan loan;


  public Customer(int id, String name, Loan loan) {
    this.id = id;
    this.name = name;
    this.loan = loan;


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