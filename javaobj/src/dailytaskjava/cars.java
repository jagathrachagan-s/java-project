package dailytaskjava;

 class circle {

	 double radius;
	
	
	public double calculateArea() {
		return Math.PI*radius*radius;
		
	}
	public double calculatecumference() {
		return 2* Math.PI*radius;
	}
	
}
 public class cars {
	 
	 public static void main(String[]args) {
		 circle obj=new circle();
		 obj.radius=2.5;
		 System.out.println("Area"+obj.calculatecumference());
		 System.out.println("circumference"+obj.calculateArea());
	 }
 }

