package dailytaskjava;

 class car {

int age;
String name;

//constructor
car(  int age,String name){
	this.name=name;
	this.age=age;
}
	//method to display student detials
	
	void display() {
		
		System.out.println("Name"+"="+name);
		System.out.println("Age"+"="+age);
}
}
 
 // in class file name= car we want to call in main function
       class TwoPropotiesBy1Obj {
	 
     public static void main( String[]args) {
	
	car obj=new car(22,"jaggu");
	obj.display();
	
}
}




//class Student1 {
//    String name;
//    int age;
//
//    // Constructor
//    Student1(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    // Method to display student details
//    void display() {
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//    }
//}
//
// class Student {
//    public static void main(String[] args) {
//        Student1 s = new Student1("John", 20);
//        s.display();
//    }
//}