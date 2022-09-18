
/**
 * Creates a DecafCoffee class that extends Coffee which makes a DecafCoffee beverage.
 * 
 * @author Ani Lamichhane
 *
 */
public class DecafCoffee extends Coffee {

    /**
     * Overrides toString method and makes a string with the DecafCoffee and addons.
     * 
     * @return String of the DecafCoffee with addons.
     */
    @Override
    public String toString() {
        return "Decaf" + super.toString();
    }

}
