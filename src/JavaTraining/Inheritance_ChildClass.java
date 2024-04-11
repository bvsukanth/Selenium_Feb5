package JavaTraining;

public class Inheritance_ChildClass extends  Inheritance_Parentclass{
	
	
	public void CarMethod()
	{
		System.out.println("Car Method");
	}
	
	public void BikeMethod()
	{
		System.out.println("Bike Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inheritance_ChildClass c = new Inheritance_ChildClass();
		c.HelloMethod();
		c.CreateMethod();
		c.UpdateMethod();
		c.CarMethod();
		c.BikeMethod();
	}

}
