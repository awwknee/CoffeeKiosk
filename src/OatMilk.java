
/**
 * Creates Oatmilk class that extends addition. Oatmilk is an addition to a beverage.
 * 
 * @author Ani Lamichhane
 *
 */
public class OatMilk extends Addition {

    /**
     * Gets the cost of the Oatmilk.
     * 
     * @returns money object of the cost of the Oatmilk.
     */
    public Money getCost() {
        return Money.ONE_DOLLAR;

    }

    /**
     * Gets the calories of the Oatmilk.
     * 
     * @returns int of the calories of Oatmilk.
     */
    public int getCalories() {
        return 30;
    }

    /**
     * Overrides toString method and makes a string of the name of the addition.
     * 
     * @return String of the name of the addition.
     */
    @Override
    public String toString() {
        return "Oatmilk";
    }
}
