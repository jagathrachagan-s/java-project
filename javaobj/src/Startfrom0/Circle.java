package Startfrom0;

public class Circle {
       
	double radius;
	
	 double AreaCircle() {
		return Math.PI *radius*radius ;
	}
	public  double AreaCircumference() {
		return Math.PI*radius;
	}
	public static void main(String[] args) {
		Circle obj=new Circle(); 
		
		 obj.radius=5.0;
		 
		 System.out.println("the radius is :"+obj.radius);
		System.out.println("the Area of circle is :"+obj.AreaCircle());
		System.out.println("the Area of circumferance is :"+obj.AreaCircumference());

	}

}
