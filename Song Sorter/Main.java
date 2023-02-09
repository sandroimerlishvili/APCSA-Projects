// Sandro Imerlishvili
// 02/04/22
// B 3/4

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Song s1 = new Song("Another Brick In The Wall Part 2", "Pink Floyd", 1979, 10, 0.99);
    Song s2 = new Song("Nothing Else Matters", "Metallica", 1991, 10, 0.99);
    Song s3 = new Song("Baby", "Justin Bieber", 2010, 0, 0.01);
    Song s4 = new Song("Don't Stop Believing", "Journey", 1981, 8, 0.80);
    Song s5 = new Song("With or Without You", "U2", 1987, 7, 1.50);
    Song s6 = new Song("Wish You Were Here", "Pink Floyd", 1975, 10, 0.90);
    Song s7 = new Song("Enter Sandman", "Metallica", 1991, 8, 0.99);
    Song s8 = new Song("Master of Puppets", "Metallica", 1986, 10, 0.85);
    Song s9 = new Song("Mother", "Pink Floyd", 1979, 9, 0.99);
    Song s10 = new Song("Time", "Pink Floyd", 1973, 10, 0.75);
    Song s11 = new Song("Money", "Pink Floyd", 1973, 10, 0.75);
    Song s12 = new Song("Sunday Bloody Sunday", "U2", 1983, 8, 0.65);
    Song s13 = new Song("Separate Ways (Worlds Apart)", "Journey", 1983, 9, 0.85);
    Song s14 = new Song("Creeping Death", "Metallica", 1984, 9, 0.75);
    Song s15 = new Song("Every Breath You Take", "The Police", 1983, 8, 0.90);
    Song s16 = new Song("Message In A Bottle", "The Police", 1979, 9, 0.75);
    Song s17 = new Song("Wheel In The Sky", "Journey", 1978, 10, 0.65);
    Song s18 = new Song("In The Air Tonight", "Phil Collins", 1981, 9, 0.70);
    Song s19 = new Song("Another Day In Paradise", "Phil Collins", 1989, 10, 0.75);
    Song s20 = new Song("Sussudio", "Phil Collins", 1985, 8, 0.65);
    
    // Can declare an infinite amount of songs
  
    System.out.println("\nThis is a collection of songs.");
    
    System.out.println(Song.arrayListToString(Song.songs));

    Scanner scan = new Scanner(System.in);

    int input = -1;

    while (input != 0) {

      System.out.println("\nWhat would you like to do? (enter 0 to exit): ");
      System.out.println("\n(1): Sort by rating");
      System.out.println("(2): Sort by price (ascending)");
      System.out.println("(3): Sort by price (descending)");
      System.out.println("(4): Find songs by a specific artist\n");

      input = scan.nextInt();

      while (input < 0 || input > 4) {
        System.out.println("\nThat's an invalid input! Try again.\n");
        input = scan.nextInt();
      }

      if (input == 1) {
        System.out.println("\nSorted by Rating (Descending): ");
        System.out.println(Song.sortByRating(Song.songs));
      } else if (input == 2) {
        System.out.println("\nSorted by Price (Ascending): ");
        System.out.println(Song.sortByPriceAscending(Song.songs));
      } else if (input == 3) {
        System.out.println("\nSorted by Price (Descending): ");
        System.out.println(Song.sortByPriceDescending(Song.songs));
      } else if (input == 4) {
        System.out.print("\nWhat artist would you like to search for?: ");
        scan.nextLine();
        String artist = scan.nextLine().toLowerCase();

        System.out.println(Song.findByArtist(artist));
      }

    }

    System.out.println("\nBye! (͡° ͜ʖ ͡°)");

    scan.close();
  }
}