package class09;

public class Clock {

	public static void main(String[] args) {
		
		for (int h = 0; h <= 24; h++) {
			
			for (int m = 0; m < 60; m++) {
				
				if (h<10) {
					System.out.print("0"+ h + ":");
				} else {
					System.out.print(h + ":");
				}
						
				if (m<10) {
					System.out.println("0"+ m);
				} else {
					System.out.println(m);
				}
			}
		}

	}

}
