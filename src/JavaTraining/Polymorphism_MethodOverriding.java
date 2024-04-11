package JavaTraining;

public class Polymorphism_MethodOverriding extends Inheritance_Parentclass {

	@Override
	public void HelloMethod() {
		System.out.println("Hello from Method Overriding");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polymorphism_MethodOverriding a = new Polymorphism_MethodOverriding();
		a.HelloMethod();

	}

}
