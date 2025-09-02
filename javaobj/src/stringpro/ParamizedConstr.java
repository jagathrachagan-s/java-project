package stringpro;

public class ParamizedConstr {
         
	int id;
	String name;
	
	public   ParamizedConstr(int i ,String n)
	{
		id=i;
		name=n;
	}
	
	void display() {
		System.out.println(id+" "+name);
	}
	public static void main (String[]args) {
		ParamizedConstr p=new ParamizedConstr(101,"jaggu");
		ParamizedConstr p1=new ParamizedConstr(102,"rachagan");
		ParamizedConstr p2=new ParamizedConstr(103,"nive");
		ParamizedConstr p3=new ParamizedConstr(104,"bhuvi");
		p.display();
		p1.display();
		p2.display();
		p3.display();
		
		
	}
}
