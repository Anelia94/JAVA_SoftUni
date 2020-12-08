package birthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Citizen> citizens = new ArrayList<>();
        List<Pet> pets = new ArrayList<>();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            if (tokens[0].equals("Citizen")) {
                Citizen citizen = new Citizen(tokens[1], Integer.parseInt(tokens[2]), tokens[3], tokens[4]);
                citizens.add(citizen);
            } else if (tokens[0].equals("Pet")) {
                Pet pet = new Pet(tokens[1], tokens[2]);
                pets.add(pet);
            }
            input = scanner.nextLine();
        }

        int yearToCompare = Integer.parseInt(scanner.nextLine());

        boolean flag = false;
        for (Citizen citizen : citizens) {
            int year = Integer.parseInt(citizen.getBirthDate().split("/")[2]);
            if(year == yearToCompare){
                flag = true;
                break;
            }
        }
        for (Pet pet : pets) {
            int year = Integer.parseInt(pet.getBirthDate().split("/")[2]);
            if(year == yearToCompare){
                flag = true;
                break;
            }
        }

        if(flag){
            citizens.stream().filter(citizen -> {
                int year = Integer.parseInt(citizen.getBirthDate().split("/")[2]);
                return year == yearToCompare;
            }).forEach(citizen -> {
                System.out.println(citizen.getBirthDate());
            });

            pets.stream().filter(pet -> {
                int year = Integer.parseInt(pet.getBirthDate().split("/")[2]);
                return year == yearToCompare;
            }).forEach(pet -> {
                System.out.println(pet.getBirthDate());
            });
        }else{
            System.out.println("<no output>");
        }
    }

}
