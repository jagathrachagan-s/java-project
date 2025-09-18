package frameworks;

import java.util.LinkedList;

class Pair{
	int id;
	String name;
	
	Pair(int id ,String name){
		this.id=id;
		this.name=name;
	}
}
public class LinkedlIs {
 public static void main(String args []) {
	    LinkedList <Pair> list= new  LinkedList <> ();
	    
	    list.add(new Pair(1,"jagu"));
	    list.add(new Pair(2,"rach"));
	     
	    for (Pair p:list) {
	    	System.out.println("id"+p.id );
	    }
 }
}
