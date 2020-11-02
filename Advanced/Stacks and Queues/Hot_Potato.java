import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Hot_Potato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> playersQueue = new ArrayDeque<>();

        String[] players = scanner.nextLine().split("\\s+");
        Collections.addAll(playersQueue, players);

        int counting = Integer.parseInt(scanner.nextLine());

        String currPlayer = "";
        while (playersQueue.size() != 1) {
            for (int i = 1; i <= counting; i++) {
                if (i == counting ) {

                    System.out.println("Removed " + playersQueue.poll());
                    currPlayer=playersQueue.peek();
                }else{
                    currPlayer = playersQueue.poll();
                    playersQueue.offer(currPlayer);
                }
            }
        }

        while(!playersQueue.isEmpty()){
            System.out.println("Last is "+playersQueue.poll());
        }

    }
}

