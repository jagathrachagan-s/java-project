package WeeklyTest;

import java.util.Scanner;

public class weeklytest1 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		 
		System.out.println("Enter the character :");
		
		char let= scanner.next().charAt(0);
		 //int let=scanner.nextInt()
;	   if (Character.isAlphabetic(let)) {
		   System.out.println(let +" is alphabet");
	   }else if (let >='0' && let <='0') {
		   System.out.println(let +" is digit");
	   }else {
		   System.out.println(let +" is special character");
	   }
	}

}
