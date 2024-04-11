package JavaTraining;

public class Polymorphism_MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Polymorphism_MethodOverloading a = new Polymorphism_MethodOverloading();
		a.HelloWorld();
		a.HelloWorld(10);
		a.HelloWorld(20, 30);
		a.HelloWorld("Hello World from Method overloading");

	}
	
	public void HelloWorld()
	{
		System.out.println("Hello World");
	}
	
	public void HelloWorld(int a)
	{
		System.out.println(a);
	}
	
	public void HelloWorld(int a, int b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public void HelloWorld(String s)
	{
		System.out.println(s);
	}

}
