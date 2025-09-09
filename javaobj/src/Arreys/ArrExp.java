package Arreys;

import java.util.Scanner;

public class ArrExp {

	public static void main(String[] args) {
	//initial of arrey
      Scanner obj=new Scanner(System.in);
      System.out.println("enter the numbre");
      int n=obj.nextInt();
      int[] arr=new int[n];
       
      System.out.println("enter a :"+""+n+""+"elements");
      for (int i=0;i<n;i++)
      {
    	  arr[i]=obj.nextInt();
      }
      
	}

}
