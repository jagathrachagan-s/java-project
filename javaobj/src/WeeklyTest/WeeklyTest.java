package WeeklyTest;

import java.util.Scanner;

public class WeeklyTest {

	public static void main(String[] args) {
		////////////////////////////////////////////
        Scanner score=new Scanner(System.in);
//        System.out.println("Enter the mark (0 to 100)");
//        int mark = score.nextInt();
//        // 1st question grading system
//        if(mark <0 || mark>100) {
//        	System.out.println("invalid number please enter crt number");
//        }else if (mark>=90) {
//        	System.out.println("grede A" +" "+ mark);
//        }else if (mark>=80) {
//        	System.out.println("grade B"+" "+mark);
//        }else if (mark>=70) {
//        	System.out.println("grade C"+" "+mark);
//        }else if (mark>=60) {
//        	System.out.println("grade D"+" "+mark);
//        }else {
//        	System.out.println("you are fail"+" "+mark);
//        }
//        
        
        // print menu until user is choose "exit"
//        byte choice;
//        do {
//        
//        System.out.println("-menu---");
//		System.out.println(" hello");
//		System.out.println(" world");
//		System.out.println(" exit");
//		System.out.println("enter your order");
//         choice = score.nextByte();
//        
//        if(choice ==1) {
//        	System.out.println("hello ");
//        } else if(choice ==2) {
//        	System.out.println("world ");
//        }else if (choice ==3) {
//        	System.out.println("exiting");
//        } else {
//        	System.out.println("invalid choice pls try once ");
//        }
//        System.out.println();
//        }
//        while(choice != 3);
//        score.close();
        
        
        //at least once execute do-while
        
        int num;
        do {
        	System.out.println("enter the number ");
        	num =score.nextInt();
        	
        	if (num>=0) {
        		System.out.println("square is "+" "+num*num);
        	}else {
        		System.out.println("neagative number");
        	}
        	
        } while (num>=0);
        
        score.close();
        }

}
