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

  public Product(String name) {
    this.name = name;
    serialNumber = currentProductionNumber;
    currentProductionNumber++;
    manufacturedOn = new Date();
  }

  @Override
  public void setProductionNumber(int productionNumber) {
    currentProductionNumber = productionNumber;
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
    return manufacturedOn;
  }

  @Override
  public int getSerialNumber() {
    return serialNumber;
  }


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

