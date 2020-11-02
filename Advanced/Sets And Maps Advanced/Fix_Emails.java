import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Fix_Emails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int line = 1;
        Map<String, String> emails = new LinkedHashMap<>();
        String currName = "";
        while (!"stop".equals(input)) {
            if (line % 2 != 0) {
                emails.putIfAbsent(input, "");
                currName = input;
            } else {
                String[] email = input.split("\\.");
                String domain = email[1];
                if (domain.equals("us") || domain.equals("uk") || domain.equals("com")) {
                    emails.remove(currName);
                } else {
                    emails.put(currName, input);
                }
            }

            line++;
            input = scanner.nextLine();
        }

        emails.forEach((key, value) -> System.out.println(String.format("%s -> %s", key, value)));

    }
}
