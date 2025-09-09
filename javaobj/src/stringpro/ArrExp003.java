package stringpro;

import java.util.Scanner;

public class ArrExp003 {

	public static void main(String[] args) {

      Scanner obj=new Scanner(System.in);
      System.out.println("enter the number elements");
      int n=obj.nextInt();
      
      int[]arr=new int[n];
      
      System.out.println("the entered number is arr");
      for(int i=0;i<arr.length;i++) {
    	  arr[i]=obj.nextInt();
      }
      int[]arr1=new int[n];
      System.out.println("the entered number is arr1");
      for(int i=0;i<arr1.length;i++) {
    	  arr1[i]=obj.nextInt();
      }
      boolean same =true;
      for(int i=0;i<arr.length;i++) {
    	  if(arr[i]!=arr1[i]) {
    		  same =false;
    		  break;
    	  }
      }
      
	}

}

//package ArrayPrograms;
//
//import java.util.Scanner;
//
//public class ComparingOfTheArray {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int[] arr1 = new int[4];
//        System.out.println("Enter the elements of arr1:");
//        for (int i = 0; i < arr1.length; i++) {
//            arr1[i] = sc.nextInt();
//        }
//
//        int[] arr2 = new int[4];
//        System.out.println("Enter the elements of arr2:");
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = sc.nextInt();
//        }
//
//        boolean same = true;
//        for (int i = 0; i < arr1.length; i++) {
//            if (arr1[i] != arr2[i]) {
//                same = false;
//                break;
//            }
//        }
//
//        if (same) {
//            System.out.println("Arrays are SAME (order matters)");
//        } else {
//            System.out.println("Arrays are NOT same");
//        }
//    }
//}
