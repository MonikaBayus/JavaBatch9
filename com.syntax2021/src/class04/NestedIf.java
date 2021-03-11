package class04;

public class NestedIf {

	public static void main(String[] args) {

		boolean morning = false;
		boolean classToday = true;

		if (morning) {
			System.out.println("Let me check if I have a class today");

		} else {
			System.out.println("Good morning my family");

			if (classToday) {
				System.out.println("I will attend class at Syntax");
			} else {
				System.out.println("I can relax");
			}
		}
		System.out.println("------------End of the code---------- ");

	}

}
