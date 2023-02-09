import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    
    ArrayRandom a1 = new ArrayRandom();
    System.out.println("\n" + a1);

    System.out.println("\nThe array is ascending: " + a1.isAscending());
    System.out.println("\nThe array is decreasing: " + a1.isDecreasing());
    System.out.println("\nThe average is: " + a1.getAverage());
    System.out.println("\nThe max is: " + a1.findMax());
    System.out.println("\nThe min is: " + a1.findMin());
    System.out.println("\nThe local maximas of your list are: " + Arrays.toString(a1.findLocalMax()));  System.out.println("\nThe local minimas of your list are: " + Arrays.toString(a1.findLocalMin()));  

  }
}