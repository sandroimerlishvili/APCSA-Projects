import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("This program checks if a given year is a leap year. \n\nInput a whole number year: ");
    int year = scan.nextInt();

    while (true) {

      if (year < 1582) {
       System.out.print("\nThat is an invalid year (before the Gregorian calendar was adopted).\n");
      } else if (year%4 == 0 && year%100 != 0 || year%400 == 0) {
      System.out.println("\nThat is a leap year!");
      } else {
      System.out.println("\nThat is not a leap year D:");
      }

      System.out.print("\nInput a whole number year (type -1 to exit): ");
      year = scan.nextInt();

      if (year == -1) {
        System.out.println("\nBye! ( ͡° ͜ʖ ͡°)");
        break;
      }
    }

    scan.close();

  }
}