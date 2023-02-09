import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class ArrayRandom {
  Scanner scan = new Scanner(System.in);
  private int length = -1;
  int[] array = new int[0];
  
  public ArrayRandom() {
    System.out.println("A random array of numbers (numbers will range from 1 to 100) with a given length will be generated.");
    System.out.print("\nHow long should the array be? (>2): ");
    length = scan.nextInt();

    while (length < 3) {
      System.out.println("\nYour array is an invalid length, try again.");
      System.out.print("\nHow long should the array be? (>2): ");
      length = scan.nextInt();    
    }

    createArray(length);
  }

  private void createArray(int len) {
    array = Arrays.copyOf(array, len);
    for (int i = 0; i < array.length; i++) {
      array[i] = (int)(Math.random() * 100 + 1);
    }
  }

  public String toString() {
    return Arrays.toString(array);
  }

  public boolean isAscending() {
    int currentNum = -1;

    for (int i = 0; i < length; i++) {
      if (array[i] > currentNum) {
        currentNum = array[i];
      } else {
        return false;
      }
    }
    
    return true;
  }

  public boolean isDecreasing() {
    int currentNum = 101;

    for (int i = 0; i < length; i++) {
      if (array[i] < currentNum) {
        currentNum = array[i];
      } else {
        return false;
      }
    }

    return true;
    
  }

  public double getAverage() {
    double avg = -1;
    double total = -1;
    for (int num : array) {
      total += num;
    }

    avg = total/(double)length;
    
    return (roundPlace(avg, 100)); // Round to hundredth's place

  }

  private double roundPlace(double number, double place) {
    number = Math.round(number * place) / place;
    return number;
  }

  public int findMax() {
    int max = -1;

    for (int i = 0; i < length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }
    
    return max;
  }

  public int findMin() {
    int min = 101;

    for (int i = 0; i < length; i++) {
      if (array[i] < min) {
        min = array[i];
      }
    }

    return min;
  }

  public int[] findLocalMax() {
    int[] maximas = new int [0];

    for (int i = 0; i < length ; i++) {
      if (i == 0) {
        if (array[i] > array[i + 1]) {
          maximas = Arrays.copyOf(maximas, maximas.length + 1);
          maximas[maximas.length - 1] = array[i];
        }
      } else if (i == length - 1) {
          if (array[i] > array[i - 1]) {
            maximas = Arrays.copyOf(maximas, maximas.length + 1);
            maximas[maximas.length - 1] = array[i];
          }
      } else {
          if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
          maximas = Arrays.copyOf(maximas, maximas.length + 1);
          maximas[maximas.length - 1] = array[i];
          }
      }
    }

    return maximas;
  }

  public int[] findLocalMin() {
    int[] minimas = new int [0];

    for (int i = 0; i < length ; i++) {
      if (i == 0) {
        if (array[i] < array[i + 1]) {
          minimas = Arrays.copyOf(minimas, minimas.length + 1);
          minimas[minimas.length - 1] = array[i];
        }
      } else if (i == length - 1) {
          if (array[i] < array[i - 1]) {
            minimas = Arrays.copyOf(minimas, minimas.length + 1);
            minimas[minimas.length - 1] = array[i];
          }
      } else {
          if (array[i] < array[i - 1] && array[i] < array[i + 1]) {
          minimas = Arrays.copyOf(minimas, minimas.length + 1);
          minimas[minimas.length - 1] = array[i];
          }
      }
    }

    return minimas;
  }

}