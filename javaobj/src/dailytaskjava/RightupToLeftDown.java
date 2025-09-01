package dailytaskjava;

public class RightupToLeftDown {

	public static void main(String[] args) {
		
//		int rows=5;
		
		for(int i=5;i>=1;i--)//i print a star
		{
			for(int j=1;j<=i;j++)//(jagged arrey ) print the star on each row
			{
				System.out.print("*");//1st row
			}
			System.out.println();//moves to nxt line 
		}
		
	}

}
