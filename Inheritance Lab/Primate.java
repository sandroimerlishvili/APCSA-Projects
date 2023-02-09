public class Primate extends Animal {
  private boolean hasTail;

  public Primate(String pSpecies, double pWeight, int pAge, boolean pHasTail) {
    super(pSpecies, pWeight, pAge);
    hasTail = pHasTail;
  }

  public void speak(String str) {
    System.out.println("\nThe primate (" + species + ") says \"" + str + "\"");
  }

  public String toString() {
    return ("\nPrimate: \n" + super.toString() + "\nHas Tail: " + hasTail);  
  }
}