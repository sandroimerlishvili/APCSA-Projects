import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter your String: ");
    String word = scan.nextLine();
    System.out.print("\nEnter your substring: ");
    String sub = scan.nextLine();
    
    if (word.indexOf(sub) > -1)  {
      System.out.println("\nYour substring is in your string.");
    } else {
      System.out.println("\nYour substring is not in your string.");
    }

  }
}