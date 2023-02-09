import java.util.Arrays;
import java.util.Scanner;

class TwoDArrays {

  Scanner scan = new Scanner(System.in);

  private int rows = 0;
  private int columns = 0;
  private int[][]array;
  
  
  public TwoDArrays(int r, int c) {
    rows = r;
    columns = c;
    array = new int[r][c];
  }

  public void populateArray() {
    for (int row = 0; row < array.length; row++) {
      System.out.print("\nRow " + (row + 1) + ": \n");
      for (int col = 0; col < array[0].length; col++) {
        System.out.print("\nColumn " + (col + 1) + ": ");
        array[row][col] = scan.nextInt();
      }
    }
  }

  public String displayArray() {
    return ArrayToString(array);
  }

  private String ArrayToString(int[][]arrayToDisplay) {
    String StringArray = "";
    
    for (int row = 0; row < arrayToDisplay.length; row++) {
      StringArray += "[";
      
      for (int col = 0; col < arrayToDisplay[0].length; col++) {
        if (col < arrayToDisplay[0].length - 1) {
          StringArray += (arrayToDisplay[row][col] + ", ");
        } else {
          StringArray+= arrayToDisplay[row][col];
        }
      
      }
      
      StringArray += "]";
      StringArray += "\n";
    }

    return StringArray;
  }

  public void findLargest() {

    int max = -1;
    int maxRowCoord = -1;
    int maxColCoord = -1;
    
    for (int row = 0; row < array.length; row++) {
      for (int col = 0; col < array[0].length; col++) {
        if (array[row][col] > max) {
          max = array[row][col];
          maxRowCoord = (row + 1);
          maxColCoord = (col + 1);
        }
      }
    }

    System.out.println("Largest Int: " + max);
      System.out.println("Found At Row: " + maxRowCoord + ", Column: " + maxColCoord);
    
  }
  
  public void displaySumRowColumn() {
    
    for (int row = 0; row < array.length; row++) {
      
      int currentRowSum = 0;
      for (int col = 0; col < array[0].length; col++) {
        currentRowSum += array[row][col];
      }

      System.out.println("Sum of row " + (row + 1) + ": " + currentRowSum);
      currentRowSum = 0;
    }

    System.out.println("");
    
    for (int col = 0; col < array[0].length; col++) {

      int currentColSum = 0;
      for (int row = 0; row < array.length; row++) {
        currentColSum += array[row][col];
      }

      System.out.println("Sum of col " + (col + 1) + ": " + currentColSum);
      currentColSum = 0;
    }
  }

  public String transpose() {
    int[][]transposedArray = new int[columns][rows];

    for (int row = 0; row < array.length; row++) {
      for (int col = 0; col < array[0].length; col++) {
        transposedArray[col][row] = array[row][col];
      }
    }

    return ArrayToString(transposedArray);
  }
  
}