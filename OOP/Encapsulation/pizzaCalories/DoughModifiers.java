package pizzaCalories;

public enum DoughModifiers {
    WHITE (1.5),
    WHOLEGRAIN (1.0),
    CRISPY (0.9),
    CHEWY (1.1),
    HOMEMADE (1.0);

    double modifiers;

    DoughModifiers(double modifiers) {
        this.modifiers = modifiers;
    }

    public double getModifiers() {
        return this.modifiers;
    }
}
