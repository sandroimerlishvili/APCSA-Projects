import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("This is a 2D int Array processor.");
    
    System.out.print("\nHow many rows (arrays) do you want? (>1): ");
    int rows = scan.nextInt();

    while (rows < 2) {
      System.out.println("\nYou can't have that many rows! Try again.");
      System.out.print("\nHow many rows (arrays) do you want? (>1): ");
    rows = scan.nextInt();
    }

    System.out.print("\nHow many columns (array length) do you want? (>1): ");
    int cols = scan.nextInt();

    while (cols < 2) {
      System.out.println("\nYou can't have that many columns! Try again.");
      System.out.print("\nHow many columns (array length) do you want? (>1): ");
    cols = scan.nextInt();
    }

    TwoDArrays a1 = new TwoDArrays(rows, cols);

    a1.populateArray();

    System.out.println("");
    System.out.println(a1.displayArray());

    System.out.print("");
    a1.findLargest();

    System.out.println("");
    a1.displaySumRowColumn();

    System.out.println("\nYour array transposed: \n");
    System.out.println(a1.transpose());

  }
}