package JavaTraining;

public class variableTypes {
	
	//Instance variables
	String name;
	String address;
	String city;
	int i;
	
	//class variables 
	static int j = 10;
	
	public variableTypes(String name, String address, String city)
	{
		this.name = name;
		this.address = address;
		this.city = city;
	}
	
	
	public void variableTypes()
	{
		System.out.println(name);
		System.out.println(address);
		System.out.println(city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//local variables
		int i = 10;
		int j = 20;
		
		variableTypes vt = new variableTypes("Ajay", "Panjagutta", "Hyderabad");
		variableTypes vt1 = new variableTypes("Bhanu", "Ameerpet", "Hyderabad");
		
		vt.variableTypes();
		vt1.variableTypes();
	}

}
