package dailytaskjava;

import java.util.Scanner;

public class NewPro {

	public static void main(String[]args) {
		
		//this also used by three variable
//		temp=x;
//		x=y;
//		y=temp;
		
		
		//this mainly used no need of third variable()
//		x=x+y;
//		y=x-y;
//		x=x-y;
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of x and y");
		
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("the variable before swaping is"+x+y);
		 int temp=x;
		x=y;
		y=temp;
	
	System.out.println("the variable after swaping is"+x+y);
	}
}
