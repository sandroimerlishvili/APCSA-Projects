public class Faculty extends Person {
  protected int salary;

  public Faculty(String fName, int fAge, int fSalary) {
    super(fName, fAge);
    salary = fSalary;
  }

  public String toString() {
    return ("\nFaculty:\n\n" + super.toString() + "\nSalary: " + salary);
  }

}