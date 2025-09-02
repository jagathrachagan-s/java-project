package javaobj;

 class OopsConcept1 {


		// propoties also called attributes
		String color;
		int year;
		//method(behaviour)
		
		
		 void startEngine()
		 {
				System.out.println("engine started");
	}

}
public class  OopsConcept
{
	public static void main(String[] args) {
		
		OopsConcept1 mycar=new OopsConcept1();
		mycar.color="yellow";
		mycar.year=2025;
		System.out.println("my car color is"+mycar.color);
		System.out.println("my car year is"+mycar.year);
		mycar.startEngine();
		
		
	}
}


