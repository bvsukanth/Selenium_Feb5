package JavaTraining;

public class thisDemo {
	
	int a = 2;
	
	public void getData()
	{
		int a = 3;
		System.out.println(a);
		
		//this refers to current object and scope lies with class level
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thisDemo td = new thisDemo();
		td.getData();

	}

}
