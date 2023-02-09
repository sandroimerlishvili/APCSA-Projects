import java.util.Scanner;
import static java.lang.Math.*;
 
class Main {
 public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
 
   System.out.print("Enter a number: ");
   double A = scan.nextDouble();
 
   System.out.print("Enter another number: ");
   double B = scan.nextDouble();
  
   double average = (A + B)/2;
   double sum = A + B;
   double difference1 = A - B;
   double difference2 = B - A;
   double product = A * B;
   double quotient1 = A/B;
   double quotient2 = B/A;
   double absolutevalue1 = Math.abs(A);
   double absolutevalue2 = Math.abs(B);
   double squared1 = Math.pow(A, 2);
   double squared2 = Math.pow(B, 2);

    System.out.println("\nThe average of your two numbers (" + A + " and " + B + ")" + " is " + average);
 
    System.out.println("\nThe sum of your two numbers (" + A + " and " + B + ")" + " is " + sum);
 
    System.out.println("\nYour first number (" + A + ") subtracted by your second number (" + B + ") is " + difference1);
 
    System.out.println("\nYour second number (" + B + ") subtracted by your first number (" + A + ") is " + difference2);
 
    System.out.println("\nThe product of your two numbers (" + A + " and " + B + ")" + " is " + product);
 
    System.out.println("\nYour first number (" + A + ") divided by your second number (" + B + ") is " + quotient1);
 
    System.out.println("\nYour second number (" + B + ") divided by your first number (" + A + ") is " + quotient2);

    System.out.println("\nThe absolute value of your first number is " + absolutevalue1);

    System.out.println("\nThe absolute value of your second number is " + absolutevalue2);

    System.out.println("\nYour first number squared is " + squared1);

    System.out.println("\nYour second number squared is " + squared2);   

 }
}