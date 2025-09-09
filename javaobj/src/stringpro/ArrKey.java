package stringpro;

import java.util.Scanner;

public class ArrKey {
  
	public static void main(String[]args) {

	      Scanner obj=new Scanner(System.in);
	      System.out.println("enter the number of elements");
	      int n=obj.nextInt();
	      int[] arr=new int[n];
	       
	      System.out.println("entered a number"+n);
	      for (int i=0;i<n;i++)
	      {
	    	  arr[i]=obj.nextInt();
	      }
	      System.out.println("enter the key index  you want to replace");
	      int index=obj.nextInt();
	      //check index is valid 
	      if (index <0||index >arr.length) {
            System.out.println("invalid index");
	      }else {
	    	    System.out.println("enter the replace value");
	    	    int replacenum =obj.nextInt();
	    	    arr[index]=replacenum;//replacenum=number 
	      }
           System.out.println("udated arrey");
           for(int number:arr) {
        	    System.out.println(number+" ");
           }
	
	}
}

