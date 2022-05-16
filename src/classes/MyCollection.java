package classes;

import java.util.Arrays;

public class MyCollection implements ICollection {
   Integer[] array;
   private int size;
   private int lastIndex;

   public MyCollection(int capacity) {
      array = new Integer[capacity > 2 ? (int) Math.pow(2, Math.ceil(Math.log(capacity) / Math.log(2))) : 2];
      lastIndex = -1;
      size = 0;
   }

   public MyCollection() {
      array = new Integer[0];
      lastIndex = -1;
      size = 0;
   }

   @Override
   public boolean add(Integer value) {
      if (size >= array.length) {
         try {
            array = Arrays.copyOf(array, array.length * 2);
            System.out.println(array.length);
         } catch (Exception e) {
            return false;
         }
      }

      lastIndex++;
      array[lastIndex] = value;
      size++;
      return true;
   }

   @Override
   public void clear() {
      for (Integer value : array) {
         value = null;
      }

      size = 0;
      lastIndex = -1;
   }

   @Override
   public boolean contains(Integer value) {
      for (int i = 0; i < size; i++) {
         if (array[i].intValue() == value.intValue()) return true;
      }

      return false;
   }

   @Override
   public boolean isEmpty() {
      return size == 0;
   }

   @Override
   public boolean remove(Integer value) {
      for (int i = 0; i < size; i++) {
         if (array[i].intValue() == value.intValue()) {
            this.remove(i);
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean remove(int index) {
      if (index < size) {
         // 1 2 3 4 5 6
         for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
         }
         array[--size] = null;
      }
      return false;
   }

   @Override
   public int size() {
      return this.size;
   }

   @Override
   public String toString() {
      String result = "[";

      for (Integer value : array) {
         if (value != null) result += value + ", ";
      }
      result = result + "]";

      return result.replace(", ]", "]");
   }
}
