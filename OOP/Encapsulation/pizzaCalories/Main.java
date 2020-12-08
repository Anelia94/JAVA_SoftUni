package pizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pizza pizza = null;
        String[] pizzaDetails = scanner.nextLine().split("\\s+");
        String pizzaName = pizzaDetails[1];
        int numberOfToppings = Integer.parseInt(pizzaDetails[2]);

        try {
           pizza = new Pizza(pizzaName, numberOfToppings);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            return;
        }
        String[] doughDetails = scanner.nextLine().split("\\s+");
        String flourType = doughDetails[1];
        String bakingTechnique = doughDetails[2];
        int weight = Integer.parseInt(doughDetails[3]);
        try {
            Dough dough = new Dough(flourType, bakingTechnique, weight);
            pizza.setDough(dough);
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
            return;
        }

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] toppingDetails = input.split("\\s+");
            String toppingType = toppingDetails[1];
            int weightInGrams = Integer.parseInt(toppingDetails[2]);
            try {
                Topping topping = new Topping(toppingType, weightInGrams);
               pizza.addTopping(topping);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                return;
            }

            input = scanner.nextLine();
        }

        System.out.printf("%s - %.2f",pizza.getName(), pizza.getOverallCalories());

    }
}
