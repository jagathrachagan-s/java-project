package javaobj;

abstract class Shape{
public abstract void rect();
public void cir() {
	System.out.println("CIR");
}
}
class Pen extends Shape{
	public void rect()
	{
		System.out.println("RECT");
	}
}
public class InterSample
{
	public static void main(String[]agrs) {
		
		Pen obj=new Pen();
		Shape obj2=new Pen();
		obj.rect();
		obj.cir();
	}
}