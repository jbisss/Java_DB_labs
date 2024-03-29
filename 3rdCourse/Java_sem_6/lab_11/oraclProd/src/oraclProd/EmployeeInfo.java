package oraclProd.src.oraclProd;

import java.io.Serializable;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeInfo implements Serializable {
	StringBuilder name = new StringBuilder();
	  String code;
	  String deptId;
	  Pattern p;
	  Scanner in;
	  // Step 20
	  public String reverseString(String id) {
	    char letter = id.charAt(id.length() - 1);

	    if (id.length() == 1) {
	      return Character.toString(letter);

	    } else {
	      // System.out.println(letter);
	      return letter + reverseString(id.substring(0, id.length() - 1));
	    }
	  }

	  public String getDeptId() {
	    System.out.println("Please enter the department ID:");
	    String input2 = in.nextLine();
	    return input2;
	  }

	public EmployeeInfo(StringBuilder name, String code, String deptId) {
		this.name = name;
		this.code = code;
		this.deptId = deptId;
	}

	private void setDeptId() {
	    String inputId = getDeptId();
	    if (validId(inputId)) {
	      deptId = reverseString(inputId);
	      deptId = inputId;
	    } else {
	      deptId = "None01";
	    }
	  }

	  private String getId() {
	    return deptId;
	  }

	  private boolean validId(String id) {
	    Boolean matches = false;

	    Matcher matcher = p.matcher(id);
	    matches = matcher.matches();

	    return matches;
	  }

	  public StringBuilder getName() {
	    return name;
	  }

	  public String getCode() {
	    return code;
	  }

	  private void setName() {
	    name.append(inputName());
	  }

	  private void createEmployeeCode(StringBuilder name) {
	    Boolean containsSpace = name.toString().contains(" ");
	    if (containsSpace) {
	      code = name.toString().substring(0, 1);
	      int spot = name.toString().indexOf(" ");
	      int spot1 = spot;
	      code += name.toString().substring(++spot, name.length());

	    } else {
	      code = "Guest";
	    }
	    //System.out.println(code);

	  }

	  private String inputName() {
	    System.out.print("Please enter your first and last name: ");
	    String input1 = in.nextLine();
	    return input1;
	  }

	  private boolean checkName(StringBuilder name) {
	    Boolean validInput = false;
	    Boolean containsSpace = name.toString().contains(" ");
	    if (containsSpace) {
	      // Returns true is string isn't empty + has the space
	      validInput = true;
	    }
	    return validInput;
	  }

	  public EmployeeInfo() {
		  in = new Scanner(System.in);
		  setName();
		  checkName(name);
		  createEmployeeCode(name);
		  String patternString = "([A-Z])[a-z][a-z][a-z]";
		  p = Pattern.compile(patternString);
		  setDeptId();
		  in.close();
	  }

	  @Override
	  public String toString() {
	    return "Employee name " + this.name.toString() + "\nCode : " + code +
	        "\nDepartment Number : " + deptId;
	  }
}
