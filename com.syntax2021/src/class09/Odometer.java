package class09;

public class Odometer {

	public static void main(String[] args) {

		for (int i = 0; i<=9; i++) {
			for(int j=0; j<=9; j++) {//when this loop finish goes to the loop above
				for(int k=0; k<=9; k++) {//k increments by one goes inside l, k controls how many times l gets executed;
					for(int l = 0; l<=9;l++) {//when l finish, goes to the k above
						System.out.println(i + ""+ j + ""+ k + "" +l);

						
					}
				}
			}		
				
		}
		
		
		
	System.out.println("----------------Clock--------------------");
	
	int m;
	int h;
	for ( h=0; h<24; h++) {
		
		for( m=0;m<60; m++) {
			
			if(h<10 && m<10) {
				System.out.println("0" +h+ ":0" +m);
				
			}else if(h<10 && m>=10) {
				System.out.println("0"+h+":"+m);
			}else if(h>=10 && m<10){
				System.out.println(h + ":0" + m);
			}else {	
			System.out.println(h+ ":"+ m);
		}
	}
	

	}
	
	System.out.println("----------------Clock--------------------");

	
	for(int a=0; a<24; a++) {
		
		for(int b=0; b<60; b++) {
			
			if(a<10) {
				
				if(b<10) {
					System.out.println("0" +a+ ":0" +b);
					
				}else {
					System.out.println("0" +a+ ":" +b);
				}
			}else {
				
				if(b<10) {
					System.out.println(a + ":0" + b);
					
				}else {
					System.out.println(a+ ":"+ b);
			}
		}
		
	}
	}
	}
}
	
	
	
	
	

	


//for(int b=0;b<6;b++) {
//	for(int c=0;c<=9;c++) {
//		if(a<10) {
//			System.out.println("0"+a+":"+b+""+c);
//		}else
//		    System.out.println(a+":"+b+""+c);
//	}
//}
//}


