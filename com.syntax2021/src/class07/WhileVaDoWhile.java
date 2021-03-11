package class07;

public class WhileVaDoWhile {
	
	public static void main (String [] args) {
		
		
		int num=6;
		
		while(num<=5) {//first checks then executes
			System.out.println(num);
			num++;
		}
		
		
		System.out.println("--------------------------- Do while --------------------------");
		
		
		int num1 = 6;
		
		do {//executes at least once; executes then checks;
			
			System.out.println(num1);
			num1++;
		}while(num1<=5);
		
	}
	
	

}
