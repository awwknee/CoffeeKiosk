import java.util.ArrayList;

/**
 * Creates a Beverage class that implements buyable. Beverages are buyable.
 * 
 * @author Ani Lamichhane
 *
 */
public abstract class Beverage implements Buyable {
    /**
     * static factory method that sets a large drink.
     */
    public static final int LARGE = 2;
    /**
     * static factory method that sets a small drink.
     */
    public static final int SMALL = 0;
    /**
     * creates an array list of addons to the beverage.
     */
    protected ArrayList<Addition> addOns;
    /**
     * int of the size of the beverage.
     */
    protected int size;

    /**
     * Constructor that initializes the array list of additions.
     */
    public Beverage() {
        addOns = new ArrayList<Addition>();
    }

    /**
     * method that calculates the cost of the buyable item.
     * 
     * @return money object of cost of the buyable item.
     */
    public abstract Money getCost();

    /**
     * method that calculates the calories of the buyable item.
     * 
     * @return in of the calories of the buyable item.
     */
    public abstract int getCalories();

    /**
     * Method that gets the size of the beverage.
     * 
     * @param size of the beverage
     */
    public void setSize(int size) {
        this.size = size;

    }

    /**
     * Adds addons to beverage.
     * 
     * @param item the addons.
     */
    public void addToDrink(Addition item) {
        addOns.add(item);
    }

}
