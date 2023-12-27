/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		//insert integer input from user into variable num
		int num = Integer.parseInt(args[0]);
		//creating possitive outcome message
		String outcome_message = num + " is a perfect number since " + num + " = 1";
		int divisors_sum = 1;

		//iterate to check numbers from 2 to num-1 to see if they divide num
		for(int i=2 ; i<num ; i++) {
			if(num%i==0) {
				//adding the new divisor to the final message and to divisors_sum
				outcome_message += " + " + i;
				divisors_sum += i;
			}
		}
		if(num==divisors_sum)
			System.out.println(outcome_message);
		else
			System.out.println(num + " is not a perfect number");
	}
}
