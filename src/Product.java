// Harrison Paxton
// Abstract product type that implements Item interface
//Damian Morgan was a big help in getting me through steps 14-16, implementing Comparable and
// getting the repl.it to work
// 10/24/2018

import java.util.Date;

public abstract class Product implements Item, Comparable<Product> {

  int serialNumber;
  String manufacturer = "OracleProduction";
  Date manufacturedOn;
  String name;
  static int currentProductionNumber = 1;

  /**
   * Empty contructor for a product.
   */
  public Product() {

  }

  /**
   * Constructor for product, takes in name param and sets production number and date manufactured.
   *
   * @param name the name of the product
   */
  public Product(String name) {
    this.name = name;
    serialNumber = currentProductionNumber;
    currentProductionNumber++;                      //shows as bug but necessary for assignment
    manufacturedOn = new Date();
  }

  @Override
  /**
   * Sets current production number.
   */
  public void setProductionNumber(int productionNumber) {
    currentProductionNumber = productionNumber;     //shows as bug but necessary for assignment
  }

  @Override
  /**
   * Sets name of product.
   */
  public void setName(String name) {
    this.name = name;
  }

  @Override
  /**
   * Getter for name of product.
   */
  public String getName() {
    return name;
  }

  @Override
  /**
   * Getter for date product was manufactured.
   */
  public Date getManufactureDate() {
    return manufacturedOn;                          //shows as bug but necessary for assignment
  }

  @Override
  /**
   * Getter for product serial number.
   */
  public int getSerialNumber() {
    return serialNumber;
  }

  /**
   * To string method for product.
   *
   * @return Displays manufacturer, serial number, date and name
   */
  public String toString() {
    return "Manufacturer : " + manufacturer + "\n"
        + "Serial Number : " + serialNumber + "\n"
        + "Date : " + manufacturedOn + "\n"
        + "Name : " + name;
  }

  /**
   * Compares name of product.
   *
   * @param o product to be compared
   * @return integer
   */
  public int compareTo(Product o) {
    return name.compareTo(o.getName());
  }
}

