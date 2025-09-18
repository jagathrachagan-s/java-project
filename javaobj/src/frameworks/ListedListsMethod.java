package frameworks;

import java.util.LinkedList;

public class ListedListsMethod {

	public static void main(String[] args) {
	       LinkedList <String> cars = new  LinkedList <String> ();
	        cars.add("volve");
	        cars.add("bmw");
	        cars.add("ford");
	        cars.add("mazda");
	        System.out.println(cars);
	        cars.addfirst("mazda");
	        cars.addlast("audi");
	        System.out.println(cars);
	        //use removefirst () remove the first item from the list 
	        cars.removefirst();
	        cars.removeflast();
	        cars.getfirst();
	        cars.getlast();
	        
	        
	        boolean contains=cars.contains("volvo");
	        System.out.println(contains);
	        boolean isEmpty=cars.isEmpty();
	        System.out.println(isEmpty);
//	        cars.clear();
//	        System.out.println(cars);
     
	}

}
