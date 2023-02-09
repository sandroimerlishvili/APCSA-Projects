import java.util.Scanner;
import java.lang.Math;

class Main {

  public static final double MAX = 9.223372036854775807E15; // Max value outputted for Math.round()

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("This is a calculator program. \n(Note: All answers are rounded to the 10000ths place.)");

    while (true) {

      System.out.print("\nWould you like to manipulate one or two numbers?: ");
      String nums = scan.nextLine().toLowerCase();

      while (!(nums.equals("one") || nums.equals("two") || nums.equals("1") || nums.equals("2"))) {
        System.out.println("\nThat's an invalid input! Try again.");
        System.out.print("\nWould you like to manipulate one or two numbers?: ");
        nums = scan.nextLine().toLowerCase();
        // scan.nextLine();
      }

      if (nums.equals("one") || nums.equals("1")) {

        double num = numInput("\nEnter the number which you would like to manipulate: ");

        System.out.println("\nWhich function would you like to use? \n\n(pow, sqrt, cbrt, nthroot)\n");
        // scan.nextLine();
        String func = scan.nextLine().toLowerCase();

        boolean contin = true;

        while (contin) {

          switch (func) {

            case "pow":

              double pow = (numInput("\nTo what power do you want to raise your number?: "));

              double numPow = Math.pow(num, pow);
              boolean numPowValid = checkOverFlow(numPow);
                
              if (numPowValid) {
                System.out.println("\n" + num + " to the power of " + pow + " is " + numPow);
              }

              contin = false;
              break;

            case "sqrt":

              try {
                if (num < 0) {
                  throw new ArithmeticException();
                }
                System.out.println("\nThe square root of " + num + " is " + roundPlace(Math.sqrt(num), 100000));
              } catch (Exception e) {
                System.out.println("\nERROR: Can't take square root of a negative number.");
              }

              contin = false;
              break;

            case "cbrt":

              System.out.println("\nThe cube root of " + num + " is " + roundPlace(Math.cbrt(num), 10000));
              contin = false;
              break;

            case "nthroot":

              double root = numInput("\nWhat n root (positive integer) would you like to do?: ");

              while (root < 0.0) {
                System.out.println("\nInvalid! Enter a positive integer.");
                root = numInput("\nWhat n root would you like to do?: ");
              }

              double result = Math.pow(num, 1.0 / root);
              
              if (num < 0) {
                result = Math.pow(-num, 1.0 / root);
              }
              
              try {
                if (num < 0 && root % 2 == 0) {
                  throw new ArithmeticException();
                }
                if (num < 0) {
                  result = -Math.pow(-num, 1.0 / root);
                }
                System.out.println("\nThe " + (int) root + " root of " + num + " is " + roundPlace(result, 10000));
              } catch (Exception e) {
                System.out.println("\nERROR: Can't take the " + (int) root + " root of a negative number.");
              }

              contin = false;
              break;

            default:

              System.out.println("\nThat's an invalid input! Try again:");
              System.out.println("\nWhich function would you like to use? \n\n(pow, sqrt, cbrt, nthroot)\n");
              func = scan.nextLine().toLowerCase();
          }
        }

      } else {

        double num1 = numInput("\nEnter the first number: ");

        double num2 = numInput("\nEnter the second number: ");

        System.out.println("\nWhich function would you like to use? \n\n(+, -, /, *, %)\n");
        String func = scan.nextLine().toLowerCase();

        boolean contin = true;

        while (contin) {
          switch (func) {

            case "+":

              System.out.println("\n" + num1 + " + " + num2 + " = " + roundPlace(num1 + num2, 10000));
              contin = false;
              break;
            case "-":

              System.out.println("\n" + num1 + " - " + num2 + " = " + roundPlace(num1 - num2, 10000));
              contin = false;
              break;

            case "/":

              try {
                if (num2 == 0) {
                  throw new ArithmeticException();
                }
                System.out.println("\n" + num1 + " / " + num2 + " = " + (num1 / num2));
              } catch (Exception e) {
                System.out.println("\nERROR: Can't divide by 0");
              }

              contin = false;
              break;

            case "*":

              double product = roundPlace(num1 * num2, 1000);
              boolean productValid = checkOverFlow(product);
                
              if (productValid) {
                System.out.println(num1 + " times " + num2 + " is " + product);
              }

              contin = false;
              break;

            case "%":

              System.out.println("\n" + num1 + " % " + num2 + " = " + roundPlace((num1 % num2), 10000));

              contin = false;
              break;

            default:

              System.out.println("\nThat's an invalid input! Try again:");
              System.out.println("\nWhich function would you like to use? \n\n(+, -, /, *, %)\n");
              func = scan.nextLine().toLowerCase();
          }
        }
      }

      System.out.print("\nWould you like to continue? (yes/no): ");
      // scan.nextLine();
      String input = scan.nextLine().toLowerCase();

      while (!(input.equals("yes") || input.equals("no"))) {
        System.out.println("\nThat's an invalid input. Try again.");
        System.out.print("\nWould you like to continue? (yes/no): ");
        input = scan.nextLine().toLowerCase();
      }

      if (!input.equals("yes")) {
        break;
      }

      System.out.println("\n");

    }

    System.out.println("\nBye! ( ͡° ͜ʖ ͡°)");
    scan.close();

  }

  public static double roundPlace(double number, double place) {
    number = Math.round(number * place) / place;
    return number;
  }

  public static boolean checkOverFlow(double num) {
    try {
      if (num >= MAX || num <= -MAX) {
        throw new ArithmeticException();
      } 
      return true;
      
    } catch (Exception e) {
      System.out.println("\nOVERFLOW ERROR: Enter smaller numbers next time!");
      return false;
    }      
  }

  public static double numInput(String inputStatement) {

    Scanner sc = new Scanner(System.in);
    double input = 0;

    while (true) {
      try {
        System.out.print(inputStatement);
        input = sc.nextDouble();
        break;
      } catch (Exception e) {
        System.out.println("\nNOT A NUMBER/TOO BIG: Try again!");
        sc.nextLine();
      }
    }

    return input;
  }
  
}