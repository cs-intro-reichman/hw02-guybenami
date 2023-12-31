import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int families_count = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
		
		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.

		//setting counters
		int total_children_count = 0;
		int families_count_with_2 = 0;
		int families_count_with_3 = 0;
		int families_count_with_4plus = 0;

		//creating x number of families. x = families_count
		for(int i=0 ; i<families_count ; i++) {
			
			//setting local variables for each new family
			boolean is_boy = false;
			boolean is_girl = false;
			int children_count = 0;
			while(!is_boy || !is_girl) {
				if(generator.nextDouble()>=0.5) {
					is_boy = true;
				}
				else {
					is_girl = true;
				}
				children_count++;
			}
			total_children_count += children_count;
			if(children_count==2)
				families_count_with_2++;
			else if(children_count==3)
				families_count_with_3++;
			else
				families_count_with_4plus++;
		}
		//compute the average number of children per family
		double avg_children_in_family = total_children_count / (double)families_count;
		System.out.println("Average: " + avg_children_in_family + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + families_count_with_2);
		System.out.println("Number of families with 3 children: " + families_count_with_3);
		System.out.println("Number of families with 4 or more children: " + families_count_with_4plus);

		//checking the most common number of children per family
		if(families_count_with_2>=families_count_with_3) {
			if(families_count_with_2>=families_count_with_4plus)
				System.out.println("The most common number of children is 2.");
			else
				System.out.println("The most common number of children is 4 or more.");
		}
		else if(families_count_with_3>=families_count_with_4plus)
			System.out.println("The most common number of children is 3.");
		else
			System.out.println("The most common number of children is 4 or more.");
	}
}
