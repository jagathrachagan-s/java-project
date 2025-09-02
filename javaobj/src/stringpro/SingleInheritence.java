package stringpro;

//public class SingleInheritence {
        
	class car{//car starts
		protected String brand ="BMW";
		public void horn()//methods
		{
			System.out.println("the car is horning the road");
			
		}
	}
	class SingleInheritence extends car {//implementing single inheritance 
		public String model="carera911";//properties 
		public static void main(String[]args) {
			//create an object for car class
			SingleInheritence acar=new SingleInheritence();
			//call the method horn()from single inheritance
			acar.horn();
			System.out.println(acar.brand+" "+"and"+" "+acar.model);
		}
	}

