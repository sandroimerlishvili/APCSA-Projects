import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int numberadded = 0;
    System.out.print("Enter a number that you'd like to have the digits of added: ");
    String num = scan.nextLine();


    for(int i = 0; i < num.length(); i++) {
      numberadded += Integer.parseInt(num.substring(i, i+1));
    }

    System.out.print(numberadded);

  }
}