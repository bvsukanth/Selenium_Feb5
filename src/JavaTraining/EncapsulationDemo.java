package JavaTraining;


class Person{
	
	private String name;
	private int age;
	
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
		this.age = (age*10)/5;
	}
	
	
}


public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person();
		p.setAge(30);
		p.setName("Raju");
		
		
		System.out.println("Name: " + p.getName());
		System.out.println("Age: " + p.getAge());

	}

}




/*
 * Object,Class,Inheritance,Polymorphism,Abstraction,Encapsulation
 */
