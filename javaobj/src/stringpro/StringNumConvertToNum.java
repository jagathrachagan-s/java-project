package stringpro;

import java.util.Scanner;

public class StringNumConvertToNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the sting number");
		String str=scanner.next();
		System.out.println("value is"+str);
		

		//int intValue=Integer.parseInt(str);
		//System.out.println(intValue);
		Long longValue=Long.parseLong(str);
		System.out.println(longValue);
		Float floatValue=Float.parseFloat(str);
		System.out.println(floatValue);
		Double doubleValue=Double.parseDouble(str);
		System.out.println(doubleValue);
	}

}
