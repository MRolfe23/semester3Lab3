/**
 * 
 */
package Password;
import java.util.Scanner;
/**
 * @author rolmicw
 *
 */
public class passwordPractice {
	
	public static void main(String[] args) {
		
		// DECLARATIONS
		Scanner input = new Scanner(System.in);
		String password;
		boolean pass;
		
		System.out.println("This program will have you enter a password and have it meet the requirements!");
		System.out.println();
		System.out.println("Enter a password that is between 6 and 10 characters long.");
		System.out.println("Please ensure that the password contains 1 numeric value, 1 Letter value and one uppercase letter. ");
		password = input.next();
		
		pass = validate(password);
		
		while (pass == false) {
			System.out.println("Please ensure that the password contains 1 numeric value, 1 Letter value and one uppercase letter. ");
			password = input.next();
			pass = validate(password);
		}
		input.close();
		
		System.out.println("Your password meets all requirements!");
		System.out.println("The program has now concluded...");
	}
	private static boolean validate(String password) {
		  
		boolean containsLower = false;
		boolean containsDigit = false;
		boolean containsUpper = false;
		
		if (password == null || password.length() < 6 || password.length() > 10) {
			  return false;
		  } else {
			  for (char c : password.toCharArray()) {
				    if (Character.isLowerCase(c)) {
				    	containsLower = true;
				    } else if (Character.isDigit(c)) {
				    	containsDigit = true;
				    } else if (Character.isUpperCase(c)) {
				    	containsUpper = true;
				    } else {
				    	
				    }		    
				  }
		  }
		  if (containsLower == true && containsDigit == true && containsUpper == true) {
		      return true;
		    } else {
			  return false;
		  }
		  
		}

}
