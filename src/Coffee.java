/**
 * Creates a Coffee class that extends Beverage. That holds the cost and calories of the beverage
 * coffee.
 * 
 * @author Ani Lamichhane
 *
 */
public class Coffee extends Beverage {

    /**
     * Calculates the cost of the coffee with size and addons.
     * 
     * @returns money object of the cost of the coffee with addons.
     */
    public Money getCost() {
        Money cost = Money.ZERO;
        int count = 0;

        if (this.size == 0) {
            cost = cost.add(new Money(150));
        } else {
            cost = cost.add(new Money(250));
        }

        while (count < this.addOns.size()) {
            cost = cost.add(this.addOns.get(count).getCost());
            count = count + 1;
        }

        return cost;

    }

    /**
     * Calculates the calories of the coffee with size and addons.
     * 
     * @returns int of the calories of the coffee with size and addons.
     */
    public int getCalories() {
        int calories = 0;
        int count = 0;

        if (this.size == 0) {
            calories = calories + 5;
        } else {
            calories = calories + 15;
        }

        while (count < this.addOns.size()) {
            calories = calories + (this.addOns.get(count).getCalories());
            count = count + 1;
        }

        return calories;
    }


    /**
     * Overrides toString method and makes a string with the coffee and addons.
     * 
     * @return String of the coffee with addons.
     */
    @Override
    public String toString() {
        String drink = "Coffee";
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
