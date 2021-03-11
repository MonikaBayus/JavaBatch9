package class011;

public class Task4 {

	public static void main(String[] args) {
		
	String[][]grrocery= { {"lettuce", "chard", "carrots"}, {"bannana", "oranges", "plums", "peaches"}};
	
	for(int r=0; r<grrocery.length; r++) {
		for(int c=0; c<grrocery[r].length; c++) {
			System.out.println(grrocery[r][c]);
		}
	}
	
	for(String[]array : grrocery) {
		for(String g:array) {
			System.out.print(g+ " ");
		}
	}
		
		

	}

}


//Using 2D array create a grocery list.
//Inside you should have an array of veggies, fruits, dairy and sweets.
//Retrieve all values from that array using 2 different loops