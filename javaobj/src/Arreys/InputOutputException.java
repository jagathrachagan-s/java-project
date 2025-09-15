package Arreys;

import java.util.Scanner;

public class InputOutputException {

	public static void main(String[] args) {
	       
		Scanner obj=new Scanner("hello");
		System.out.println(""+obj.nextLine());
		System.out.println("Exception output"+obj.ioException());
		obj.close();
	}

}
