package pizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);

    }

    private void setToppingType(String toppingType) {
        if (toppingType.equals("Meat") || toppingType.equals("Veggies")
                || toppingType.equals("Cheese") || toppingType.equals("Sauce")) {
            this.toppingType = toppingType;
        } else {
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", toppingType));
        }

    }

    private void setWeight(double weight) {
        if (weight < 1 && weight > 50){
            throw new IllegalArgumentException(String.format(
                    "%s weight should be in the range [1..50].",this.toppingType));
        }
            this.weight = weight;
    }

    public double calculateCalories() {
        String toppingType = this.toppingType.toUpperCase();
        return (2 * this.weight) * ToppingModifiers.valueOf(toppingType).getModifiers();
    }

}
