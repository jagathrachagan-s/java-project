package Arreys;

public class CustomsException extends Exception{
	private static int accno[]= {1001,1002,1003,1005};
	private static String name[]= {"jagath","rachaga","barath","nive"};
	private static double  balce[]= {10000.00,546842.00,9999.00,99999.00};
	   
	  public CustomsException() {}
	  public CustomsException(String str) {
		  super(str);
	  }
	  public static void main(String[]args) {
		  try {
			  System.out.println("Accno"+"\t"+"Name"+"\t"+"Balance");
			  for(int i=0;i<4;i++) {
				  System.out.println(accno[i]+"\t"+name[i]+"\t"+balce[i]);
				  if(balce[i]<1000) {
					  CustomsException obj=new CustomsException("balance less than 1000");
					  throw obj;
				  }
			  }
		  }
		  catch(CustomsException obj) {
			  System.out.println("exception caught"+obj.toString());
		  }
	  }

}
