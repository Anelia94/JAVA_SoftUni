package ListyIterator;

import java.util.List;

public class ListyIterator {
    private List<String> data;
    private int index;

    public ListyIterator(List<String> data) {
        this.data = data;
        if (data.isEmpty()) {
            index = -1;
        } else {
            index = 0;
        }
    }

    public boolean move() {
        if(this.index < data.size() - 1){
            index++;
            return true;
        }
        return false;
    }

    public String print() {
        if(index>=0 && index<data.size()){
            return data.get(index);
        }else{
            return "Invalid Operation!";
        }
    }
    public boolean hasNext() {
        if (index < data.size() - 1){
            return true;
        }
        return false;
    }
}
