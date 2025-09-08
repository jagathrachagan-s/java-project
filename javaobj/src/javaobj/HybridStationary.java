package javaobj;
//HybridStationary
 class Stationery  {
public void sharpner() {
	System.out.println("sharpner ready to shape");
}
}
 interface CanPencil{
	 void pencil();
 }
 interface CanEraser{
	 void eraser();
 }
 
 class Book extends Stationery implements CanPencil,CanEraser {
	 public void pencil() {
		 System.out.println("pencil sharped and writes a letter");
	 }
	 public void eraser() {
		 System.out.println("eraser erases a letter");
	 }
	 void writes() {
		 System.out.println("these are stationary product");
	 }
 }
 public class HybridStationary{
	 public static void main (String []args) {
		 Book obj=new  Book();
		 obj.sharpner();
		 obj.pencil();
		 obj.eraser();
		 obj.writes();
	 }
 }
