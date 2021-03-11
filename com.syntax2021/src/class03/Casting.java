package class03;

public class Casting {

	public static void main(String[] args) {
		
		
		//int i = 10.99; type mismatch
		
		
		//widening/implicit
		double d =10;
		System.out.println(d); 
		
		
		//explicit/narrowing 
		int i = (int)12.99;
		System.out.println(i);
		
		byte b = (byte)130;
		
		int number =12;
		double result = number/5;
		System.out.println(result);
		//result 2.0, operation on right first, even a double is there operation first the right

		double num2 = 10;
		num2 = num2/3;
		System.out.println(num2);
		
		 
}
}