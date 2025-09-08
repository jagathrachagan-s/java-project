package stringpro;

//AbstractExp
abstract class Buddy{
	
	public abstract void Wait();
//	public void come() {
//		System.out.println("come in buddy");
//	}
}

class Mapla extends Buddy {
	public void Wait() {
		System.out.println("wait a min buddy");
	}
}

public class AbstractExp{
	public static void main (String []args) {
		// Mapla obj=new  Mapla();
		 Buddy obj=new  Mapla();
		 obj.Wait();
		// obj.come();
//		 obj1.Wait();
//		 obj1.come();
		
		
	}
}