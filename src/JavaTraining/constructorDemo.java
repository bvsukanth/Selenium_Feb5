package JavaTraining;

public class constructorDemo {

	// constructor
	public constructorDemo() {
		System.out.println("In Constructor");
	}

	// parameterized constructor
	public constructorDemo(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}

	// parameterized constructor
	public constructorDemo(String s) {
		System.out.println(s);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructorDemo cd = new constructorDemo();
		constructorDemo cd1 = new constructorDemo(4,5);
		constructorDemo cd2 = new constructorDemo("Hyderabad");

	}

}
