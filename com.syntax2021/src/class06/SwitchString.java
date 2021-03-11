package class06;

import java.util.Scanner;

public class SwitchString {

	public static void main(String[] args) {
		
		String country, food;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your country:");
		
		country = scanner.nextLine();
		
		switch(country.toLowerCase()) {//matching cases must be in lower case
		case "usa":
			food="Burger";
			break;
		case "poland":
			food = "Bigos";
			break;
		case "russia":
			food = "Pierogi";
			break;
		case "afganistan":
			food= "Kebab";
			break;
		default:
			food = "i don't know";
		
				
		}
		System.out.println(food);	
	}

}
