package class10;

public class task2 {

	public static void main(String[] args) {
		
		
		String[]names = { "Anna", "Jane", "Eva", "Ola"};
		System.out.println(names[3]);
		
		String []names1 = new String[3];
		names1[0]= "Tom";
		names1[1]= "John";
		names1[2]= "Greg";
		
		System.out.println(names1[1]);
		
		for(int i =0; i<names.length; i++) {
			
			System.out.println(names[i]);
		}
		
		
		
		System.out.println("----------------------------------------");
		
		String[]words= {"Java", "Saturday", "Day", "coding", "is"};
		
		System.out.println(words[1]+ " " + words[4]+ " " + words[0]+ " " + words[3]+ " " + words[2]);

	}

}

//Create an array of names and store all names of your group. 
//Then print your name from that array. (use 2 different ways of creating an array).
//
//
//Create an array of words: Java, Saturday, day, coding, is. 
//Print the following sentence using elements of array: “Saturday is Java coding Day”.






