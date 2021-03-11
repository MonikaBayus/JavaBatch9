package Assignments;

public class Countries {

	public static void main(String[] args) {
		String [][] countries= {
				{"Canada", "USA", "Mexico", "Puerto Rico", "Cuba", "El Salvador", "Guatemala"},
				{"Colombia", "Peru", "Argentina", "Chile", "Brazil", "Bolivia"},
				{"Italy", "England", "Spain", "Greece", "Portugal", "Belgium"},
				{"India", "Nepal", "Japan", "China", "Thailand", "Pakistan", "Vietnam", "Turkey"},
				{"Ethiopia", "Nigeria", "Ghana", "Egypt", "Morocco", "Kenya"}
		};
		
		//First Way
		for (int r=0; r<countries.length; r++) {
			
			for (int c=0; c<countries[r].length; c++) {
				
				System.out.print(countries[r][c]+"  ");
			}
			System.out.println();
		}
		
		//Second Way
		System.out.println("------------------other way--------------------");
		for (String [] country:countries) {
			
			for (String c:country) {
				System.out.print(c+"  ");
			}
			System.out.println();
		}
		
		System.out.println("----------Total Countries Stored----------");
	
		int total=countries[0].length + countries[1].length+ countries[2].length +countries[3].length +countries[4].length;
		System.out.println(total);
	}

	}

//for(int i=0;i<countries.length;i++) {
//	num+=countries[i].length;
//}
//
//System.out.println("There are "+num+" countries");


//or(int a=0; a<countries.length; a++) {
//	for(int b=0; b<countries[a].length; b++) {sum++;
//	{
//      }System.out.print(countries[a][b]+" ");


