package Arreys;

import java.util.Scanner;

public class AddMultiFromUser {

	public static void main(String[] args) {
	  Scanner obj= new Scanner(System.in);
	  
	  System.out.println("enter the size of arrey ");
	  int size=obj.nextInt();
	  int [] arr1=new int[size];
	  int [] arr2=new int[size];
	  int [] arr3=new int[size];
 // input
	   for (int i=0;i<size;i++) {
		   System.out.println((i+1)+"elements first arrey");
		   int value1=obj.nextInt();
		   arr1[i]=value1;
	   }
	   for (int j=0;j<size;j++) {
		   System.out.println((j+1)+"elements second arrey");
		   int value2=obj.nextInt();
		   arr2[j]=value2;
	   }
	   System.out.println("output");
	   for(int i=0;i<size;i++) {
		   System.out.println((arr1[i]+arr2[i])+" ");
	   }
	   
	}

}
