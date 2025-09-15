package Arreys;

public class IllegelArgsException {
        public static void print(int a) 
        //IllegalArgumentException it is a uncheaked exception in java occurs when a method receives an illegal 
        //or
        // in appropriate argument
        {
        	if(a>=18) {
        		System.out.println("eligible to vote");
        	}
        	else {
        		throw new  IllegalArgumentException ("not eligible for vote");
        	}
        }
        public static void main(String[] args) {
        	print(14);
        }
}
