import java.util.ArrayList;
import java.util.List;

public class Box<T extends  Comparable> {
    private List<T> values;

    public Box() {
        this.values = new ArrayList<>();
    }

    public void add(T element) {
        this.values.add(element);
    }


    public int count(T element) {
        int count = 0;
        for (T el : values) {
            int compareTo = el.compareTo(element);
            if (compareTo>0){
                count++;
            }

        }
        return count;
    }
}