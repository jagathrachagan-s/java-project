package stringpro;

import java.util.Scanner;

public class TempConvertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner obj=new Scanner(System.in);
	
	System.out.println("enter the temp in celsius :");
	double clecius = obj.nextDouble();
	double fahren = (clecius * 9/5)+32;
	double kalvin =clecius + 273.15;
	System.out.println("clecius to fahrenhit is"+fahren);
	System.out.println("clecius to kalvin is"+kalvin);
	
	System.out.println("enter the temp of fahrenhit :");
	double fah =obj.nextDouble();
	double cle =(fah-32)*5/9;
	double kel =(fah -32)* 5/9+273.15;
	System.out.println("fahrenhit to clecius :"+cle);
	System.out.println("fahrenhit to kelvin :"+kel);
	
	System.out.println("enter the temp of kelvin : ");
	double kelv =obj.nextDouble();
	double clec =kelv-32*5/9;
	double fahr =kelv-32* 5/9+273.15;
	System.out.println("kelvin to clecius :"+clec);
	System.out.println("kelvin to fahrenhit :"+fahr);

	}

}
