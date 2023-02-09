import java.util.Scanner;

public class Account {

  Scanner scan = new Scanner(System.in);

  private String Name;
  private double Balance;
  private final double INTERESTRATE = 0.02;
  
  public Account(String name) {
    Name = name;
    System.out.print("\nStarting balance: ");
    Balance = scan.nextDouble();
  } 

  public void withdraw(double amount) {
    if (Balance >= amount) {
      Balance -= amount;
      System.out.print("\nYour new balance is: " + Balance);
    } else {
      System.out.println("\nInsufficient funds");
    }
    
  }

  public void deposit(double amount) {
    Balance += amount;
    System.out.print("\nYour new balance is: " + Balance);
  }
}