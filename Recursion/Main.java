import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    System.out.println("Series Add (5): " + Summation.seriesAdd(5));
    System.out.println("\nRecursive Add (5): " + Summation.recursiveAdd(5));

    System.out.println("\nSeries Factorial (5): " + Summation.seriesFactorial(5));
    System.out.println("\nRecursive Factorial (5): " + Summation.recursiveFactorial(5));

    System.out.println("\nSeries Fibonacci (10): " + Summation.seriesFibonacci(10));
    
  }
}