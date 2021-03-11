package class09;

public class NestedLoop {

	public static void main(String[] args) {
		
		for(int i = 2; i<3; i++) {
			System.out.println("Outer loop");
			
			for(int j =1; j>=3; j++) {//after first iteration x3 ->resets itself;
				System.out.println("Inner loop");
			}
		}
		
		System.out.println("I am finished looping");

	}

}
