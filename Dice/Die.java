import java.util.Scanner;
import java.util.Random;

class Die {

  Scanner scan = new Scanner(System.in);
  Random rand = new Random();

  private int faces = 6;
  private int pips;
  
  public Die() {
    ;
  }

  public void roll() {
    pips = rand.nextInt(faces);
    pips ++;
    if (pips == 1) {
      System.out.println("\n-------------");
      System.out.println("|           |");
      System.out.println("|     O     |");
      System.out.println("|           |");
      System.out.println("-------------");
    } else if (pips == 2) {
      System.out.println("\n-------------");
      System.out.println("|   O       |");
      System.out.println("|           |");
      System.out.println("|        O  |");
      System.out.println("-------------");
    } else if (pips == 3) {
      System.out.println("\n-------------");
      System.out.println("|  O        |");
      System.out.println("|     O     |");
      System.out.println("|        O  |");
      System.out.println("-------------");
    } else if (pips == 4) {
      System.out.println("\n-------------");
      System.out.println("|  O     O  |");
      System.out.println("|           |");
      System.out.println("|  O     O  |");
      System.out.println("-------------");
    } else if (pips == 5) {
      System.out.println("\n-------------");
      System.out.println("|  O     O  |");
      System.out.println("|     O     |");
      System.out.println("|  O     O  |");
      System.out.println("-------------");
    } else {
      System.out.println("\n-------------");
      System.out.println("|  O     O  |");
      System.out.println("|  O     O  |");
      System.out.println("|  O     O  |");
      System.out.println("-------------"); 
    }
    }

  public void roll(int faces) {
    if (faces == 0) {
      System.out.println("\n\nYou can't have a 0 sided die you bozo");
    } else if (faces == 1) {
      System.out.println("\n\nYou can't have a 1 sided die you bozo");
    } else {
    pips = rand.nextInt(faces);
    pips ++;
    System.out.println("\n\nYou have rolled " + pips);
    }
  }
}