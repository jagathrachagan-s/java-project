package dailytaskjava;

import java.util.Scanner;

public class leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leap=new Scanner (System.in);
		System.out.println("enter a year");
		int year=leap.nextInt();
		
		
		        // Change this to test other years

		        if (year % 400 == 0) {
		            System.out.println(year + " is a leap year.");
		        }
		        if (year % 400 != 0) {
		            if (year % 100 == 0) {
		                System.out.println(year + " is not a leap year.");
		            }
		        }
		        if (year % 400 != 0) {
		            if (year % 100 != 0) {
		                if (year % 4 == 0) {
		                    System.out.println(year + " is a leap year.");
		                }
		            }
		        }
		        if (year % 400 != 0) {
		            if (year % 100 != 0) {
		                if (year % 4 != 0) {
		                    System.out.println(year + " is not a leap year.");
		                }
		            }
		        }
		
		
		
		if (((year % 4==0 ) && ( year % 100 !=0)) ||(year % 400 == 0)) {
		
			System.out.println(year + "is a leap year");
		}
		else 
		
			System.out.println(year + "not a leap year");
		
		    }
		
	}


