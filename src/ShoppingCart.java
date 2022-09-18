import java.util.ArrayList;

/**
 * Creates a ShoppingCart class that keeps track of the buyable items and their costs.
 * 
 * @author Ani Lamichhane
 *
 */
public class ShoppingCart {

    /**
     * Creates an array list with the buyable items.
     */
    private ArrayList<Buyable> items;


    /**
     * Constructor that initializes the array list of buyable items.
     */
    public ShoppingCart() {
        items = new ArrayList<Buyable>();
    }

    /**
     * Adds item to the buyable array list.
     * 
     * @param item buyable items
     */
    public void addItem(Buyable item) {
        items.add(item);
    }

    /**
     * Calculates the total cost of all the buyable items in the array list.
     * 
     * @return money object with total cost of items in the buyable array list.
     */
    public Money getTotal() {
        Money totalCost = Money.ZERO;
        int count = 0;

        while (count < items.size()) {
            totalCost = totalCost.add(items.get(count).getCost());
            count = count + 1;

        }
        return totalCost.add(Money.computeMNSalesTax(totalCost));
    }

    /**
     * Overrides toString and returns a shopping cart string.
     * 
     * @returns String of the items in the shopping cart with their adds, size and cost. Also
     *          displays total cost with sales tax.
     */
    @Override
    public String toString() {
        int count = 0;
        String cart = "";

        if (items.size() == 0) {
            return "Cart is empty";
        }

        while (count < items.size()) {
            cart = cart + (count + 1) + ".) " + items.get(count).toString() + ": "
                    + items.get(count).getCost().toString() + "\n";
            count = count + 1;
        }

        cart = cart + "Total: " + getTotal().toString();

        return cart;
    }

}
