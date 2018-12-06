/**
 * Programmer: Daniel Bailey Description: OOP Project Date: 9/29/2018
 **/


public interface Item {

  String manufacturer = "OracleProduction";

  void setProductionNumber(int num);

  void setName(String name);

  String getName();

  String getManufactureDate(String Date);

  int getSerialNumber(int serialNum);


}