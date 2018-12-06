import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeInfo {

  //Step 18
  StringBuilder name;
  String code;
  String deptId;
  Pattern p;
  Scanner in;
  String pattern;


  private void setDeptId() {
    this.deptId = getDeptId();
  }

  private boolean validID(String id) {
    boolean valid = false;

    p = Pattern.compile(pattern);

    if (pattern.matches(id)) {
      valid = true;
    }

    return valid;
  }

  public StringBuilder getName() {
    return this.name;
  }

  public String getCode() {
    return this.code;
  }

  private void setName(String name) {
    this.name = new StringBuilder(name);
  }

  private void createEmployeeCode(StringBuilder name) {
    int i = 0;
    boolean onLastName = false;
    StringBuilder code = new StringBuilder();
    if (checkName(name)) {
      this.code = "Guest";
    } else {
      while (i < name.length()) {
        if (i == 0) {
          code.append(name.charAt(i));
        }

        if (name.charAt(i) == ' ') {
          name.deleteCharAt(i);
          onLastName = true;

        }
        if (onLastName) {
          code.append(name.charAt(i));
        }
        i++;


      }
      this.code = code.toString();
    }
  }

  private String inputName() {

    System.out.println("Please enter your first and last name:");
    String name = in.nextLine();
    // scan.close();
    return name;
  }

  private boolean checkName(StringBuilder name) {
    boolean isGuest = true;
    int i = 0;

    while (i < name.length()) {
      if (name.charAt(i) == ' ') {
        isGuest = false;
      }
      i++;
    }
    return isGuest;
  }


  @Override
  public String toString() {
    return
        " Employee Code      : " + code + '\n' +
        " Department Number  : " + deptId;
  }

  public EmployeeInfo() {
    pattern = "[A-Z][a-z]{3}\\d{2}";
    in = new Scanner(System.in);
    // this.name = name;
    setName(inputName());
    createEmployeeCode(name);
    setDeptId();
    in.close();
  }

  public String getDeptId() {
    System.out.println("Please enter the department ID:");
    String deptId = in.nextLine();
    if (validID(deptId)) {
     String reverse = reverseString(deptId);
      this.deptId = deptId;
    } else {
      this.deptId = "None01";
    }

    return deptId;
  }

  //flips a string
  public String reverseString(String id) {
    String reverse = "";
    int i = id.length() - 1;
    while (i >= 0) {
      reverse += id.charAt(i);
      i--;
    }
    return reverse;
  }
}
