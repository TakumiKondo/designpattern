package state.discountRate;

public class Discount {

    private DiscountRate _discountRate;

    public Discount(DiscountRate discountRate) {
        _discountRate = discountRate;
    }

    public double rate() {
        return _discountRate.rate();
    }
}
