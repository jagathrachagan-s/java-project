package Arreys;

public class NullPointerExp {

	public static void main(String[] args) {
	     
		try {
			String a=null, b="hello";
			System.out.println(a.charAt(0));
			System.out.println(b.charAt(0));
		}
		catch(NullPointerException J){
		 System.out.println("NullPointerExp"+J);
		}

	}

}
