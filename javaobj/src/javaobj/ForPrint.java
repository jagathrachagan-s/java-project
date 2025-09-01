package javaobj;

public class ForPrint {

	public static void main(String[] args) {
		
		//for loop with conditional statement (break,continue,jump,goto)
//		for(int i=1;i<=10;i++)
//		{
//			if(i==5)continue; //skips 5
//			if(i==8)break;// stop at 8 will not come until 7
//			System.out.println(i);
//		}
		
		// for -each loop
		int[] numbers= {1,2,3,4,5};
		for(int num:numbers) {
			System.out.println(num);
		}
			

	}

}
