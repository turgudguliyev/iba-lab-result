import java.util.Objects;

public abstract class Loan implements DiscountService {
  private String loanid;
  private double amount;

  public Loan() {
  }

  public Loan(String loanid, double amount) {
    this.loanid = loanid;
    this.amount = amount;
  }

  static double CorpLoan() {

    return 1.2;
  }

  static double RetailLoan() {
    return 5;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Loan loan = (Loan) o;
    return Double.compare(amount, loan.amount) == 0 && Objects.equals(loanid, loan.loanid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loanid, amount);
  }

  @Override
  public String toString() {
    return "Loan{" +
        "loanid='" + loanid + '\'' +
        ", amount=" + amount +
        '}';
  }
}