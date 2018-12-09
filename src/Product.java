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

  public Product() {

  }

  /**
   * Constructor for product, takes in name param and sets production number
   * and date manufactured.
   * @param name the name of the product
   */
  public Product(String name) {
    this.name = name;
    serialNumber = currentProductionNumber;
    currentProductionNumber++;                      //shows as bug but necessary for assignment
    manufacturedOn = new Date();
  }

  @Override
  public void setProductionNumber(int productionNumber) {
    currentProductionNumber = productionNumber;     //shows as bug but necessary for assignment
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Date getManufactureDate() {
    return manufacturedOn;                          //shows as bug but necessary for assignment
  }

  @Override
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

  public int compareTo(Product o) {
    return name.compareTo(o.getName());
  }
}

