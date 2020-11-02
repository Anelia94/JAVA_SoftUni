import java.util.*;

public class Periodic_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> table = new TreeSet<>();
        for (int i = 0; i <n ; i++) {
            String[] compounds = scanner.nextLine().split("\\s+");
            for (int j = 0; j < compounds.length; j++) {
                String compound = compounds[j];
                table.add(compound);


            }

        }

        System.out.printf(String.join(" ", table));

    }
}
