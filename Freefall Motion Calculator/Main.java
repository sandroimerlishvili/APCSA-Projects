 // Sandro Imerlishvili
// 12/20/21
// B 3/4

import java.util.Scanner;

class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    System.out.println("This is a kinematics (free-fall) calculator for a couple variables.");
    System.out.println("\nWhy are you doing physics problems? We are in APCSA!!");

    while (true) {

      System.out.println("\nWhich equation would you like to use?");
      System.out.println("\n1: Vf = Vi + gt");
      System.out.println("2: Δx = Vi*t + 1/2*g*t^2");
      System.out.println("\n0: Leave program\n");
      
      String equation = scan.nextLine();

      while (!(equation.equals("1") || equation.equals("2") || equation.equals("0"))) {
        System.out.println("\nThat's not a valid input, try again.");
        System.out.println("\nWhich equation would you like to use?");
        System.out.println("\n1: Vf = Vi + gt");
        System.out.println("2: Δx = Vi*t + 1/2*g*t^2");
        System.out.println("\n0: Leave program\n");
        equation = scan.nextLine();
      }

      if (equation.equals("1")) {
        Kinematics.velFinal();
      } else if (equation.equals("2")) {
        Kinematics k1 = new Kinematics();
        k1.DeltaY();
      } else {
        break;
      }

      Kinematics.counter++; 

    }

    System.out.println("\nYou completed a total of " + Kinematics.counter + " problems.");

  }
}