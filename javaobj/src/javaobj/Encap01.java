package javaobj;

public class Encap01 {
           private String name;
           public String getName() {
        	   return name;
           }
           public void setName(String setname) {
           this.name=setname;
           }
           public static void main(String [] args) {
        	   Encap01 obj =new Encap01();
        	   obj.setName("auto");
        	   System.out.println(obj.getName());
           }


}
