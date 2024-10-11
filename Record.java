public class Record{
  //Instance variables
  public String title;
  public String artistName;
  public int releaseYear;
  public double price;

  
  //Constructors for Record 
  //No-Agrument
  public Record(){
    title = "null";
    artistName = "null";
    releaseYear = 0;
    price = 0.00;
}
  
  //Parameterize
  public Record(String title, String artistName, int releaseYear, double price){
    this.title = title;
    this.artistName = artistName;
    this.releaseYear = releaseYear;
    this.price = price;
  }
  
  //Acessor and Mutator Methods
  public String getTitle(){
  return title;
  }
  public String getArtistName(){
    return artistName;
  }
  public int getReleaseYear(){
    return releaseYear;
  }
  public double getPrice(){
    return price;
  }

  public void setTitle(String title){
    this.title = title;
  }
  public void setArtistName(String artistName){
    this.artistName = artistName;
  }
  public void setReleaseYear(int releaseYear){
    this.releaseYear = releaseYear;
  }
  public void setPrice(double price){
    this.price = price;
  }
  
 //toString Method Override
  public String toString(){
  return "\n" + "Record: " + title + "\n" + "Artist: " + artistName + "\n" + "Year: " + releaseYear + "\n" + "Price: $" + price;
  }
  
}