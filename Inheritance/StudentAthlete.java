public class StudentAthlete extends Student {
  private String sport;

  public StudentAthlete(String sName, int sAge, double sGPA, String sportName) {
   super(sName, sAge, sGPA);
   sport = sportName;
  }

  public void sayAge() {
    super.sayAge();
  }
  
  public String toString() {
    return (super.toString() + "\nSport: " + sport);
  }
}