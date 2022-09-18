/**
 * Creates a Tea class that extends Beverage. That holds the cost and calories of the beverage Tea.
 * 
 * @author Ani Lamichhane
 *
 */
public class Tea extends Beverage {

    /**
     * Calculates the cost of the Tea with size and addons.
     * 
     * @return money object of the cost of the Tea with addons.
     */
    public Money getCost() {
        Money cost = Money.ZERO;
        int count = 0;

        cost = cost.add(new Money(150));

        while (count < this.addOns.size()) {
            cost = cost.add(this.addOns.get(count).getCost());
            count = count + 1;
        }

        return cost;

    }

    /**
     * Calculates the calories of the Tea with size and addons.
     * 
     * @return int of the calories of the Tea with size and addons.
     */
    public int getCalories() {
        int calories = 0;
        int count = 0;

        calories = calories + 5;

        while (count < this.addOns.size()) {
            calories = calories + (this.addOns.get(count).getCalories());
            count = count + 1;
        }

        return calories;
    }

    /**
     * Overrides toString method and makes a string with the Tea and addons.
     * 
     * @return String of the Tea with addons.
     */
    @Override
    public String toString() {
        String drink = "Tea";
        int count = 0;
        int calories = this.getCalories();

        while (count < this.addOns.size()) {
            drink = drink + "+" + this.addOns.get(count).toString();
            count = count + 1;
        }

        if (this.size == 0) {
            drink = drink + " (S) - ";
        } else {
            drink = drink + " (L) - ";
        }

        drink = drink + calories + " calories";

        return drink;

    }


}
