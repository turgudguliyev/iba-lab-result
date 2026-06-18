public abstract class Customer {
  private final int id;
  private final String name;
  private final Loan loan;

  public Customer(int id, String name, Loan loan) {
    this.id = id;
    this.name = name;
    this.loan = loan;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}
