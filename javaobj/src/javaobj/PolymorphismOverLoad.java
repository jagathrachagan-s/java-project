package javaobj;


class Product {
	
	public float multiply(float a,float b) {
		float prod=  a*b;
		return prod;
	}
	public double multiply(double a,double b,double c) {
		double prod=a*b-c;
		return prod;
	}
	public int multiply(int a,int b,int c) {
		int prod=a*b*c;
		return prod;
	}
}

public class PolymorphismOverLoad {

	public static void main(String[] args) {
	   Product obj=new Product();  
		
     float prod1=obj.multiply(228, 523);
     System.out.println(prod1);
     double prod2= obj.multiply(5.0, 2.0, 3.0);
     System.out.println(prod2);
     int prod3=obj.multiply(5, 3, 6);
     System.out.println(prod3);
	}
}
