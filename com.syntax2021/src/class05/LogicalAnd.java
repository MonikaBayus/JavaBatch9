package class05;

public class LogicalAnd {

	public static void main(String[] args) {
		
		
		int num = 100;
		
		if(num>=1 && num<=100) {
			System.out.println(num + " is a small number");
		}else if (num>=11 && num<=100) {
			System.out.println(num + " is a medium number");
		}else if(num>=101 && num<=1000) {
			System.out.println(num + " is a large number");	
		}else if(num>1001 && num<=100000) {
			System.out.println(num + " is a xlarge number");
		}
		

	}

}
