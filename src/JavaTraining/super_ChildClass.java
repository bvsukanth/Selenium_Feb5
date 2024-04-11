package JavaTraining;

public class super_ChildClass extends super_ParentClass {
	
	
	//super key word can be used for variables, methods and constructors 
	
	String name = "JavaTraining";
	
	public super_ChildClass()
	{
		super();
		System.out.println("I am in child constructor");
	}
	
	public void getData()
	{
		super.getData();
		System.out.println("I am in child class get method");
	}
	
	public void getNameData() {
		System.out.println(name);
		System.out.println(super.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		super_ChildClass superchildclass = new super_ChildClass();
		superchildclass.getNameData();
		superchildclass.getData();
	}

}
