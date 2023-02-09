// Sandro Imerlishvili
// 02/01/22
// B 3/4

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    ArrayList<String>names = new ArrayList<String>();
    boolean continueLoop = false;

    System.out.println("You will be inputting names for a chance to win a prize.");
    System.out.print("\nEnter a name: ");
    String currentName = scan.nextLine().toLowerCase();
    names.add(currentName);

    while (true) {
      System.out.print("\nEnter a name (enter \"quit\" to finalize the contestants): ");
      currentName = scan.nextLine().toLowerCase();

      if (currentName.equals("quit")) {
        break;
      }

      for (int i = 0; i < names.size(); i++) {
        if (currentName.equals(names.get(i))) {
          System.out.println("\nThat's a duplicate! Try again.");
          continueLoop = true;
        }
      }

      if (continueLoop == true) {
        continueLoop = false;
        continue;
      }

      names.add(currentName);
    }

    System.out.println("\nThere are " + names.size() + " contestants.");
    System.out.println("\nThe contestants are: \n");

    // Change names to title case 
 
    for (int i = 0; i < names.size(); i++) {
      String current = names.get(i);
      current = current.substring(0,1).toUpperCase() + current.substring(1);
      names.set(i, current);
      System.out.println(names.get(i));
    }

    String winningContestant = names.get((int)(Math.random() * names.size()));
    
    // Round to hundreth's place

    double winningChancePercent = Math.round((100.0 / names.size()) * 100.0 / 100.0);

    System.out.println("\nEach contestant has a ~" + winningChancePercent + "% change of winning.");

    System.out.println("\nThe winning contestant is: " +  winningContestant + "\n\nCongratulations! \n\n(͡° ͜ʖ ͡°)");

    scan.close();
  }
}