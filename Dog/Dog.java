import java.util.Scanner;

class Dog {
  // states
  private String name;
  private String breed;
  private int age;
  private boolean gender;
  private boolean bark;
  
  Scanner scan = new Scanner(System.in);

  public Dog() {
    System.out.print("Please enter your dog's name: ");
    name = scan.nextLine();

    System.out.print("Please enter your dog's breed: ");
    breed = scan.nextLine();

    System.out.print("Please enter your dog's age as an int: ");
    age = scan.nextInt();

    System.out.print("Is your dog male (true) or female (false): ");
    gender = scan.nextBoolean();
    }

  public void describeDog() {
    System.out.println("Your dog's name is " + name);
    System.out.println("Your dog's breed is " + breed);
    System.out.println("Your dog's age is " + age);
    System.out.println("Your dog's gender is " + gender);
    
  }

  public void bark() {
    System.out.print("Do you want your dog to bark? (true - yes, false - no): ");
    bark = scan.nextBoolean();
    if (bark == true) {
      System.out.println("\nWOOF!\n");
    } else {
      System.out.println("\n):\n");
    }
  }
}