class Main {
  public static void main(String[] args) {
    System.out.println("Var args!!!!!!!"); 
    System.out.print("\nAverage of first ten numbers of the fibonacci sequence: " + average(0, 1, 1, 2, 3, 5, 8, 13, 21, 34));
    System.out.println("\nAverage of first five prime numbers: " + average(2, 3, 5, 7, 11));
  }
  
  public static double average(int ... nums) {
    double average = 0.0;
    for (int i = 0; i < nums.length; i++) {
      average += (double)nums[i];
    }

    return average /= (double)nums.length;
  }
}