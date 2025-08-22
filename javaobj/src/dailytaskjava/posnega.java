package dailytaskjava;

import java.util.Scanner;

public class posnega {

	public static void main(String[] args) 
	{
		
      
		
		Scanner posneg =new Scanner(System.in);
		System.out.println("enter the number");
		int num=posneg.nextInt();
		
		// by using "if" only //
		
//		if(num > 0) {
//			System.out.println(num + "is positive");
//		}
//		if (num<0) {
//			System.out.println(num + "is negative");
//		}
//			if (num==0) {
//				System.out.println( num +  "this is zero");
//			}
		
		
		// by using 'if else' or 'else if' only//
		
		
//		if (num>0) {
//			System.out.println(num+"is positive");
//		}
//		else if (num<0) {
//			System.out.println(num+"is negative");
//		}
//		else {
//			System.out.println("is zero");
//		}
	
		if (num>=0) {
			if(num==0) {
				System.out.println("is zero");
			}else {
				System.out.println( num + "is positive");
			}
		}
			else {
				System.out.println(num + "is negative");
			}
		
		
		
		
	}

}
