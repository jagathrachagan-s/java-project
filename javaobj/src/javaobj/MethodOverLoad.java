package javaobj;

 class MethodOverLoad {
    public   static void display(int a) {
    	 System.out.println("get an integer value"+a);
     }
     public  void display(String b) {
    	 System.out.println("get an string value "+b);
     }
	public static void main(String[] args) {
		MethodOverLoad meth=new MethodOverLoad();
		//display dis=new display();
		display(123);
	   // meth.display("jaggu");
	}
}
