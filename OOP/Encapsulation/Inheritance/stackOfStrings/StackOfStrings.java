package stackOfStrings;

import java.util.ArrayList;

public class StackOfStrings extends ArrayList<String> {
    private ArrayList<String> data;

    public StackOfStrings(){
        this.data =  new ArrayList<>();
    }

    public void push(String item) {
        this.data.add(item);
    }

    public String pop() {
        return this.data.remove(data.size() - 1);
    }

    public String peek() {
        return this.data.get(data.size() - 1);
    }
}
