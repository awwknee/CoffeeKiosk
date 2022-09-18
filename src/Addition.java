
/**
 * Creates an abstract Additions class that creates a getCost and getCalories method that SugarSyupo
 * and OatMilk use.
 * 
 * @author Ani Lamichhane
 *
 */

public abstract class Addition {
    /**
     * abstract method that gets cost.
     * 
     * @return money object of the cost of the item.
     */
    public abstract Money getCost();

    /**
     * abstract method that gets calories.
     * 
     * @return int of calories of the item.
     */
    public abstract int getCalories();
}
