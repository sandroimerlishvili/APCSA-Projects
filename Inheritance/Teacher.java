public class Teacher extends Faculty {
  private String subject;

  public Teacher (String tName, int tAge, int tSalary, String tSubject) {
    super(tName, tAge, tSalary);
    subject = tSubject;
  }

  public void complain() {
    int random = (int)(Math.random() * 3);

    System.out.println("\n" + name + ": ");
    
    if (random == 0) {
      System.out.println("\nYou darn children!");
    } else if (random == 1) {
      System.out.println("\nListen to the teacher!");
    } else {
      System.out.println("\nStop that!");
    }
  }

  public String toString() {
    return (super.toString() + "\nProfession: Teacher" + "\nSubject: " + subject);
  }
  
}