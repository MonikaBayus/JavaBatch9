package class09;

public class InnerLoops {

	public static void main(String[] args) {
		
		for(int i=1; i<4; i++) {
			for(int j=1; j<5; j++) {
				System.out.println("Good evening");
			}
		}
		System.out.println("-----------------------");
		
		
		for(int i=1; i<3;i++) {
			//System.out.println(i);
			for(int j=1;j<=4;j++ ) {
				//System.out.println(j);
				System.out.println(i+ " " +j);
			}
		}
		
		System.out.println("---------from 10 to 99--------------");
		
		
		for(int i=1; i<10;i++) {
			
			for(int j=0; j<=9; j++) {
				System.out.println(i+ "" +j);//space between to concatenate //other way works like addition
			}
		}
		
		

	

	}
	

}
