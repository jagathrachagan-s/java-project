package dailytaskjava;

import java.util.Scanner;

public class ArrSecondLargestNum {

	public static void main(String[] args) {

Scanner obj=new Scanner(System.in);
System.out.println("enter the numbers elements");
int n=obj.nextInt();
int arr[]=new int[n];

System.out.println("enter the numbers");
for(int i=0;i<n;i++) {
	arr[i]=obj.nextInt();
}
if(arr.length<2) {
	System.out.println("arrey contains atlaste two elements");
}
int lar= Integer.MIN_VALUE;
int seclar=Integer.MIN_VALUE;
 for(int num:arr) {
	 if(num>lar) {
		 seclar=lar;
		 lar=num;
	 }else if(num>seclar &&  num<lar) {
		 seclar=num;
	 }
 }
 if( seclar==Integer.MIN_VALUE) {
	 System.out.println("no second elemnts");
 }else {
	 System.out.println("seclar elemnents ="+seclar);
 }
	}

}
