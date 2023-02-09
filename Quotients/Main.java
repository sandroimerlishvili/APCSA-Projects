import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a number less than 5: ");
    int A = scan.nextInt();

    if (A <= 5) {
      System.out.println("Good job!");
     } else {
       System.out.println("THAT'S NOT LESS THAN 5!");
     }

    String result = (A <= 5) ? "Good job!" : "THAT'S NOT LESS THAN 5!";
    System.out.println(result);

    double B = (double)(5/2);
    double C = (double)5/2;
    double D = (double)5.0/2;
    double E = (double)(5.0/2);

    System.out.println(B);
    System.out.println(C);
    System.out.println(D);
    System.out.println(E);

    System.out.println(1 + 2 + "Test" + 3 + (4 - 5) * 4);

  }
}