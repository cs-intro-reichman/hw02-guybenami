/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {

		//variable newNum stores a new random number in range each time
		int newNum  = (int)(Math.random()*10);
		//lastNum stores the last random number that was printed
		int lastNum = -1;

		//do while loop which runs at least one time
		do {
			/* print space between numbers in such a way that there is no
			space after the last number and not before the first number */
			if(lastNum!=-1) System.out.print(" ");

			System.out.print(newNum);
			//implement newNum into lastNum
			lastNum = newNum;
			//creating new random number
			newNum = (int)(Math.random()*10);
			
		}while(newNum>=lastNum); //checking if newNum is now greater or equal to the last number that was printed
		System.out.println();
	}
}
