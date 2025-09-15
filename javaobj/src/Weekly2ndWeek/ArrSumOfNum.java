package Weekly2ndWeek;

import java.util.Scanner;

public class ArrSumOfNum {

	public static void main(String[] args) {

     Scanner obj= new Scanner (System.in);
     System.out.println("enter the sum of number");
     int n=obj.nextInt();
     int arr []=new int [n];

     
     System.out.println("entered"+n+"elements");
     for(int i=0;i<n;i++) {
    	 arr[i]=obj.nextInt();
     }
     int sum=0;
     for(int i=0;i<arr.length;i++) {
    	 sum=sum +arr[i];
     }
     System.out.println("the value of numbers of sum is :"+sum);
	}

}
