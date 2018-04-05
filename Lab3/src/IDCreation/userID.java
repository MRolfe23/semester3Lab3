/**
 * 
 */
package IDCreation;
import java.util.Scanner;
/**
 * @author rolmicw
 * Write an application that prompts a user for a full name and street address and constructs an ID
 * from the user’s initials and numeric part of the address.  For example, the user William Henry Harrison
 * who lives at 34 Elm would have an ID of WHH34, whereas user Addison Mitchell who lives at 1778 Monroe
 * would have an ID of AM1778.
 */
public class userID {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		//Declarations
		String name;
		String address;
		
		System.out.println("This program will create a username from your name and address.");
		
		System.out.println("Please enter your name ex(Firstname Lastname)");
		name = input.nextLine();
		
		System.out.println("Please enter your address ex(1234 Street)");
		address = input.nextLine();
		
		System.out.println("Thank you!");
		System.out.println("We have created your new username.");
		System.out.println("Username: " + username(name, address));
		
		System.out.println("The program has concluded...");
		input.close();

	}
	
	public static String username(String person, String place) {
		String username;
		
		String[] name = person.split("\\s+");
		String[] address = place.split("\\s+");
		username = name[0].charAt(0) + "" + name[1].charAt(0) + address[0];
		
		return username;
	}

}
