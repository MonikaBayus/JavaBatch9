package class011;

public class Task2 {

	public static void main(String[] args) {
		
		String [][]names={
							{"Mr.", "Mrs.","Ms.", "Miss "},
							{"Smith", "Jordan", "Jackson", "Obama"}
		};
		
		System.out.println(names[0][0] + names[1][0]);
		System.out.println(names[0][1] + names[1][1]);
		System.out.println(names[0][2] + names[1][2]);
		System.out.println(names[0][3] + names[1][3]);

		
		
		System.out.println("---------------------------------");
		
		String[][] students= {
				{"Alex ", "Eliza" , "Eva", "Anna"},
				{"A", "B", "C", "D", "F"}
							
		};
		String names1 = students[0][0] + "grade is: " + students[1][1];
		System.out.println(names1);
		System.out.println(students[0][2] + "grade is: " + students[1][0]);

		



	}

}
