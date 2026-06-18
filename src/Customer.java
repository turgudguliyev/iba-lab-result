class Customer {
  private final String id;
  private final String name;
  private final Loan loan;

  public Customer(String id, String name, Loan loan) {
    this.id = id;
    this.name = name;
    this.loan = loan;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Loan getLoan() {
    return loan;
  }
}
