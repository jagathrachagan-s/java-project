package Arreys;

public class ArrAddmulti {

	public static void main(String[] args) {
		 
//		int a[][]= {{2,4,5},
//	               {1,3,4},
//		           {2,6,8}};
//      int b[][]= {{6,4,8,},
//                  {2,3,7},
//                  {2,1,5}};
//      
//      int [][]arr=new int [3][3];
//      for(int i=0;i<3;i++) {
//    	  for(int j=0;j<3;j++) {
//    		  arr[i][j]=a[i][j]+b[i][j];
//    		  System.out.print(arr[i][j]+" ");
//    	  }
//    	  System.out.println();
//      }
		
		
		
		        // Define two 3x3 matrices
		        int[][] A = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };

		        int[][] B = {
		            {9, 8, 7},
		            {6, 5, 4},
		            {3, 2, 1}
		        };

		        // Prepare a result matrix of the same size
		        int[][] sum = new int[3][3];

		        // Perform matrix addition
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                sum[i][j] = A[i][j] + B[i][j];
		                System.out.print(sum[i][j]+" ");
		                
		            }
		            System.out.println();
		        }

		     

		        }
		    }
		

	


