// Harrison Paxton
// EmployeeInfo creates an audit trail on its tests of the production line so that it
// records which employee ran the test.
// 12/05/2018

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeInfo {

  private StringBuilder name;
  private String code;
  private String deptId;
  private Pattern pattern = Pattern.compile("[A-Z][a-z]{3}[0-9]{2}");
  private Scanner in = new Scanner(System.in, "UTF-8");

  /**
   * Constructor for EmployeeInfo.
   */
  EmployeeInfo() {
    setName();
    setDeptId();
    in.close();
  }

  /**
   * Gets name of employee.
   *
   * @return name of employee
   */
  public StringBuilder getName() {
    return this.name;
  }

  /**
   * Gets employee code.
   *
   * @return employee code
   */
  public String getCode() {
    return this.code;
  }

  /**
   * Sets employee name using user input and string builder.
   */
  private void setName() {
    StringBuilder inName = new StringBuilder(inputName());
    if (checkName(inName)) {
      this.name = inName;
      createEmployeeCode(inName);
    } else {
      this.name = inName;
      this.code = "guest";
    }
  }

  /**
   * Creates employee code.
   *
   * @param name employee name, used to create code
   */
  private void createEmployeeCode(StringBuilder name) {
    this.code = name.charAt(0) + name.substring(name.indexOf(" ") + 1);
  }

  /**
   * Reads name from user input.
   *
   * @return inputted name
   */
  private String inputName() {
    System.out.println("Please enter your first and last name: ");
    StringBuilder userInput = new StringBuilder(in.nextLine());

    return userInput.toString();
  }

  /**
   * Checks if inputted name contains a space.
   *
   * @param name inputted name
   * @return true if name contained space
   */
  private boolean checkName(StringBuilder name) {
    return name.toString().contains(" ");
  }

  /**
   * Reads input to get department ID.
   *
   * @return inputted department ID or "None01" if no input
   */
  private String getDeptId() {
    System.out.println("Please enter the department ID: ");
    String inputId = in.nextLine();

    if (validId(inputId)) {
      return inputId;
    } else {
      return "None01";
    }
  }

  /**
   * Setter for department id.
   */
  private void setDeptId() {
    this.deptId = getDeptId();
  }

  /**
   * Gets departments id after tested for input.
   *
   * @return department id
   */
  private String getId() {
    return this.deptId;
  }

  /**
   * Checks if if inputted id is valid based off pattern.
   *
   * @param id id to be tested
   * @return boolean whether or not it was valid
   */
  private boolean validId(String id) {
    Matcher matchId = pattern.matcher(id);
    return matchId.matches();
  }

  /**
   * To string method for employee info.
   *
   * @return Displays employee code and dept. number
   */
  public String toString() {
    return "Employee Code: " + code + "\n"
        + "Department Number: " + deptId;
  }

  /**
   * Takes inputted string and reverses it.
   *
   * @param id String to be reversed
   * @return Returns the reverse of the inputted string
   */
  public String reverseString(String id) {
    StringBuilder reverseSb = new StringBuilder(id);
    reverseSb = reverseSb.reverse();
    return reverseSb.toString();
  }

}
