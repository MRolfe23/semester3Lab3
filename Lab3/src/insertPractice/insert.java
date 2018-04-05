/**
 * 
 */
package insertPractice;
import java.util.Scanner;
import java.lang.*;
/**
 * @author rolmicw
 *Write a program that inserts parentheses, a space, and a dash into a string of 10 user-entered numbers
 *to format it as a phone number.  For example, 5153458912 becomes (515)345-8912.  If the user does not
 *enter exactly 10 digits, display an error message.  Continue to accept user input until the user enters 999.
 */
public class insert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DECLARTIONS
		String temp;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program will insert the format for the 10 digit phone number you enter.");
		System.out.println("Please enter a 10 digit number.");
		
		temp = input.nextLine();
		
		while (temp.length() != 10 ) {
			System.out.println("Please enter a *10* digit number.");
			
			temp = input.nextLine();
		}
		StringBuffer phoneNumber = new StringBuffer(temp);
		phoneNumber.insert(0,"(");
		phoneNumber.insert(4,") ");
		phoneNumber.insert(9,"-");
		
		System.out.println("Thank you!");
		System.out.println("Your number has been properly formated.");
		System.out.println(phoneNumber);
		System.out.println("The program has now concluded...");
		
		input.close();

	}

}
