import java.util.ArrayList;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {

    System.out.println("This is a zoo!");
    
    Animal Richard = new Primate("monkey", 50.4, 8, true);
    Animal Eugene = new Primate("gorilla", 200.8, 25, false);
    Animal Sally = new Bird("penguin", 30.0, 4, false);
    Animal Bob = new Bird("crow", 4.5, 2, true);

    ArrayList<Animal> animals = new ArrayList<>();

    Primate Bill = new Primate("gorilla", 150.6, 20, false);
    Primate Sarah = new Primate("monkey", 32.25, 6, true);
    Bird George = new Bird("owl", 20.4, 7, true);
    Bird Susanne = new Bird("crow", 3.2, 1, true);
    
    animals.add(Richard);
    animals.add(Eugene);
    animals.add(Sally);
    animals.add(Bob);

    animals.add(Bill);
    animals.add(Sarah);
    animals.add(George);
    animals.add(Susanne);

    System.out.println("\nArrayList: ");
    
    for (Animal animal : animals) {
      System.out.println(animal);
    }

    Animal[] animals2 = new Animal[8];
    animals2[0] = Richard;
    animals2[1] = Eugene;
    animals2[2] = Sally;
    animals2[3] = Bob;

    animals2[4] = Bill;
    animals2[5] = Sarah;
    animals2[6] = George;
    animals2[7] = Susanne;

    System.out.println("\nArray: ");
    System.out.println(Arrays.toString(animals2));

    Bill.speak("Roar!");
    Sarah.speak("Cheep Cheep!");
    George.speak("Hoo Hoo!");
    Susanne.speak("Caw Caw!");


  }
}