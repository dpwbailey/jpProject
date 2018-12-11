/*
Programmer: Daniel Bailey
Description: Testing class
Date:12/5/2018
 */
import java.io.IOException;
import java.util.ArrayList;

public class TestProductionLine extends ProcessFiles{

  public static void main(String[] args) {
    EmployeeInfo testEmployee = new EmployeeInfo();

    System.out.println(testEmployee.toString());
   // System.out.println(testEmployee.reverseString(testEmployee.deptId));
  ProcessFiles processFiles = new ProcessFiles();
    ArrayList<Product> products = new ArrayList<>();
    Main main = new Main();

    try {
      processFiles.WriteFile(main.testCollection(products));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
