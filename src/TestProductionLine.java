import java.io.IOException;

public class TestProductionLine extends ProcessFiles{

  public static void main(String[] args) {
    EmployeeInfo testEmployee = new EmployeeInfo();

    System.out.println(testEmployee.toString());
   // System.out.println(testEmployee.reverseString(testEmployee.deptId));
  ProcessFiles processFiles = new ProcessFiles();
    try {
      processFiles.WriteFile(Main.testCollection());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
