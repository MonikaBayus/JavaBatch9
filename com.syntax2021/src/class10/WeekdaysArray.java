package class10;

import java.util.Scanner;

public class WeekdaysArray {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
	    String [] w=new String [7];
	    
	    for (int d=0; d<7; d++){
	       System.out.println("Please enter day "+(d+1)+" of the week");
	        w [d]=input.next();
	    }
	    for (String week:w){
	      System.out.println(week);
	    }

	}

}
