package dailytaskjava;

import java.util.Scanner;

public class ArrFreqCount {

	public static void main(String[] args) {

     Scanner obj=new Scanner(System.in);
     System.out.println("enter the numbers of elements");
     int n=obj.nextInt();
     int arr[]=new int[n];
     
     System.out.println("enter the num");
     for (int i=0;i<n;i++) {
    	 arr[i]=obj.nextInt();
     }
   
     for(int i=0;i<arr.length;i++) {
    	 int co=0;
    	 boolean alco=false;
    	 
    	 for(int k=0;k<arr.length;k++) {
    		 if(arr[i]==arr[k]) {
    			 alco=true;
    			 break;
    		 }
    	 }
    	 if(alco) {
    		 for(int j=0;j<arr.length;j++) {
    			 if(arr[i]==arr[j]) {
    				 co++;
    			 }
    		 }
    	 }
    	 System.out.println(arr[i]+"-->"+co+(co>1?"times":"time"));
     }
	}

}
