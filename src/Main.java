import classes.MyCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      System.out.println("Java: generics, collections, exceptions\n");

      MyCollection list = new MyCollection(5);
      System.out.println(list);

      list.add(5);
      list.add(1);
      list.add(7);
      list.add(8);
      list.add(3);
      list.add(6);
      System.out.println(list);

      System.out.println(list.contains(9));

      list.remove(3);
      System.out.println(list);

      System.out.println(list.remove((Integer) 7));
      System.out.println(list);

      System.out.println("\n--------------\n");
      List<Integer> arrayList = new ArrayList<>();
      arrayList.add(5);
      arrayList.add(1);
      arrayList.add(7);
      arrayList.add(8);
      arrayList.add(3);
      arrayList.add(6);
      System.out.println(arrayList);
      System.out.println(arrayList.contains(9));

      arrayList.remove(3);
      System.out.println(arrayList);

      arrayList.remove((Integer) 7);
      System.out.println(arrayList);

      int number = getIntegerFromConsole();
      System.out.println("Input value: " + number);
   }

   public static int getIntegerFromConsole() {
      Scanner scanner = new Scanner(System.in);

      int number = 0;
      boolean isCorrectInput = false;
      String input = "";
      do {
         System.out.println("\n------------------\nInput number:");
         input = scanner.nextLine();

         try {
            number = Integer.parseInt(input);
            isCorrectInput = true;
         } catch (Exception e) {
            System.out.println("Incorrect input!");
         }
      } while (!isCorrectInput);

      return number;
   }
}