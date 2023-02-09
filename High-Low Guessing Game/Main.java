// Sandro Imerlishvili
// A 3/4
// 11/24/21

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    int Tries;
    boolean valid = true; // validity of input
    String contin = "yes"; // continue playing
    Scanner scan = new Scanner(System.in);
    HighLowGame g1 = new HighLowGame();
    
    while (contin.equals("yes")) {

      System.out.print("\n\nHow many tries would you like? (type 0 to have unlimited tries): ");
      Tries = scan.nextInt();

      if (Tries == 0) {
        g1.play();
      } else if (Tries >= 1) {
        g1.play(Tries);
      } else {
        System.out.println("\n\nThat's an invalid amount of tries.");
        valid = false;
      }

      // restarts the loop if the input is invalid
      if (valid == false) {
        valid = true;
        continue;
      } 
      
      System.out.print("\n\nWould you like to try again? (yes/no): ");
      scan.nextLine();
      contin = scan.nextLine().toLowerCase();
     
      // checks if continue variable is "yes" or "no"
      if (!(contin.equals("yes") || contin.equals("no"))) {
        System.out.println("\n\nThat's an invalid input. I am kicking you out!");
      }  
    }

    System.out.println("\n\nBye! ( ͡° ͜ʖ ͡°)");
    scan.close();
    
  }
}