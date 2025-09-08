package stringpro;

interface  shape {
       double getArea();
}
class Rectangle implements shape
{
	private double length;
	private double width;

public Rectangle(double length,double width)
{
	this.length=length;
	this.width=width;
}
public double getArea() {
	return length*width;
}
}
class Triangle implements shape
{
	private double base;
	private double height;

public Triangle(double base,double height)
{
	this.base=base;
	this.height=base;
}
public double getArea() {
	return 0.5 *base*height;
}
}
class Circle implements shape{
	private double radius;
	
public Circle(double radius)
{
	this.radius=radius;

}
public double getArea() 
{
	return 2* radius;
}
}
public class InterfaceClass {s
public static void main(String[]args) {
	shape rect=new Rectangle(5.0,8.0);
	shape tri=new Triangle(7.0,9.0);
	shape cir=new Circle(7.5);
	
	System.out.println("area of rect"+ rect.getArea());
	System.out.println("area of tri"+tri.getArea());
	System.out.println("area of cir"+cir.getArea());
}
}
