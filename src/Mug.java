
/**
 * Creates a mug class that implements buyable. Creates a buyable mug.
 * 
 * @author Ani Lamcichhane
 *
 */
public class Mug implements Buyable {

    /**
     * Method that gets cost of mug.
     * 
     * @return money object with cost of mug.
     */
    public Money getCost() {
        return new Money(1000);

    }

    /**
     * Overrides toString and returns a string with the name of the mug.
     * 
     * @return String with the name of the mug.
     */
    @Override
    public String toString() {
        return "Classy Mug";
    }

}
