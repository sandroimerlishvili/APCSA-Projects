// Sandro Imerlishvili
// 02/04/22
// B 3/4

import java.util.ArrayList;

class Song {
  public static ArrayList<Song>songs = new ArrayList<Song>();

  private String songTitle = "Unknown";
  private String songArtist = "Unknown";
  private int songYearReleased = 0;
  private int songRating = -1;
  private double songCost = 0;

  public Song(String title, String artist, int year, int rating, double cost) {
    songTitle = title;
    songArtist = artist;
    songYearReleased = year;
    songRating = rating;
    songCost = cost;

    songs.add(this);
  }

  
  public static String arrayListToString(ArrayList<Song>songsList) {
    String songList = "";
    for (Song song : songsList) {
      songList += ("\n" + song);
    }
    return songList;
  }

  public String toString() {
    return ("\n" + songArtist + ", " + songTitle + " (" + songYearReleased + ")" + " | Rating: " + songRating + ", Cost: $" + songCost);
  }

  public static String sortByRating(ArrayList<Song>songsList) {
    for (int i = 0; i < songsList.size(); i++) {
      for (int j = i + 1; j < songsList.size(); j++) {
        if (songsList.get(i).songRating < songsList.get(j).songRating) {
          Song current = songsList.get(i);
          songsList.set(i, songsList.get(j));
          songsList.set(j, current);
        }
      }
    }

    return arrayListToString(songsList);
  }

  public static String sortByPriceAscending(ArrayList<Song>songsList) {
    for (int i = 0; i < songsList.size(); i++) {
      for (int j = i + 1; j < songsList.size(); j++) {
        if (songsList.get(i).songCost > songsList.get(j).songCost) {
          Song current = songsList.get(i);
          songsList.set(i, songsList.get(j));
          songsList.set(j, current);
        }
      }
    }

    return arrayListToString(songsList);
  }

  public static String sortByPriceDescending(ArrayList<Song>songsList) {
    for (int i = 0; i < songsList.size(); i++) {
      for (int j = i + 1; j < songsList.size(); j++) {
        if (songsList.get(i).songCost < songsList.get(j).songCost) {
          Song current = songsList.get(i);
          songsList.set(i, songsList.get(j));
          songsList.set(j, current);
        }
      }
    }

    return arrayListToString(songsList);
  }

  public static String findByArtist(String artist) {
    ArrayList<Song>sortedSongList = new ArrayList<Song>();
    for (Song song : songs) {
      if (song.songArtist.toLowerCase().equals(artist)) {
        sortedSongList.add(song);
      }
    }

    if (sortedSongList.size() == 0) {
      return ("\nNo songs found");
    } else {
      return ("\nHere's what was found: " + arrayListToString(sortByYear(sortedSongList)));
    }
  }

  public static ArrayList<Song> sortByYear(ArrayList<Song>songsList) {
    
    for (int i = 0; i < songsList.size(); i++) {
      for (int j = i + 1; j < songsList.size(); j++) {
        if (songsList.get(i).songYearReleased > songsList.get(j).songYearReleased) {
          Song current = songsList.get(i);
          songsList.set(i, songsList.get(j));
          songsList.set(j, current);
        }
      }
    }

    return songsList;
  }

}