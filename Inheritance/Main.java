import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Person Bob = new Student("Bob", 16, 3.5);
    Person Bill = new StudentAthlete("Bill", 15, 3.0, "Soccer");
    Person George = new Student("George", 17, 4.0);

    System.out.println(Bob);
    System.out.println(Bill);
    System.out.println(George);

    Teacher Jenny = new Teacher("Jenny", 45, 30000, "Math");

    System.out.println(Jenny);

    Jenny.complain();

    ArrayList<Person> people = new ArrayList<>();

    people.add(Bob);
    people.add(Bill);
    people.add(George);

    for (Person person : people) {
      person.sayAge();
    }
    
  }
}