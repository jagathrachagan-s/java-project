package stringpro;

public class StringHandle {

	public static void main(String[] args) {
		  String obj="hello buddy ";//string literal
		  String ob= new String("hello buddy");// new keyword
		  
           int s1=obj.length();
           System.out.println("the value is "+s1);
           
           char []arr= {'a','b','c'};
           String dumit= String.valueOf(arr);
           System.out.println(dumit);
	}

}
