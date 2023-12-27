/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){

		//// insert string input into variable s
		String s = args[0];

		// iterate through s characters backwards and prints them
		for(int i=s.length()-1 ; i>=0 ; i--) {
			System.out.print(s.charAt(i));
		}
		// new line
		System.out.println();
		// print middle chararcter of string s.
		// if there even number of chars in s, print the last char of the first half
		System.out.println("The middle character is " + s.charAt((s.length()-1)/2));
	}
}
