package state.discountRate;

public class Main {
    public static void main(String... args) {

        double baseAmount = 100;

        Discount discount10Per = new Discount(new DiscountTenPer());
        Discount discountHalf = new Discount(new DiscountHalf());
        Discount discountDefault = new Discount(new DiscountDefault());
        Discount DiscountThreeQuarters = new Discount(new DiscountThreeQuarters());

        System.out.println("Amount is " + baseAmount * discount10Per.rate());
        System.out.println("Amount is " + baseAmount * discountHalf.rate());
        System.out.println("Amount is " + baseAmount * discountDefault.rate());
        System.out.println("Amount is " + baseAmount * DiscountThreeQuarters.rate());
    }

}
