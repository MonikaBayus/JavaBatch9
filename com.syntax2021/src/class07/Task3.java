package class07;

public class Task3 {

	public static void main(String[] args) {
	
		
//	for(int i = 1; i<=100; i++)	{
//		System.out.print(i + " " );
//	}
//	
//	System.out.println("-------------------------------");
//	
//	
//	for(int i = 100; i>=1; i--) {
//		System.out.print(i + " ");
//		
//	}
//	
//	System.out.println("-------------------------------");
//
//		for(int i = 20; i>=1; i-=2) {
//			System.out.print(i + " ");
//			
//		}
//		
//		System.out.println("-------------------------------");
	
		for(int i = 20; i>=1;i--) {
			if(i%2==0) {
				System.out.print(i + " ");	
				
			}
		}
		
		for(int i = 20; i<=50; i++) {
			if(i%2==1) {
				System.out.println(i + " ");
			}
	}
		
		
		for(int i=21; i<50; i+=2) {
			System.out.println(i+ " ");
		}
		
		
		System.out.println("-------------------------------");
		
		
		
		int sum=0;
		for(int i =1; i<=5; i++) {
			sum=sum+i;
		}
		
		System.out.println(sum);
		
		
		System.out.println("-------------------------------");

		
		int result = 0;
		
		for(int i=2; i<10; i+=2) {
			result +=i;
		}
		System.out.println(result);

	}
}


/*
 Print numbers from 1 to 100 in 1 line with space


Print numbers from 100 to 1


Print even numbers from 20 to 1 (2 ways)


Print odd numbers between 20 and 50 (2 ways)
 */



//System.out.println();
//for(int i=20;i>=1;i--) {
//	if(i%2==0) {
//		System.out.print(i+" ");
//	}
//}System.out.println();
//for (int i = 21; i < 50; i += 2) {
//	System.out.print(i + " ");
//}
//System.out.println();
//for(int i=20; i<50; i++) {
//	if(i%2!=0) {
//		System.out.print(i+" ");
//	}
//
//




