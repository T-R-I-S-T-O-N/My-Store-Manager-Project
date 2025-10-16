
/*
* Represents a Tshirt that will be sold from the clothing store
* TShirt is a type of clothing
*/
public class TShirt extends Clothing{


  private String size; // the Size of the T-shirt
  private boolean hasDesign; // Whether the T-shirt has a design or not
/*
  *Sets size to "L"
  *Sets hasDesign to false
  */
  public TShirt(){
   
   size = "L";
    hasDesign = false;
   
  }

  /*
  * Sets the brand to the specified brand, price to the specified price
  * color to the specified color, size to the specified size
  * and hasDesign to the specified status
*/
  public TShirt (String brand, double price, String color, String size, boolean hasDesign ) {
super(brand, price, color);
 this.size = size;
  this.hasDesign = hasDesign;
}

  public TShirt (String brand, double price, String color, String size) {
super(brand, price, color);
 this.size = size;
  this.hasDesign = true;
}
    /*
* returns the size value. 
* String data type
*/ 
 
  public String size(){
    return size;
  }
 
  /*
*returns the value assigned to hasDesign
* boolean data type
*/ 

  public boolean hasDesign(){
    return hasDesign;
  }

  /*
*Sets size to the specified status
String data type
*/ 

  public void setSize(String newSize){
    size = newSize;
  }

  /*
*Sets hasDesign to the specified status
*boolean data type
*/ 
 
  public void setHasDesign(boolean newHasDesign){
    hasDesign = newHasDesign;
  }
 
  /*
* returns the super.toString() +  "Size: " + size + "Has Design on T?: " + hasDesign
* uses a toString and "super"
*/ 
 
  public String toString(){
    return super.toString() +  "\nSize: " + size + "\nHas Design on T?: " + hasDesign;
  }
}
