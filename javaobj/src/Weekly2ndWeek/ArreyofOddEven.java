package Weekly2ndWeek;

import java.util.Scanner;

public class ArreyofOddEven {

	public static void main(String[] args) {

   Scanner obj=new Scanner(System.in);
   System.out.println("enter the number between 1 to 20");
   int n=obj.nextInt();
   int [] num=new int[n];
for(int i=0;i<n;i++) {
	num[i]=i+1;
}
int evennum=0;
int oddnum=0;
  for(int jagggu:num)
	if(jagggu %2==0) {
		evennum++;
	}else {
		oddnum++;
	}

System.out.println("the even numbers are :"+evennum);
System.out.println("the odd numbers are :"+oddnum);

	}

}
