package class04;

/*
 * to donate
 * you must be 18 or older, otherwise you cannot
 * your weight must more than 110 lbs, otherwise you cannot donte
 * 
 */

public class NestedIfExample {

	public static void main(String[] args) {
		
		
		int age = 20;
		int weight = 120;
		
	if(age>=18 && weight>110) {
		System.out.println("You can donate");
	}else {
		System.out.println("Not aligable");
	}

	}

}
