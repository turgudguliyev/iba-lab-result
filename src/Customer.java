public abstract class Customer {
  private int id;
  private String name;
  private String loan;

  public Customer(int id, String name, String loan) {
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

  public String getLoan() {
    return loan;
  }

  public void setLoan(String loan) {
    this.loan = loan;
  }

  public double getFinalCommission() {
    return 0;
  }


}
