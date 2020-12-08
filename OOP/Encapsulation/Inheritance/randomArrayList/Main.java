package randomArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        RandomArrayList<Integer> list =new RandomArrayList<>();
       list.add(1);
       list.add(43);
       list.add(54);
        System.out.println(list.getRandomElement());
    }
}
