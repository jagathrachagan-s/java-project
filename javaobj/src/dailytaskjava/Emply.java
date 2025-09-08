package dailytaskjava;

class employee {

	String name;
	double salary;
	
	public   employee (String name,double salary){
		this.name=name;
		this.salary=salary;
	}
	public  void displaydetials() {
		
		System.out.println("Employee name is"+" "+name);
		System.out.println("Employee salary is"+" "+salary);
	}
	
}
public class Emply {
	public static void main (String[]args) {
		
		employee obj=new employee("jagath",80000);
		obj.displaydetials();
	}
}