package Review03;

public class Increment {

	public static void main(String[] args) {
		
		
		int i = 10;
		
		int j = 20;
		
		i= i+j;

		System.out.println("i=i+j+20; \n"+i);
		i+=i+10;//i=i+10+i
		System.out.println("i +=i+10; \n" + i);
		i++;
		System.out.println("int i =10; \n" + i);
		++i;
		System.out.println("int i=10; \n" + i);
		
		System.out.println("-------------------------------");
		
		i=10;
		System.out.println("++i "+(++i+(++i)));
		System.out.println("i++  " +(i++));
		System.out.println("i  "+i);
		
		
		System.out.println("-------------------------------");
		
		int a =10;
		while(a<15) {
			System.out.println("Infinite loop");
			if(i<15) {//infinite loop;
			continue;
		}else {
			System.out.println("Hi");
		}
		i++;

		}

	}

}
