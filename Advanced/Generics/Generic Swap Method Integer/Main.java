import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Box<Integer> box = new Box();
        while(n-- >0){
            int num = Integer.parseInt(scanner.nextLine());
            box.add(num);
        }
        String[] strings = scanner.nextLine().split("\\s+");
        int a = Integer.parseInt(strings[0]);
        int b = Integer.parseInt(strings[1]);
        box.swapElements(a,b);
        System.out.println(box);
    }
}
