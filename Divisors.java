/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {

		//insert valid integer input into variable num
		int num = Integer.parseInt(args[0]);

		//checking if i is a divisor of num. if so, print i
		for(int i=0; i<=num; i++) {
			if(num%i==0){
				System.out.println(i);
			}
		}
	}
}
