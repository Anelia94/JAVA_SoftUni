public class ClassBox <T> {
   private T value;

    public ClassBox(T value){
       this.value = value;
    }
    @Override
    public String toString() {
        return String.format("%s: %s",value.getClass().getName(),value);
    }
}
