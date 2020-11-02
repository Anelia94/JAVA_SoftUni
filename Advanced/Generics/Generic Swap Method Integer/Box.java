import java.util.ArrayList;
import java.util.List;

public class Box <T> {
    private List<T> values;

    public Box(){
        this.values = new ArrayList<>();
    }
    public void add (T element){
        this.values.add(element);
    }

    public void swapElements (int a, int b){

        if(a>=0 && a <values.size() && b>=0 && b <values.size()){
            T temporaryA = values.get(a);
            T temporaryB = values.get(b);
            values.set(a,temporaryB);
            values.set(b,temporaryA);
        }

    }
    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();

        for (T value : values) {
            sb.append(String.format("%s: %s",value.getClass().getName(),value));
            sb.append("\n");
        }
        return sb.toString();
    }
}