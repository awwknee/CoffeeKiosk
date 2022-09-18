
/**
 * Creates SugarSyrup class that extends addition. SugarSyrup is an addition to a beverage.
 * 
 * @author Ani Lamichhane
 *
 */
public class SugarSyrup extends Addition {
    /**
     * Gets the cost of the SugarSyrup.
     * 
     * @returns money object of the cost of the SugarSyrup.
     */
    public Money getCost() {
        return new Money(50);

    }

    /**
     * Gets the calories of the SugarSyrup.
     * 
     * @returns int of the calories of SugarSyrup.
     */
    public int getCalories() {
        return 60;

    }

    /**
     * Overrides toString method and makes a string of the name of the addition.
     * 
     * @return String of the name of the addition.
     */
    @Override
    public String toString() {
        return "Sugar Syrup";

    }

}
