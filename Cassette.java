public class Cassette extends Record {

  //Instance Variables
  private int tapeLength; // in minute
  private boolean isAutoReverse; 

  //No-Agrument Constructor 
  public Cassette(){
    tapeLength = 30;
    isAutoReverse = true;
  }

  //Parameterize Constructor
  public Cassette(int tapeLength, boolean isAutoReverse){
    this.tapeLength = tapeLength;
    this.isAutoReverse = isAutoReverse;
  }

  //Acessor method 
  public int getTapeLength(){
    return tapeLength;
  }

  //Acessor method 
  public boolean getIsAutoReverse(){
    return isAutoReverse; 
  }

  //Mutator Method
  public void setTapeLength(int tapeLength){
    this.tapeLength = tapeLength;
  }

  //Mutator Method
  public void setIsAutoReverse (boolean isAutoReverse){
    this.isAutoReverse = isAutoReverse;
  }

  //toString Method
   public String toString(){
    return super.toString() + "\n" + "Length: " + tapeLength + "\n" + "Auto-Reverse: " + isAutoReverse;
  } 
}