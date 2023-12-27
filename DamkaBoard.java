/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		//insert integer input from user into variable n
		int n = Integer.parseInt(args[0]);
		//iterate for each row
		for(int i=0 ; i<n ; i++) {
			//iterate for each * in a row
			for(int j=0 ; j<n ; j++) {
				//checking if the row should start with * or space
				if(i%2==0)
					System.out.print("* ");
				else 
					System.out.print(" *");
			}
			//making a new line
			System.out.println();
		}
	}
}
