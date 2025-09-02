package stringpro;

public class ConstrOverLoading {
      
	int id;
	String name;
	int age;
	public ConstrOverLoading(int i,String n) {
		id=i;
		name=n;
	}
	public ConstrOverLoading(int i,String n,int a) {
		id=i;
		name=n;
		age=a;
	}
	void display() {
		System.out.println(id+" "+name+" "+age);
	}
	
	public static void main (String[]agrs) {
		 ConstrOverLoading o=new  ConstrOverLoading(401,"jagath");
		 ConstrOverLoading o1=new  ConstrOverLoading(402,"rachagan");
		 ConstrOverLoading o2=new  ConstrOverLoading(403,"rachagan",22);
		 o.display();
		o1. display();
		o2.display();
	}
}
