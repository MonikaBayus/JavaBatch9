package class10;

public class Homework {

	public static void main(String[] args) {
		
		
	String []cars = {"Mazda", "BMW"	, "Subaru", "Toyota", "Honda", "Audi"};
	
	for(int i =0; i<cars.length; i++) {
		System.out.println(cars[i] + " ");
	}
	
	System.out.println("------------------------------------");
	
	for(String x:cars)	{
		System.out.println(x + " ");
	}
	
	System.out.println("------------------------------------");
	
	
	String[] animals = {"cat", "dog", "elephant", "turtule", "frog"};
	
	for(int i = 0; i<animals.length; i++) {
		System.out.println(animals[i]);
	}
	
	System.out.println("------------------------------------");

	for(String x : animals ) {
		System.out.println(x + " ");
	}
	System.out.println("------------------------------------");

	
	int []nums = {10,5,20,5,30};
	int sum=0;
	
	for(int i =0; i<nums.length; i++) {
		sum+=nums[i];	
	}
	
	System.out.println(sum);	

	System.out.println("------------------------------------");
	
	int sum1 = 0;
	for(int x : nums) {
		sum1+=x;
		
	}
	System.out.println(sum1);
	
	}

}

//Create an array of cars and store 6 elements into it. 
//Using 2 different loops print all values from the array.
//
//
//Create an array of animals and store 6 elements into it. 
//Using 2 different loops print all elements from the array.
//
//
//Create an array on integers and calculate the sum of all elements in an array.
