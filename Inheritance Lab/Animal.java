public class Animal {
  protected String species;
  protected double weight;
  protected int age;

  public Animal(String aSpecies, double aWeight, int aAge) {
    species = aSpecies;
    weight = aWeight;
    age = aAge;
  }

  public String toString() {
    return ("\nSpecies: " + species + "\nWeight: " + weight + " lbs.\nAge: " + age + " years");  
  }
}