package animal;

public abstract class Animal {
    private String name;
    private String favouriteFood;

    public Animal(String name, String favouriteFood) {
       this.setName(name);
       this.setFavouriteFood(favouriteFood);
    }

    public String getName() {
        return name;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    protected String explainSelf() {
        return String.format("I am %s and my favourite food is %s",getName(),getFavouriteFood());
    }
}
