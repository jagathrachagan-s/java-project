package javaobj;

import java.util.Scanner;

public class jaggu {
	public static void main(String[]args) {
		
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number 1 to 25");
		int num=obj.nextInt();
		
		if (num>=1 && num<=25) {
			System.out.println("the number is :"+ num);
		}else if(num%5==0) {
			System.out.println(num);
		}else {
			System.out.println("invalid number");
		}
			
	}

}
