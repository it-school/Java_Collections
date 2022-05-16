package classes;

public interface ICollection {
   boolean add(Integer value);

   void clear();

   boolean contains(Integer value);

   boolean isEmpty();

   boolean remove(Integer value);

   boolean remove(int index);

   int size();
}
