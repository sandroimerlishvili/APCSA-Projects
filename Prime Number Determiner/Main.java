import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("This program will determine if a number that you entered is prime.");
    
    try {
      while (true) {
        System.out.print("\nEnter a number (>0): ");
        int num = scan.nextInt();
        
        while (num < 1) {
          System.out.println("\nThat's an invalid number. Try again: ");
          System.out.print("\nEnter a number (>0): ");
          num = scan.nextInt();
        }

        System.out.print("\nCalculating: ");
        for (int i = 0; i < String.valueOf(num).length(); i++) {
          Thread.sleep(1000);
          System.out.print(".");
        }

        Thread.sleep(500);
        
        int i = 2;
        boolean isPrime = true;
        ArrayList<Integer> divisibleBy = new ArrayList<>();
        
        do {
          if (num % i == 0 && num != i) {
            isPrime = false;
            divisibleBy.add(i);
          }
    
          i++;
        } while (i < num / 2);
    
        if (isPrime) {
          System.out.println("\n\n" + num + " is a prime number.");
        } else {
          System.out.println("\n\n" + num + " is not a prime number.");
          System.out.print("\nIt is divisible by the following numbers: ");
            
            for (int j = 0; j < divisibleBy.size(); j++) {
              if (j == divisibleBy.size() - 1) {
                System.out.print(divisibleBy.get(j));
              } else {
                System.out.print(divisibleBy.get(j) + ", ");
                Thread.sleep(300);
              }
            }
            System.out.println("");
          }

        Thread.sleep(500);
        String input = " ";
        System.out.print("\nWould you like to continue? (yes/no): ");
        scan.nextLine();
        input = scan.nextLine().toLowerCase();
        
        while (!(input.equals("yes") || input.equals("no"))) {
          System.out.println("\nThat's an invalid input. Try again.");
          System.out.print("\nWould you like to continue? (yes/no): ");
        input = scan.nextLine().toLowerCase();
        }
  
        if (!input.equals("yes")) {
          break;
        }

        Thread.sleep(200);
        
      } 
    } catch (Exception e) {
        System.out.println("\nEXCEPTION: Uh oh! Something went wrong!");
    } finally {
      System.out.println("\nBye! ( ͡° ͜ʖ ͡°)");
    }
    
    scan.close();
  }
}