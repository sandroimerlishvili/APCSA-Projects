import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    Die die1 = new Die();
    Die die2 = new Die();
    String multiple;
    String def;
    int faces = 0;

    System.out.println("This is a die program.\n");

    while (true) {

      System.out.print("\nWould you like to use two dice?: ");
      multiple = scan.nextLine().toLowerCase();

      if (!multiple.equals("yes") && !multiple.equals("no")) {
        System.out.println("\n\nThat's an invalid input. Try again\n");
      } else {
        break;
      }  
    }

    while (true) {

      System.out.print("\n\nWould you like to use a default 6 sided die?: ");
      def = scan.nextLine().toLowerCase();

      if (!def.equals("yes") && !def.equals("no")) {
        System.out.println("\n\nThat's an invalid input. Try again");    
      } else {
        break;
      }
    }

    if (def.equals("no")) {
      System.out.print("\n\nHow many faces would you like to use?: ");
      faces = scan.nextInt();
      } 
    
      if (multiple.equals("yes")) {
        if(def.equals("yes")) {
          die1.roll();
          die2.roll();
        } else { 
          die1.roll(faces);
          die2.roll(faces);
        }      
      } else {
         if (def.equals("yes")) {
          die1.roll();
        } else {
          die1.roll(faces);
        }
        }    
  }
}