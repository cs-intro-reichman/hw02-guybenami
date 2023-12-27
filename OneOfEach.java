
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		//setting boolean variable is_boy, is_girl to false;
		boolean is_boy = false;
		boolean is_girl = false;
		//setting children counter to 0
		int children_count = 0;

		//while no first boy yet OR no first girl yet
		while(!is_boy || !is_girl) {
			//using Math.random() to create 50%-50% odds to get a boy or a girl
			if(Math.random()>0.5) {
				//setting is_boy to true and print b
				is_boy = true;
				System.out.print("b ");
			}
			else {
				//setting is_girl to true and print g
				is_girl = true;
				System.out.print("g ");
			}
			//increasing children_count by 1
			children_count++;
		}
		//new line and print final message
		System.out.println();
		System.out.println("You made it... and you now have " + children_count + " children.");
	}
}
