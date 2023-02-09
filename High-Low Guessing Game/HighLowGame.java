// Sandro Imerlishvili
// A 3/4
// 11/24/21

import java.lang.Math;
import java.util.Scanner;

class HighLowGame {

    Scanner scan = new Scanner(System.in);
    private int num;
    private int guess = 0;

    public HighLowGame() {
      System.out.println("This is a High-Low guessing game. You are guessing a number between 1 and 100. You will be told if it is higher or lower than the correct number.");
    }

    // play with unlimited tries
    public void play() {
      num = (int)(Math.random() * 100 + 1);
      while (guess != num) {
        System.out.print("\nEnter a number: ");
        guess = scan.nextInt();

        if (guess == num) {
          System.out.println("\nThat is correct!");
        } else if (guess < num) {
          System.out.println("\nHigher");
        } else {
          System.out.println("\nLower");
        }
      }
    }

    // play with a limited amount of tries
    public void play(int tries) {
      num = (int)(Math.random() * 100 + 1);
      // keeps repeating until the user has guessed correctly or exhausted their attempts
      for (int i = 0; i < tries; i++) {
        System.out.print("\nEnter a number: ");
        guess = scan.nextInt();

        if (guess == num) {
          System.out.println("\nThat is correct!");
          i = tries;
        } else if (i == tries - 1) {
          System.out.println("\nYou have run out of tries. The correct number was " + num); 
        } else if (guess < num) {
          System.out.println("\nHigher");
        } else {
          System.out.println("\nLower");
        }
      }
    }
}