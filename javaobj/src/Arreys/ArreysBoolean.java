package Arreys;
import java.util.Scanner;

public class ArreysBoolean {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the elements");
		int n=obj.nextInt();
		int[] arr=new int[n];
		
		
		//input
		System.out.println("enter"+n+"elements");
    for (int i=0;i<n;i++) {
    	arr[i]=obj.nextInt();
    	}
    System.out.println("enter the elemynts you want to search");
    int key=obj.nextInt();
    boolean found=false;
    for (int i = 0;i<n;i++) {
    	if(arr[i]==key)
    	{
    		System.out.println("the elements is found"+i);
    		found=true;
    	}
    }
    	if (!found)
    	{
    		System.out.println("the elements not found");
    	}
    	obj.close();
    }
	}


