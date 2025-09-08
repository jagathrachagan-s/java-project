package javaobj;

class A{
	public void methodA() {
		System.out.println("methodA");
	}
}
class B extends A{
	public void methodB() {
		System.out.println("methodB");
	}
}
class C extends A{
	public void methodC() {
		System.out.println("methodC");
	}
}
class D  extends A{
	public void methodD() {
		System.out.println("methodD");
	}
}
public class HierarMethod{
	public static void main (String[]args) {
		B b=new B();
		C c=new C();
		D d=new D();
		b.methodA();
		b.methodB();
		c.methodA();
		c.methodC();  
		d.methodA();
		d.methodD();
	}
}