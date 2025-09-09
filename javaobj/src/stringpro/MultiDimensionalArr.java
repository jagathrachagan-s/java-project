package stringpro;

import java.util.Scanner;

public class MultiDimensionalArr {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		 int a[][]=new int[100][100];//row-100,col-100
		 int row, col,i,j;
		 
		 System.out.println("enter the row");
		  row =obj.nextInt();
		 
		  System.out.println("enter the col");
		  col =obj.nextInt();
		  
		  //i=row
		  //j=column
		  for ( i=0;i<row;i++) {
			  for(j=0;j<col;j++) {
				  System.out.printf("enter the arrey elements",i,j);
				  a[i][j]=obj.nextInt();
			  }
		  }
		  System.out.println("display 2d arrey elements :");
		  for(i=0;i<row;i++) {
			  for(j=0;j<col;j++) {
				  System.out.println(a[i][j]+"");
			  }
		  }
		  System.out.println();
	}

}