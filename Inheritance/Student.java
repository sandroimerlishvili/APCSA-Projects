public class Student extends Person {
  protected double GPA;

  public Student(String sName, int sAge, double sGPA) {
    super(sName, sAge);
    GPA = sGPA;
  }

  public String toString() {
    return ("\nStudent:\n\n" + super.toString() + "\nGPA: " + GPA);
  }
}