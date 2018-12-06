/*
Programmer: Daniel Bailey
Description: Methods related to storing product data in text files
Date:12/5/2018
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ProcessFiles {

  private Path p = Paths.get("C:", "LineTests");
  private Path p2 = Paths.get("C:", "LineTests", "TestResults.txt");
 // private Path p3;


  private void CreateDirectory() {
    File newDirectory = new File(p.toString());
    if (!newDirectory.exists()) {
      newDirectory.mkdir();
    }
  }

  public void WriteFile(EmployeeInfo emp) throws IOException {
    CreateDirectory();
    try {
      File textFile = new File(p2.toString());

      PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(textFile, true)));

        pw.write(emp.toString());
        //  pw.newLine();
        pw.flush();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void WriteFile(ArrayList<Product> products) throws IOException {
    CreateDirectory();
    try {
      File textFile = new File(p2.toString());

      PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(textFile, true)));
      for (int i = 0; i < products.size(); i++) {
        pw.write(products.get(i).toString());
        //  pw.newLine();
        pw.flush();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}