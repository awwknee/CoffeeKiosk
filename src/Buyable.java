
/**
 * Creates interface that all buyable objects implement.
 * 
 * @author Ani Lamichhane
 *
 */
public interface Buyable {

    /**
     * method that calculates the cost of the buyable item.
     * 
     * @return money object of cost of the buyable item.
     */
    Money getCost();

}
