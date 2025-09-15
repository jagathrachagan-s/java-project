package Weekly2ndWeek;

import java.util.Arrays;

public class ReverseArrey {

	public static void main(String[] args) {
      //this is bulid in function
//         int[]arr= {1,2,3,4,5};
//         int n=arr.length;
//         for(int i=0;i<n/2;i++) {
//        	 int temp=arr[i];
//        	 arr[i]=arr[n-1-i];
//        	 arr[n-1-i]=temp;
//         }
//         System.out.println(Arrays.toString(arr));
   
		
		//without build in function
		
		int []arr= {4,8,12,9,5};
		int n= arr.length;
		
		int left=0;
		int right=n-1;
		while(left < right) {
			int temp= arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			
			left++;
			right--;
		}
		System.out.print("[");
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]);
				if(i!=n-1) {
					System.out.print(",");
				}
				
			}
			System.out.print("]");

	}

}
