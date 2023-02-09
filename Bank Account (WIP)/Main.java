import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Hello. This is the portal for the WeStealYourMoney Bank.");

    System.out.print("\nWhat is your name?: ");
    String name = scan.nextLine();
    
    Account acnt1 = new Account(name);

    String status = "";

    while (status != "exit") {
      System.out.print("\nWhat would you like to do?");
      System.out.print("\nDeposit (D)\nWithdraw (W)\nView account statement (VAS)\nExit (E)\n\n");
      status = scan.nextLine().toUpperCase();

      if (status.equals("D")) {
        System.out.print("\nHow much would you like to deposit?: ");
        double value = scan.nextDouble();
        acnt1.deposit(value);
      }

      if (status.equals("W")) {
        System.out.print("\nHow much would you like to withdraw?: ");
        double value = scan.nextDouble();
        acnt1.withdraw(value);
      }

    }
  }  
}