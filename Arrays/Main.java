import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] numbers = new int[0];
    int currentNumber = -1; 

    // Get the ceiling value for the list

    System.out.println("You will be inputting numbers and counting their instances.");
    System.out.print("\nWhat should the max be? (Range: 0 - max inclusive) - Type 0 to default to 20: ");
    int max = scan.nextInt();

    // Defaults to 20 if the input is 0, otherwise the input is invalid

    while (max < 1) {
      if (max == 0) {
        max = 20;
      } else {
        System.out.println("\nThe max can't be that! Are you crazy?");
        System.out.print("\nWhat should the max be? (Range: 0 - max inclusive) - Type 0 to default to 20: ");
        max = scan.nextInt();
      }  
    }
  
    // Get input of array

    while (true) {
      System.out.print("Enter a number (1-" + max + ") - 0 to Exit: ");
      currentNumber = scan.nextInt();

      while (currentNumber > max || currentNumber < 0) {
        System.out.println("\nThat's an invalid input, try again.");
        System.out.print("\nEnter a number (1-" + max + ") - 0 to Exit: ");
        currentNumber = scan.nextInt();
      }

      if (currentNumber == 0) {
        break;
      } else {
        // Create copy of array to increase size (no limitation on size)
        numbers = Arrays.copyOf(numbers, numbers.length + 1);
        numbers[numbers.length - 1] = currentNumber;
      }
    }

    System.out.println("\nYou inputted: " + Arrays.toString(numbers) + "\n");

    // Implementation with enhanced for loop

    for (int num : numbers) {
      System.out.println("Enhanced for loop: " + num + "\n");
    }

    int[] numberInstances = new int[max + 1];

    // Creates a list with the number of occurrences of a number at each index (ex. if 6 appears 5 times, the index 6 will have the value 5)

    for (int i = 0; i < numbers.length; i++) {
      numberInstances[numbers[i]] += 1;
    }

    // Prints out how many times a number at each index appears

    for (int i = 0; i < numberInstances.length; i++) {
      if (numberInstances[i] > 0) {
        if (numberInstances[i] == 1) {
          System.out.println(i + " appears " + numberInstances[i] + " time.");
        } else {
          System.out.println(i + " appears " + numberInstances[i] + " times.");
        }
      }
    }

  }
}