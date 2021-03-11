package class06;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
	
String sale;
String saleItem;
double price = 0;
double discount = 0;
double finalPrice = price * discount;
double discount1;
double five = 0.05;
double ten = 0.1;
double twenty = 0.2;
double thirty = 0.3;
String percantage = null;

//double finaPrice = price*five;

	System.out.println("Do you have a sale today? ");
	sale = scanner.next();
	
	if(sale.equalsIgnoreCase("yes")) {
	System.out.println("What is on sale today? ");
	saleItem = scanner.next();
	if(saleItem.equalsIgnoreCase("dress")) {
		System.out.println("What is your price on the dress? ");
		price = scanner.nextDouble();
		System.out.println("What is a dicount on this item? ");
		percantage = scanner.next();
		System.out.println("What is my total price with discount on this item? ");
	
		if(price<10 && percantage.equals("5%")) {
			System.out.println("Your total price is: " + price*five);
				
			}else if(price>=10 && price<100) {
			discount = scanner.nextDouble();
			}else if(price>=100 && price<500) {
			discount = scanner.nextDouble();
			System.out.println("Your discount is 20%");
			}else if(price>=500 ) {
				discount = scanner.nextDouble();		
		}
		
		}else {
			System.out.println("We dont have sale on this item");
		}
		
		
	}
	

	
	}

}

//we need to calculate final price after the discount
//Final price after discount;

//Check if there is a  sale;
//if no sale -> I am not going for shopping
//if there is a sale -> ask for the item -> ask for the price
//if price <10 -> 5% discount
//if price between 10 and 100 -> apply 10% discount
//if price is between 100 and 500 -> apply 20% discount
//if price is more than 500 -> apply 30%;
//"which item you purchased, what was original price, what discount applies and final price

