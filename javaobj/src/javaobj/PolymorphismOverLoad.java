package javaobj;


class Product {
	
	public float multiply(float a,float b) {
		float prod=  a*b;
		return prod;
	}
	public double multiply(int a,double b,int c) {
		double prod=a*b-c;
		return prod;
	}
}

public class PolymorphismOverLoad {

	public static void main(String[] args) {
	   Product obj=new Product();  
		
     float prod1=obj.multiply(2, 3);
     System.out.println(prod1);
     double prod2= obj.multiply(5, 2, 3);
     System.out.println(prod2);
	}

}
