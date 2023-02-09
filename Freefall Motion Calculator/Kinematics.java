// Sandro Imerlishvili
// 12/20/21
// B 3/4

import java.lang.Math;
import java.util.Scanner;

class Kinematics {
  static Scanner scan = new Scanner(System.in);
  public static int counter = 0; // Counter for amount of problems completed
  private static final double GRAV = -9.8;
  private double velInitial;
  private double time;

  public Kinematics() {
    System.out.println("\nYou will be inputting knowns to calculate an unknown.");
  }

  public void DeltaY() {
    velInitial = inputVelInitial();
    time = inputTime();
  
    double result = (velInitial * time) + 0.5 * GRAV * (time * time);
    result = roundPlace(result, 100.0);

    System.out.println("\nΔy = " + result + " m");
  }

  private double inputVelInitial() {
    System.out.print("\nWhat is the initial velocity? (positive if it's going up and negative if it's falling): ");
    return scan.nextDouble();
  }

  private double inputTime() {
    System.out.print("\nWhat is the time? (positive number): ");
    time = scan.nextDouble();

    while (time <= 0) {
      System.out.println("\nTime can't be that! Are you crazy? Try again.");
      System.out.print("\nWhat is the time? (positive number): ");
      time = scan.nextDouble();
    }
    return time;
  }

  private double roundPlace(double number, double place) { // Method to round to a certain place
    number = Math.round(number * place) / place;
    return number;
  }
  
  public static void velFinal() {

    System.out.print("\nWhat is the initial velocity? (positive if it's going up and negative if it's falling): ");
    double velInitial2 = scan.nextDouble();

    System.out.print("\nWhat is the time? (positive number): ");
    double time2 = scan.nextDouble();

    while (time2 <= 0) {
      System.out.println("\nTime can't be that! Are you crazy? Try again.");
      System.out.print("\nWhat is the time? (positive number): ");
      time2 = scan.nextDouble();
    }
    
    double result2 = velInitial2 + (GRAV * time2);
    result2 = Math.round(result2 * 100.0) / 100.0; // Round to hundredth's place
    System.out.println("\nVf = " + result2 + " m/s");
  }
}