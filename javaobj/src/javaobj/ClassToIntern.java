package javaobj;


// this class method 
//in main class is confused of which share i to bring //To overcome this problem we use interface see down side
// class A {
//	 public void share() {
//		 System.out.println("hello");
//	 }
//}
// class B  {
//	 public void share() {
//		 System.out.println("hello");
//	 }
//}
// public class ClassToIntern extends A,B
// 
// {
//	 public static void main(String[]args) {
//		 ClassToIntern obj=new ClassToIntern();
//		 obj.share();
//	 }
// }

// this is interface method
 
   interface A1{
	   void share();
   }
   interface B1{
	   void share();
   }
   
   class ClassToIntern implements A1,B1{
	  public  void share () {
	    	System.out.println("share of A and B");
	    }
	    public static void main(String[]args) {
	    	ClassToIntern obj=new ClassToIntern();
	    	obj.share();
	    }
   }

