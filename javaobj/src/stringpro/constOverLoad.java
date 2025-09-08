package stringpro;

public class constOverLoad {

	
	public void display() {
		System.out.println("method with no parameter");
	}
	public void display(int b) {
		System.out.println("method with parameter"+" "+b);
	}
	public static void main (String[]agrs) {
		      
		constOverLoad l=new constOverLoad();
		constOverLoad l1=new constOverLoad();
		l.display();
		l1.display(25);
	}
}
