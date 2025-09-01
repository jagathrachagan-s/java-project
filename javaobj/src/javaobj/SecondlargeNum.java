package javaobj;

import java.util.Scanner;

public class SecondlargeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj =new Scanner(System.in);
System.out.println("enter 1 large  number");
int a=obj.nextInt();
System.out.println(" enter 2nd large number");
int b=obj.nextInt();
System.out.println(" enter 3rd large number");
int c=obj.nextInt();

if((a>b && a<c) || (a<b && a>c) ){
	System.out.println("a issecond large num");
}else if ((b>a && b>c) || (b<a  && b>a)){
	System.out.println("b is second large num");
}else {
	System.out.println("c is second large num");
}
	}

}
