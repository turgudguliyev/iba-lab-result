public class RetailCustomer extends Customer implements DiscountServices{
    @Override
    public double discountForLoanComission() {
        return 2.0;
    }

    @Override
    public double discountForPaymentComission() {
        return 0;
    }

}
