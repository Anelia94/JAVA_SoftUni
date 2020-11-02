import java.util.*;

public class Count_Symbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Map<Character, Integer> characters = new TreeMap<>();

        for (int i = 0; i < text.length(); i++) {
            Character character = text.charAt(i);
            characters.putIfAbsent(character, 0);
            Integer integer = characters.get(character);
            integer++;
            characters.put(character, integer);


        }

        characters.forEach((key, value) -> System.out.printf("%c: %d time/s%n", key, value));

    }
}
