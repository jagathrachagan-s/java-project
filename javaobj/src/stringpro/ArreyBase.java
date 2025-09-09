package stringpro;

import java.util.Scanner;

public class ArreyBase {

	public static void main(String[] args) {
		
        //initial of arrey
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the elements");
		int n=obj.nextInt();
		int[] ar=new int[n];
		
		
		//input
		System.out.println("Enter the index number of the element you want to access (0 to "+(n-1)+" ) is :5"
				+ "");
		for(int i=0;i<n;i++) {
			ar[i]=obj.nextInt();
			}
		//print or output 
		for(int i=0;i<n;i++) {
			
		System.out.println("the arrey elements are :");
		System.out.println(ar[i]+"");
		}
		obj.close();
	}

}
