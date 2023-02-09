public class Person {
  protected String name;
  protected int age;

  public Person(String pName, int pAge) {
    name = pName;
    age = pAge;
  }

  public void sayAge() {
    System.out.println("\n" + name + ": I'm " + age + " years old!");
  }

  public String toString() {
    return ("Name: " + name + "\nAge: " + age);
  }
}