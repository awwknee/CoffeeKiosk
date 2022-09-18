
/**
 * Creates a money class that stores money in cents. Can also add and subtract money and calculates
 * sales tax.
 * 
 * @author Ani Lamichhane
 *
 */
public class Money {

    /**
     * static factory method where money is 0 cents.
     */
    public static final Money ZERO = new Money(0);
    /**
     * static factory method where money is 100 cents.
     */
    public static final Money ONE_DOLLAR = new Money(100);
    /**
     * static factory method where money is 200 cents.
     */
    public static final Money TWO_DOLLAR = new Money(200);
    /**
     * int of cents.
     */
    private int amountInCents;

    /**
     * Initializes the amount of money in cents.
     * 
     * @param cents the cost of the item.
     */
    public Money(int cents) {
        amountInCents = cents;
    }

    /**
     * Takes the cost in cents and calculates the sales tax.
     * 
     * @param cents the cost of the item.
     * @return the sales tax as a money object.
     */
    public static Money computeMNSalesTax(Money cents) {
        double salesTax = 6.875 / 100.0;
        int tax = (int) Math.round(salesTax * cents.amountInCents);

        return new Money(tax);

    }

    /**
     * Adds money together.
     * 
     * @param cents the cost of the item.
     * @return money object with the added cost.
     */
    public Money add(Money cents) {
        return new Money(this.amountInCents + cents.amountInCents);

    }

    /**
     * Subtracts money.
     * 
     * @param cents the cost of the item.
     * @return money object with cost subtracted.
     */
    public Money subtract(Money cents) {
        return new Money(this.amountInCents - cents.amountInCents);

    }

    /**
     * Overrides toString and turns money into a string formatted $dd.cc.
     *
     * @returns String format of cents into dollars and cents.
     */
    @Override
    public String toString() {
        int dollars;
        int cents;

        dollars = amountInCents / 100;
        cents = amountInCents % 100;

        if (cents < 10) {
            return "$" + dollars + ".0" + cents;

        } else {
            return "$" + dollars + "." + cents;
        }

    }

}
