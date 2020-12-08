package pizzaCalories;

public enum ToppingModifiers {
    MEAT (1.2),
    VEGGIES (0.8),
    CHEESE (1.1),
    SAUCE (0.9);

    double modifiers;

    ToppingModifiers(double modifiers) {
        this.modifiers = modifiers;
    }

    public double getModifiers() {
        return modifiers;
    }
}
