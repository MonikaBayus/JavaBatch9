package class09;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		
		for (int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++ ) {
				int k = i*j;
				System.out.println(i + "*" + j + "=" + k);
				System.out.println();
			}
		}
		
	}

}
