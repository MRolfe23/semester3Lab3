/**
 * 
 */
package wordCounter;
import java.util.Scanner;
/**
 * @author rolmicw
 *
 */
public class wordCount {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// DECLARATIONS
		String sentance;
		
		System.out.println("This prgram will count all the words in the string you enter.");
		
		System.out.println("Please enter a sentance to be counted.");
		sentance = input.nextLine();
		
		System.out.println("The word count for your sentance is: " + wordCount(sentance));
		
		input.close();
		
		System.out.println("The program has now concluded...");
	}
	
	public static int wordCount(String input) {
		if (input.equals(null) || input.isEmpty()) {
			return 0;
		}
		
		String[] words = input.split("\\s+|\\.|\\?|\\!|\\-|\\;|\\,"); 
		return words.length;
		
	}


}
