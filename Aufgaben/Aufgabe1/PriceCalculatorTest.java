package Aufgabe1;

public class PriceCalculatorTest {

    public static void main(String[] args) {
        test_calculate_price();
    }

    static void test_calculate_price() {
        double baseprice = 20000.0;
        double specialprice = 1500.0;
        double extraprice = 500.0;
        int extras = 4;
        double discount = 5.0;

        double expectedResult = calculateExpectedResult(baseprice, specialprice, extraprice, extras, discount);

        double result = calculatePrice(baseprice, specialprice, extraprice, extras, discount);

        boolean test_ok = Math.abs(expectedResult - result) < 0.001;

        System.out.println("Test calculate_price: " + (test_ok ? "Passed" : "Failed"));
    }

    static double calculatePrice(double baseprice, double specialprice, double extraprice, int extras, double discount) {
        double addonDiscount;
        double result;

        if (extras >= 3)
            addonDiscount = 10;
        else addonDiscount = 0;

        if (discount > addonDiscount)
            addonDiscount = discount;

        result = baseprice / 100.0 * (100 - discount) + specialprice
                + extraprice / 100.0 * (100 - addonDiscount);

        return result;
    }

    static double calculateExpectedResult(double baseprice, double specialprice, double extraprice, int extras, double discount) {
        double addonDiscount;
        double result;

        if (extras >= 3)
            addonDiscount = 10;
        else addonDiscount = 0;

        if (discount > addonDiscount)
            addonDiscount = discount;

        result = baseprice / 100.0 * (100 - discount) + specialprice
                + extraprice / 100.0 * (100 - addonDiscount);

        return result;
    }
}
