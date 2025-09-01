package javaobj;

public class MethodUsingParameter {
	
	public int subNumbers(int x,int y) {
		int subtract=x-y;
		// return a value 
		return subtract;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num1=50,num2=30;
      //calling an object
      MethodUsingParameter obj=new MethodUsingParameter();
      //calling the method
      int outcome=obj.subNumbers(num1,num2);//arguments
      System.out.println("the result is"+outcome);
	}

}
