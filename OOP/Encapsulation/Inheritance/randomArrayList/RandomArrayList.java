package randomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<T> extends ArrayList<T> {
    private Random random;

    public RandomArrayList(){
      random =  new Random();
    }

    public T getRandomElement() {
           int index = random.nextInt(this.size());
            return super.remove(index);

    }

}
