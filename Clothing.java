// Represents a Clothing item that will be sold at a Clothing Store

public class Clothing{

  //Makes the attributes/variables for a Clothing
 
  private String brand; //   brand of the clothing
  private double price;  //    Price of the clothing
  private String color;   //  color of the clothing
/*
  * Sets brand to "no brand", price to 20.0, and color to "white"
  * No-Arguement Constructor
*/
  public Clothing(){
  brand = "No brand";
    price = 20.0;
    color = "white";
}

/*
  * Parameterzied Constructor
  *   Sets brand to specified brand, price to specified price,
  *    and color to specified color
*/
  public Clothing(String brand, double price, String color  ) {
  this.brand = brand;
  this.price = price;
  this.color = color;
}

  public Clothing(String brand, double price) {
   this.brand = brand;
  this.price = price;
this.color = "black";
}

/*
* Accessor Methods
* returns the value assigned to brand
*/
  public String getBrand() {
    return brand;
  }

  /*
* returns the value assigned to price
* uses a double data type
*/ 

  public double getPrice(){
  return price;
}
 
/*
* returns the value assigned to color
* Uses a public string data type
*/

  public String getColor(){
  return color;
}

/*
*  Returns the "Brand name: " + brand + "Price: $" + price + "Color: " + color
* 
*/

  public String toString(){
    return "Brand name: " + brand + "\nPrice: $" + price + "\nColor: " + color;  
 
  }
}  

