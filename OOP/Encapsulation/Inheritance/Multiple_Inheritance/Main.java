package Multiple_Inheritance;

import Single_Inheritance.Dog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Single_Inheritance.Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
