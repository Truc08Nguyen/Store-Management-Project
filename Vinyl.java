public class Vinyl extends Record {

  //Instance Variables
  private int diameter; // in inches 
  private int speed; // RPM 

  //No-Agrument Constructor 
  public Vinyl(){
    diameter = 0;
    speed = 0;
  }

  //Parameterize Constructor
  public Vinyl(int diameter, int speed){
    this.diameter = diameter;
    this.speed = speed;
  }

  //Acessor method 
  public int getDiameter(){
    return diameter;
  }

  //Acessor method 
  public int getSpeed(){
    return speed; 
  }

  //Mutator Method
  public void setDiameter(int diameter){
    this.diameter = diameter;
  }

  //Mutator Method
  public void setSpeed (int speed){
    this.speed = speed;
  }

  //toString Method
  public String toString(){
    return super.toString() + "\n" + "Diameter: " + diameter + "\n" + "RPM: " + speed;
  }
}