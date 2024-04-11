package JavaTraining;

public class static_Demo {
	
	//static can be used for methods and variables, static block for assigning values
	
	//Instance variables 
	String name;
	String address;
	
	//class variables 
	static String city = "Chennai";
	static int i = 0;
	
	public static_Demo(String name, String address)
	{
		this.name = name;
		this.address = address;
		//int i = 10;
		i++;
		System.out.println(i);
	}
	
	public void getAddress()
	{
		System.out.println(address);
	}
	
	public static void getCity()
	{
		System.out.println(city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		static_Demo sd = new static_Demo("Raj", "Hyderabad");
		sd.getAddress();
		
		//classname.methodname = static
		//classname.varaible = static
		static_Demo.getCity();
		static_Demo.i=10;

	}

}
