import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    int[] array1 = new int[10];
    int[] array2 = {4, 6, 8, 3, 8, 9, 2};

    int[][] array3 = new int[4][5];
    int[][] array4 = {{2, 3, 5}, {6, 4, 8}, {1, 3, 5}, {6, 3, 9}};

    // Using Arrays method

    System.out.println("\njava.util.Arrays.deepToString: \n ");
    System.out.println(Arrays.deepToString(array4) + "\n");


    // Using nested for loop

    System.out.println("Nested for loop: \n");
    
    for (int row = 0; row < array4.length; row++) {
      System.out.print("[");
      
      for (int col = 0; col < array4[0].length; col++) {
        if (col < array4[0].length - 1) {
          System.out.print(array4[row][col] + ", ");
        } else {
          System.out.print(array4[row][col]);
        }
      
      }
      
      System.out.print("]");
      System.out.println("");
    }

    // Using nested enchanced for loop

    System.out.println("\nNested enchanced for loop: \n");
    
    for (int[] array : array4) {
      System.out.print("[");
      
      for (int num: array) {
        System.out.print(num + " ");
      }

      System.out.print("]");
      System.out.println("");
    }

    // Using enchanced for loop with Arrays.toString()

    System.out.println("\nEnchanced for loop using Arrays.toString(): \n");

    for (int[] array : array4) {
      System.out.println(Arrays.toString(array));
    }
  }
}