package Assignments;

public class Prime {

	public static void main(String[] args) {
		
		int num = -11;
		boolean isPrime = true;
		
		for (int i=2; i<num; i++) {
			if(num%2==0) {
				isPrime=false;
				break;
	    	
	    }
		}
			if(isPrime) {
				System.out.println("Is Prime");
				
			}else {
				System.out.println("Is not Prime");
			}
			
	}

}

//for(int count=2; count < number; count++) {
//    if(number % count == 0) {
//        System.out.println("Number is not a prime!");
//        // Since we are finished return and do no more iterations
//        return;
//    }
// }
// // we iterated all possible numbers and can return successfully
// System.out.println("Number is a prime");



//to fix
//int a = 2;
//boolean prime = true;
//
//if(a%2==0 || a<0) {
//	System.out.println(!prime + " -  not a prime");
//}else{
//	System.out.println(prime + " -  it's prime");
//}