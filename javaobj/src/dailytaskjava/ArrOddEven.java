package dailytaskjava;

import java.util.Scanner;

public class ArrOddEven {

	public static void main(String[] args) {
	      Scanner obj=new Scanner(System.in);
          System.out.println("enter the number elements");
          int n=obj.nextInt();
          int arr[]=new int[n];
          
          System.out.println("enter the number");
          for(int i=0;i<n;i++) {
        	  arr[i]=obj.nextInt();
        	  
          }
        	  int evensum=0;
        	  int oddsum=0;
        	  
        	  for(int i=0;i<arr.length;i++) {
        		  if(arr[i]%2==0) {
        			  evensum = evensum+arr[i];
        		  } else {
        			  oddsum=oddsum+arr[i];
        		  }
        	  }
   
        	  System.out.println("even number is :"+evensum);
        	  System.out.println("odd number is :"+oddsum);
	}
}
