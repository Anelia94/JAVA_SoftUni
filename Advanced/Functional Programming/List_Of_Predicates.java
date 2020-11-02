import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class List_Of_Predicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        BiPredicate<List<Integer>,Integer> predicate= (l,num) -> {
            for (Integer integer : l) {
                if(num % integer!= 0){
                    return false;
                }
            }
            return true;
        };

        for (int i = 1; i <=n ; i++) {
            if(predicate.test(list,i)){
                System.out.print(i + " " );
            }
        }
    }
}
