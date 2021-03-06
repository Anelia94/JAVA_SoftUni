import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();
        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            Person person = new Person(name, age);
            people.add(person);

        }

        people.stream().filter(person -> person.age > 30).sorted((p1, p2) -> p1.name.compareTo(p2.name)).forEach(person -> {
            System.out.println(person.name + " - " + person.age);
        });

    }
}

