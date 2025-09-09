package Arreys;

import java.util.Scanner;

public class ArreyIndexs {

	public static void main(String[] args) {
        //initial of arrey
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the elements");
		int n=obj.nextInt();
		int[] ar=new int[n];
		
		
		//input
		System.out.println("enter"+n+"elements");
    for (int i=0;i<n;i++) {
    	ar[i]=obj.nextInt();
    	}
      System.out.println("enter the index of the elesments u want to acces ()0 to"+(n-1));
      int index=obj.nextInt();
       
      if(index >=0 && index <n) {
    	  System.out.println("elements at index"+index+"is:"+ar[index]);
      }
      else {
    	  System.out.println("invalid index! please enter a value between 0 and"+(n-1));
      }
	}

}
