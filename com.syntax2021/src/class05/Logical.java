package class05;

public class Logical {

	public static void main(String[] args) {
		
		
		String day = "Saturday";
		
		if(day.equals("Monday") || day.equals("Friday")){
			System.out.println("Today I have no class");
		}else if(day.equals("Tuesday") || day.equals("Wednesday")) {
			System.out.println("Today I have manual class");
		}else if(day.equals("Thursday")) {
			System.out.println("Today I have review class");
		}else if(day.equals("Saturday") || day.equals("Sunday")){
			System.out.println("Today I have Java class");		
		}else {
			System.out.println(day + " is invalid");
		}

	}

}
