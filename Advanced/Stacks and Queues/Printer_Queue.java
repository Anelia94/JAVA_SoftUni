import java.util.ArrayDeque;
import java.util.Scanner;

public class Printer_Queue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> printerQueue = new ArrayDeque<>();

        String file = scanner.nextLine();

        while (!file.equals("print")) {
            if (file.equals("cancel")) {
                if (printerQueue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {

                    System.out.println("Canceled "+printerQueue.poll());
                }
            } else {
                printerQueue.offer(file);
            }

            file = scanner.nextLine();
        }

        while(!printerQueue.isEmpty()){
            System.out.println(printerQueue.poll());
        }


    }
}