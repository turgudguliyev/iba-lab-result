package enums;

public enum Commission {
  Corploan("Corporate", 1.2),
  RetailLoan("RetailLoaN", 5d);

  private final String name;
  private final Double commission;

  Commission(String name, Double commission) {
    this.name = name;
    this.commission = commission;
  }

  public String getName() {
    return name;
  }

  public Double getCommission() {
    return commission;
  }
}
