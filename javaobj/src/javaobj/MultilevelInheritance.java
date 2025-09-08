package javaobj;

 class MultiOne {
  void one() {
	  System.out.println("this is base class");
  }
}
class MultiTwo extends MultiOne{
	void two (){
		System.out.println("this is intermediate class");
	}
}
class MultiThree extends  MultiTwo {
	void three() {
		System.out.println("this is derived class");
	}
}
public class MultilevelInheritance
{
	public static void main(String[]args) {
		MultiThree st=new MultiThree();
		st.one();
		st.two();
		st.three();
	}
}