package Assignments;

public class Task4 {

	public static void main(String[] args) {
		
		int count = 0;
		
		String[][]countries= {{"north america 1", "north america 2", "south america 3", "south america 4"},
								{"europe 1", "europe 2", "europe 3", "asia", "african", "african2", "african3"}};
	
		
		
		for(String[] elements: countries) {
			for(String c: elements) {
				System.out.println(c);
			}
		}
		System.out.println("--------------------------");
		
		
		for(int i=0; i<countries.length; i++) {
			for(int j=0; j<countries[i].length; j++) {
			count++;
			}
		
		}
		System.out.println(count);	
		
		
		


			}
			
		
	
	
		}

	





//4.Create 2D array of countries: north america countries, south america countries, europe countries, asian countries, african countries. 
//Then print all values from that array using 2 different loops and calculate how many total countries have been stored.
