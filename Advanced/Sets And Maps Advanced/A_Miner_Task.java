import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class A_Miner_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int line = 1;

        Map<String, Integer> quantities = new LinkedHashMap<>();
        String currResource = "";
        while (!"stop".equals(input)) {
            if (line % 2 != 0) {
                quantities.putIfAbsent(input, 0);
                currResource = input;
            } else {
                int quantity = quantities.get(currResource);
                quantity  = quantity + Integer.parseInt(input);
                quantities.put(currResource,quantity);
            }

            line++;
            input = scanner.nextLine();
        }


        quantities.entrySet().forEach((entry -> {
            System.out.printf("%s -> %d%n",entry.getKey(),entry.getValue());
        }));
    }
}
