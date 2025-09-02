package dailytaskjava;

 class Encapulation {

	public static void main(String[] args) {
		// Encapulation 
		person exobj= new person();
		exobj.setName ("jaggu");
		exobj.setAge (21);
		System.out.println(exobj.getName());
		System.out.println(exobj.getAge());
	}

}

class person
{
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	int age;
	

}