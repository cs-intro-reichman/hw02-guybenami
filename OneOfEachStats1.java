
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {

		int families_count = Integer.parseInt(args[0]);
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
				if(Math.random()>0.5) {
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
