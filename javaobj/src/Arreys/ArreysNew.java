package Arreys;

import java.util.Scanner;

public class ArreysNew {
static double averageCalculate(int a[],int n) 
{
	int sum=0;
	for(int i=0;i<n;i++) {
		sum=sum+a[i];//1+2+3+4+5
	}
	System.out.println("enter the total num of arr");
	return (double)sum/n;
	
}
	public static void main(String[] args) {

     Scanner obj=new Scanner(System.in);
     
     int n;
     System.out.println("enter the total num of arr elemnts");
     n=obj.nextInt();
     
     int arr[]=new int[n];
     System.out.println("enter the arr elements"+n);
     for(int i=0;i<n;i++) {
    	 arr[i]=obj.nextInt();
    	 
     }
     System.out.println("th average of all the elemants in an arrey:"+ averageCalculate(arr,n));
     }

}
