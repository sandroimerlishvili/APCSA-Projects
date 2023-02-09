import java.util.ArrayList;
import java.lang.Math;

class Main {
  public static void main(String[] args) {

    // Declare ArrayLists;

    ArrayList<Integer>numbers = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      Integer num = (int)(Math.random() * 10) + 1;
      numbers.add(num);
    }

    ArrayList<Integer>numbers2 = new ArrayList<>();

    for (Integer num : numbers) {
      numbers2.add(num);
    }

    ArrayList<Integer>numbers3 = new ArrayList<>();

    for (Integer num : numbers) {
      numbers3.add(num);
    }

    // Sorts:
  
    // Selection Sort:

    System.out.println("\nSelection Sort: ");
    System.out.println("\nOriginal: " + numbers);

    int switches = 0;

    for (int i = 0; i < numbers.size(); i++) {
      int minIndex = i;

      for (int j = i + 1; j < numbers.size(); j++) {
        if (numbers.get(j) < numbers.get(minIndex)) {
          minIndex = j;
        }
      }

      Integer temp = numbers.get(minIndex);
      numbers.set(minIndex, numbers.get(i));
      numbers.set(i, temp);
      switches++;
    }

    System.out.println("Sorted:   " + numbers);
    System.out.println("\n" + switches + " switches occured");

    // Insertion Sort: 

    System.out.println("\n\nInsertion Sort: ");
    System.out.println("\nOriginal: " + numbers3);

    int switches2 = 0;

    for (int i = 1; i < numbers2.size(); i++) {
      Integer temp = numbers2.get(i);
      Integer possibleIndex = i;
      
      while (possibleIndex > 0 && temp < numbers2.get(possibleIndex - 1)) {
        numbers2.set(possibleIndex, numbers2.get(possibleIndex - 1));
        possibleIndex--;
        switches2++;
      }

      numbers2.set(possibleIndex, temp);
    }

    System.out.println("Sorted:   " + numbers2);
    System.out.println("\n" + switches2 + " switches occured");

    // Bubble Sort:

    System.out.println("\n\nBubble Sort: ");
    System.out.println("\nOriginal: " + numbers3);

    int switches3 = 0;

    for (int i = 0; i < numbers3.size(); i++) {
      for (int j = i + 1; j < numbers3.size(); j++) {
        if (numbers3.get(i) > numbers3.get(j)) {
          Integer current = numbers3.get(i);
          numbers3.set(i, numbers3.get(j));
          numbers3.set(j, current);
          switches3++;
        }
      }
    }

    System.out.println("Sorted:   " + numbers3);
    System.out.println("\n" + switches3 + " switches occured.");

  }
}