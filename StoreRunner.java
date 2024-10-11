import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    System.out.println("Welcome to our Record store!!!");

    System.out.println("Would you like to buy 1. Vinyl or 2. Cassette for today?: ");
    int choice = input.nextInt();
    input.nextLine();
    
    if (choice == 1) {
      //Vinyl object
      Vinyl vinyl = new Vinyl();
      // Get title input
      System.out.println("What is the song's name that you are looking for? ");
      String title = input.nextLine();
      vinyl.setTitle(title);
      // Get artist name input
      System.out.println("Who is the artist of the song? ");
      String artistName = input.nextLine();
      vinyl.setArtistName(artistName);
      //Get release year input
      System.out.println("When was it released (year)? ");
      int releaseYear = input.nextInt();
      vinyl.setReleaseYear(releaseYear);
      //Get diameter
      System.out.println("Diameter? ");
      int diameter = input.nextInt();
      vinyl.setDiameter(diameter);
      //Get speed
      System.out.println("RPM (minute)? ");
      int speed = input.nextInt();
      vinyl.setSpeed(speed);
      //Get Price
      System.out.println("Price that is right for you? ");
      double price = input.nextDouble();
      vinyl.setPrice(price);
      
      System.out.println(vinyl.toString());
    } else {
    //Cassette object
    Cassette cassette = new Cassette();
    
    // Get title input
      System.out.println("What is the song's name that you are looking for? ");
      String title = input.nextLine();
      cassette.setTitle(title);
      // Get artist name input
      System.out.println("Who is the artist of the song? ");
      String artistName = input.nextLine();
      cassette.setArtistName(artistName);
      //Get release year input
      System.out.println("When was it released (year)? ");
      int releaseYear = input.nextInt();
      cassette.setReleaseYear(releaseYear);
      //Get tape length
      System.out.println("Length in inches? ");
      int tapeLength = input.nextInt();
      cassette.setTapeLength(tapeLength);
      //Get Price
      System.out.println("Price that is right for you? ");
      double price = input.nextDouble();
      cassette.setPrice(price);
      
     System.out.println(cassette.toString());
    }
  
    // Closes the Scanner object
    input.close();
    
  }
}