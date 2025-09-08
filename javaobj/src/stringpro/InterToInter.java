package stringpro;

interface One1 {
       public void printone();
}
interface Two2{
	public void printtwo();
}
interface Three1 extends One1,Two2 {
	public void printthree();
}

class Child implements Three1{
	public void printone() {
		System.out.println(print
	}
}