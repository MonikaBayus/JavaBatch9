package class011;

public class NestedForLoop {

	public static void main(String[] args) {

		int [][] numbers= {{12,34,56,67}, {90,80}, {1,2,3,4,5,6,7}};
		
	System.out.println(numbers.length);//total numbers of single array;
	System.out.println(numbers[1].length);
	
	
	for(int row=0; row<numbers.length; row++) {
		for(int col=0; col<numbers[row].length; col++) {
			System.out.print(numbers[row][col] + " ");
		}
		System.out.println();
	}
	
	
	System.out.println("--------------------------------------------------------------");
	
	for(int[] array:numbers) {
		for(int c:array ) {	
			System.out.print(c + " ");
		}
	
	}

}
}