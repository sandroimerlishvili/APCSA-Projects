import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int num = 0;

      try {
        System.out.print("Enter an int: ");
        num = scan.nextInt();
        System.out.println("Success!!");
      } catch (Exception e) {
        System.out.println("\nThat's not an int!");
        
      } 

  }
}