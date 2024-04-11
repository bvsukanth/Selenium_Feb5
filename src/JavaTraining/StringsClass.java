package JavaTraining;

public class StringsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String Literal
		String s = "Java"; // location 1 - system memory  
		String r = "Java";// location 1 - system memory 
		
		//by creating objects
		String s2 = new String("Java"); // location 1 - system memory 
		String s3 = new String("Java");// location 2 -system memory
		
		String s1 = "Selenium Testing using Java";
		String[] stringSplit = s1.split(" ");
		System.out.println(stringSplit[0]);
		System.out.println(stringSplit[1]);
		System.out.println(stringSplit[2]);
		System.out.println(stringSplit[3]);
		
		System.out.println(stringSplit[0].trim());
		
		System.out.println(stringSplit[1].charAt(1));
		
		System.out.println(stringSplit[3].toUpperCase());
		System.out.println(stringSplit[3].toLowerCase());
		
		System.out.println(stringSplit[0].contains("Sel"));
		
		
		for(int i=0; i< s1.length();i++)
		{
			System.out.println(s1.charAt(i));
		}
		
		

	}

}
