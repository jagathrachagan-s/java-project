package Arreys;

  class Student {
	  public int id;
	  public String name;
	  Student(int id ,String name) // p constructor
	  {
		  this.id=id;
		  this.name=name;
	  }
	  public void display() {
		  System.out.println("students id is"+""+id+""+"name is"+""+name);
		  
	  }

}
  public class ArreyOfObject{
	  public  static void main(String[] args) {
		  // arrey of object
		  Student[] arr=new Student[3];
		  arr[0]=new Student(100,"jagath");
		  arr[1]=new Student(101,"rachagan");
		  arr[2]=new Student(102,"jaggu");
		  System.out.println("student data arr0");
		  arr[0].display();
		  System.out.println("student data arr1");
		  arr[1].display();
		  System.out.println("student data arr2");
		  arr[2].display();
	  }
  }
