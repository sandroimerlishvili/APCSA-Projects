import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter a number that you'd like to have the digits of added: ");
    int num = scan.nextInt();

    int sum = 0;

    while (num != 0) {
      sum += num%10;
      num /= 10;
    }

    System.out.println(sum);

  }
}