package CustomList;

import java.util.ArrayList;
import java.util.List;

public class CustomList<T extends Comparable> {
    private List<T> list;

    public CustomList() {
        this.list = new ArrayList<>();
    }

    public void add(T element) {
        this.list.add(element);
    }

    public T remove(int index) {
        return this.list.remove(index);
    }

    public boolean contains(T element) {
        boolean contains = false;
        if (this.list.contains(element)) {
            contains = true;
        }
        return contains;
    }

    public void swap(int index1, int index2) {
        T temporary1 = this.list.get(index1);
        T temporary2 = this.list.get(index2);
        this.list.set(index1, temporary2);
        this.list.set(index2, temporary1);
    }

    public int countGreaterThan(T element) {
        int count = 0;
        for (T el : list) {
            int compare = el.compareTo(element);
            if (compare > 0) {
                count++;
            }

        }
        return count;
    }

    public T getMax() {
        T max = this.list.get(0);
        for (T el : list) {
            int compare = el.compareTo(max);
            if (compare > 0) {
                max = el;
            }
        }
        return max;
    }

    public T getMin() {
        T min = this.list.get(0);
        for (T el : list) {
            int compare = el.compareTo(min);
            if (compare < 0) {
                min = el;
            }

        }
        return min;
    }

    public void print() {
        for (T el : list) {
            System.out.println(el);
        }
    }
    public int size(){
        return this.list.size();
    }

    public T get(int i) {
        return this.list.get(i);
    }
}
