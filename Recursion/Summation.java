import java.util.ArrayList;

public class Summation {

  public static int seriesAdd(int n) {
    int result = 0;
  
    for (int i = n; i > 0; i--) {
      result += i;
    }

    return result;
  }
  
  public static int recursiveAdd(int n) {
    int result = 0;
    
    if (n == 1) {
      result = 1;
    } else {
      result = n + recursiveAdd(n - 1);
    }

    return result;
  }

  public static int seriesFactorial (int n) {
    int result = n;

    for (int i = n - 1; i > 0; i--) {
      result *= i;
    }

    return result;
  }

  public static int recursiveFactorial(int n) {
    int result = n;

    if (n == 1) {
      result = 1;
    } else {
      result = n * recursiveFactorial(n - 1);
    }

    return result;
    
  }

  public static ArrayList<Long> seriesFibonacci(int n) {

    ArrayList<Long> fibonacci = new ArrayList<>();

    fibonacci.add(1L);
    
    if (n == 1) {
      return fibonacci;
    }

    fibonacci.add(1L);

    if (n == 2) {
      return fibonacci;
    }
    
    for (int i = 2; i <= n; i++) {
      fibonacci.add(fibonacci.get(i - 1) + fibonacci.get(i - 2));
    }

    return fibonacci;
  }

  public static int recursiveFibonacci(int n) {
    int i = 0;
    return i;
  }
}