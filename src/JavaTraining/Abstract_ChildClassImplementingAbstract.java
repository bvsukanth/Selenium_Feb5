package JavaTraining;

public class Abstract_ChildClassImplementingAbstract extends Abstract_ParentClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abstract_ChildClassImplementingAbstract c = new Abstract_ChildClassImplementingAbstract();
		c.bodyColor();
		c.engine();
		
		//we cannot create object for Abstract class

	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Body Color");
	}

}
