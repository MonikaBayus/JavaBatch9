package class011;

public class Task3 {

	public static void main(String[] args) {
		
		String[][]cars = {{"Ford", "Ford1", "Ford2"}, {"BMW", "Audi", "Porche"},
				{"Hynday", "Korean1", "Korean2"}, {"itaian1", "italian2", "italian3"}};
		
		
		for(String []array: cars) {
			for(String c:array) {
				System.out.println(c + " ");
			}
		}
		
		
		System.out.println("--------------------------------");
		
		for(int r=0; r<cars.length; r++) {
			for(int c=0; c<cars[r].length; c++) {
				System.out.print(cars[r][c]+ " ");
			}
			System.out.println();
		}
		
		}
		
		

	}




//
//Create 2D array of cars : american, german, korean, italian. 
//Then retrieve all values from that array using 2 different loops
//
//

