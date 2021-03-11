package class04;

public class Task1 {

	public static void main(String[] args) {
		
		
		boolean diploma = true;
		double gpa = 3.2;
		
		if(diploma) {
			System.out.println("Congratilation");
			if(gpa>=3.5) {
				System.out.println("You are eligable for scholarship");
			}else {
				System.out.println("You should have studied harder ");
			}
		}else {
			System.out.println("You should work on your diploma");
			
		}

	}

}


/*

Write a program to store a boolean value of whether user has diploma or not. 
If user has a diploma, you should say congratulations, otherwise program should suggest to get a degree. 
Then if user has a degree program should check a gpa score. If gpa score is higher or equals to 3.5 → output should say “You are eligible for scholarship”, otherwise → “You should have studied harder” .












*/