package Weekly2ndWeek;

import java.util.Scanner;

public class WeeklyTest001 {

	public static void main(String[] args) {
		
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number");
       int num=sc.nextInt();
       
       for (int mul=1;mul<=10;mul++) {
    	   System.out.println(num +" x "+mul+" ="+(num*mul));
    	   
       }
	}

}
