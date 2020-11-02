package Jar;

import java.util.ArrayDeque;

public class Jar <T> {
   private ArrayDeque<T> content;

   public Jar (){
       this.content = new ArrayDeque<T>();
   }

   public void add (T element){
       this.content.push(element);
   }
   public T remove(){
       T pop = this.content.pop();
      return pop;

   }

}
