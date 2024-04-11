package JavaTraining;

public class MethodsinJava {

	
	//access specifier - public
	//return type - void 
	//method name - main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create object for MethodsinJava class using new key word 
		MethodsinJava d = new MethodsinJava();
		MethodsinJava2 d1 = new MethodsinJava2();
		String s = d.addProducts();
		String s1 = d1.updateProducts();
		
		System.out.println(s);
		System.out.println(s1);

	}
	
	
	public String addProducts()
	{
		//int i = 0;
		//return i;
		
		String s = "Hello from AddProducts Method";
		return s;
		
		//boolean h = true;
		//return h;
	}
	
	public String deleteProducts()
	{
		String s = "Hello from deleteProducts Method";
		return s;
	}
	
	
	//String functions - "Hello How are you" - split using 'h'
	//Print all chars in above String in lower case
	//Create multiple methods in class and return int and print it

}
