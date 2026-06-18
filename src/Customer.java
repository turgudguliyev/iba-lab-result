public abstract class Customer implements DiscountService {

  private Long id;
  private String name;
  private Loan loan;

  public Customer(Long id, String name, Loan loan) {
    this.id = id;
    this.name = name;
    this.loan = loan;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
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

  @Override
  public String toString() {
    return "Customer{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", loan=" + loan +
        '}';
  }

  public abstract double discountForLoanCommission();
}
