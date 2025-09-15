package Arreys;

import java.util.Scanner;

public class ArrAddorSub {

	public static void main(String[] args) {
	  
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number");
		int user=obj.nextInt();
		int[] arr1=new int[user];
		int[] arr2=new int[user];
		
		for( int i=0;i<user;i++) {
			System.out.println((i+1)+"the first elements");
			int value1=obj.nextInt();
			arr1[i]=value1;
		}
		for(int j=0;j<user;j++) {
			System.out.println((j+1)+"the second elements");
			int value2=obj.nextInt();
			arr2[j]=value2;
			}
		System.out.println("output is :");
		for (int i=0;i<user;i++) {
	
			System.out.println(arr1[i]-arr2[i]+" ");
			
		}
		
	}

}
