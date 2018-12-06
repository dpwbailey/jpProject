import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ViewFileInfo extends ProcessFiles {

  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new FileReader("C:/LineTests/TestResults.txt"));
      while (br.readLine() != null) {
        System.out.println(br.readLine());
      }
    } catch (java.io.IOException e) {
      e.printStackTrace();
    }

  }

}
