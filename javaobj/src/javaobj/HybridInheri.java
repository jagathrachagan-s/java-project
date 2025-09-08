package javaobj;


class Animal {
	void eat() {
		System.out.println("animals eats");
	}
}
interface CanBark{
	void bark();
}
interface CanMeow{
	void meow();
}
class Pet extends Animal implements CanBark,CanMeow {
	public void bark() {
		System.out.println("dog barks");
	}
	public void  meow() {
		System.out.println("cot meows");
	}
	void play() {
		System.out.println("pet plays");
		}
}

public class HybridInheri{
	public static void main (String[]args) {
		Pet myPet = new Pet();
        myPet.eat();   // From Animal
        myPet.bark();  // From CanBark
        myPet.meow();  // From CanMeow
        myPet.play();  // Own method
	}
}
//	// Parent class
//	class Animal {
//	    void eat() {
//	        System.out.println("Animal eats");
//	    }
//	}
//
//	// Interface 1
//	interface CanBark {
//	    void bark();
//	}
//
//	// Interface 2
//	interface CanMeow {
//	    void meow();
//	}
//
//	// Child class (Hybrid Inheritance)
//	class HybridInheri extends Animal implements CanBark, CanMeow {
//	    public void bark() {
//	        System.out.println("Dog barks");
//	    }
//
//	    public void meow() {
//	        System.out.println("Cat meows");
//	    }
//
//	    void play() {
//	        System.out.println("Pet plays");
//	    }
//	}

