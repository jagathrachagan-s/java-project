package stringpro;

////AbstractExp01 
//
//abstract class Phone {
//	public abstract void Apple();
//}
//class Mobiles extends Phone {
//	public void Apple() {
//		System.out.println("come in apple");
//	}
//}
//public class AbstractExp01 {
//	public static void main(String[]args) {
//		Phone obj=new Mobiles();
//		obj.Apple();
//	}
//}


abstract class Phone{
	public abstract void Apple();
	public void Android() {
		System.out.println("2nd android");
	}
}
class Mobiles extends Phone {
	public void Apple() {
		System.out.println("1st apple");
	}
}
public class AbstractExp01 {
	public static void main(String[]args) {
		Phone obj=new Mobiles();
		obj.Apple();
		Mobiles obj1=new Mobiles();
		obj1.Android();
	}
}