package Arreys;

public class MatrixAddMultiDimenoinalArr {

	public static void main(String[] args) {
	   
		int a[][]= {{2,7,3},
				    {5,8,9},
				    {8,55,9}};
		
		
		int b[][]= {{2,6,3},
				    {6,5,2},
				    {6,45,4}};
		
		int [][]c=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
