package class04;

public class Task2 {

	public static void main(String[] args) {
		
	double rate = 3.0;
	double housevalue = 250000;
	
	if(rate > 4.5) {
		System.out.println("I won't buy a house");
		
	}else {
		System.out.println("I will consider buying a house");
		if(housevalue>200000) {
			System.out.println("I will take a loan");
		}else {
			System.out.println("I will pay with cash");
		}
	}

	}

}

//Create a Java program and store values of mortgage rate and mortgage price. 
//First, program should check if rate is higher than 4.5 user will not buy a house, 
//otherwise user will consider buying. Once user decides to buy a house, 
//if price of the house is larger than 200000 than user will take a loan, otherwise user will pay cash.
