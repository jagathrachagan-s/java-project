package dailytaskjava;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner evenodd =new Scanner(System.in);
		System.out.println("enter the number");
		int num= evenodd.nextInt();
		
		// by using "if"condition
//		if(num % 2 == 0) {
//			System.out.println(num +" " +"is even number");
//		}
//		if(num % 2 !=0) {
//			System.out.println(num + " " +"is odd number");
//		}
		
		//by using "else if"condition
		
		if (num>=0) {
			if (num % 2==0) {
			System.out.println(num+"is even number");
			}else {
				System.out.println(num+"is odd number");
			}
		}
	}

}



//public class PrimeOrNotPrime {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner primeornot=new Scanner(System.in);
//		int num=primeornot.nextInt();
//		
//		if(num) {
//			System.out.println("is prime");
//			
//		}
//		if () {
//			System.out.println("is not prime");
//		
//		}
//		
//		}
//
//}

