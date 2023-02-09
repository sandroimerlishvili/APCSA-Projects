public class Bird extends Animal {
  private boolean canFly;

  public Bird(String bSpecies, double bWeight, int bAge, boolean bCanFly) {
    super(bSpecies, bWeight, bAge);
    canFly = bCanFly;
  }

  public void speak(String str) {
    System.out.println("\nThe bird (" + species + ") says \"" + str + "\"");
  }

  public String toString() {
    return ("\nBird: \n" + super.toString() + "\nCan Fly: " + canFly);  
  }
}