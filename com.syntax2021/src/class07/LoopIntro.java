package class07;

public class LoopIntro {

	public static void main(String[] args) {
		
		
	int time = 7;
	
	if(time<12) {
		System.out.println("Hello");//code executes 1 time;
		
		
	}
		System.out.println("------------------WHILE LOOP-------------------------");
		
		
		
	while(time<12)	{
		System.out.println("Hello1");//code runs forever without counter;
		time++;
		
	}
	
	System.out.println("------------------prints from 1 to 10 -------------------------");

	int time1 = 1;
	while(time1<=10) {
		time1++;
		
		System.out.println("Printing 10 times");
	}
	
	
	System.out.println("------------------prints from 20 to 40 -------------------------");
	System.out.println();
	
	time1 = 20;
	while(time1<=40) {
		System.out.print(time1 + " ");
		time1++;
	}
	System.out.println();
	System.out.println("------------------prints from 10 to 1 -------------------------");
	System.out.println();

	int a =10;
	while(a>0) {
		System.out.print(a + " ");
		a--;
		
	}

	
	}
	
	

}
