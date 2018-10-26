// Harrison Paxton
// Item Interface
// 10/24/2018

import java.util.Date;

public interface Item {

  public final String manufacturer = "OracleProduction";
  //A constant called manufacturer that would be set to “OracleProduction”.

  public void setProductionNumber(int productionNumber);
  //A method setProductionNumber that would have one integer parameter

  public void setName(String name);
  //A method setName that would have one String parameter

  public String getName();
  //A method getName that would return a String

  public Date getManufactureDate();       // brings up error cause Date hasn't been implemented yet
  //A method getManufactureDate that would return a Date

  public int getSerialNumber();
  //A method getSerialNumber that would return an int
}
