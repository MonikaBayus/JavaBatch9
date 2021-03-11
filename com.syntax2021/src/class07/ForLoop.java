package class07;

public class ForLoop {

	public static void main(String[] args) {
		
		for(int i=1; i<=3; i++) {
			System.out.println("Hello");
		}
		
		System.out.println("-----------------------1-50----------------------");
		
		for(int i=1; i<=50; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("-----------------------10-1----------------------");

		for(int i = 10; i>=1; i--) {
			System.out.println(i + " ");
		}
		System.out.println("--------------------------------------------------");
		
		for(int i = 0; i<=10; i+=2) {
			System.out.print(i + " ");
		}
		
		System.out.println("--------------------------------------------------");
		
		for(int i=5;i<=50; i+=10)
		{
			System.out.print(i+ " ");
		}
	}

}
