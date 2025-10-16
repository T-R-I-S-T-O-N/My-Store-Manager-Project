/*
* Represents pants that will be sold from the clothing store 
* Pants are a type of clothing 
*/
public class Pants extends Clothing{


  private String type; // The type of pants 
  private boolean isBaggy; // Whether the pants are baggy or not 
/*
  *Sets type to "sweats"
  *Sets isBaggy to true 
  */
  public Pants(){
    
  type = "sweats"; 
    isBaggy = true;
    
  }

  /*
  * Sets the brand to the specified brand, price to the specified price
  * color to the specified color, type to the specified size
  * and isBaggy to the specified status 
*/
  public Pants (String brand, double price, String color, String type, boolean isBaggy) {
super(brand, price, color);
 this.type = type;
  this.isBaggy = isBaggy; 
} 

  public Pants (String brand, double price, String color, String type) {
super(brand, price, color);
 this.type = type;
  this.isBaggy = true; 
} 
    /*
 * returns the value assigned to type
  * its a String
  */ 
  
  public String type(){
    return type; 
  }
 
  /*
  *returns the value assigned to isBaggy
  *its a boolean
  */ 

  public boolean isBaggy(){
    return isBaggy;
  }

  /*
 * Sets type to the specified status 
  * Uses "void"
  */ 
  public void setType(String newType){
    type = newType;
  }

  /*
*  Sets isBaggy to the specified status 
* Void + boolean
  */ 
 
  public void setIsBaggy(boolean newIsBaggy){
    isBaggy = newIsBaggy;
  }
  
  /*
  * returns the super.toString() + 
  * "Type of pants: " + type + "Are the Pants Baggy?: " + isBaggy
*/
  
  public String toString(){
    return super.toString() +  "\nType of pants: " + type + "\nAre the Pants Baggy?: " + isBaggy;
  }
}
