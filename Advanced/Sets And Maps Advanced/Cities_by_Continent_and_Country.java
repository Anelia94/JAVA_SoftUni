import javax.sound.sampled.Line;
import java.util.*;

public class Cities_by_Continent_and_Country {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, List<String>>> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];


            map.putIfAbsent(continent, new LinkedHashMap<>());
            Map<String, List<String>> countriesAndCities = map.get(continent);
            countriesAndCities.putIfAbsent(country, new ArrayList<>());
            countriesAndCities.get(country).add(city);

        }

        map.forEach((key, value) -> {
            System.out.println(key + ":");
            value.forEach((v, k) -> {
                System.out.println("  " + v + " -> " + k.toString().replaceAll("[\\[\\]]", ""));
            });


        });
    }
}