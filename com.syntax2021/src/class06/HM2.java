package class06;

import java.util.Scanner;

public class HM2 {

	public static void main(String[] args) {
		
	String grade;
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter your grade:");		
	grade = scanner.next();
	
	String yourgrade;
	
	switch(grade.toUpperCase()) {
	
	case "A":
		yourgrade= "A-Excellent";
		break;
	case "B":
		yourgrade = "B-Good";
		break;
	case "C":
		yourgrade = "C-Average";
		break;
	case "D":
		yourgrade = "D-Bad";
		break;
	case "F":
		yourgrade = "F-Fail";
		break;
	default:
		yourgrade = "Not acceptable";
	}
	System.out.println("You entered: "+ grade + " - " + " which is, " + yourgrade);

	}

}


/*
Allow user to enter grade (A, B, or C etc...) and then provide explanation:
 A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
  At the end your program should print which grade was entered by a user with explanation.



*/