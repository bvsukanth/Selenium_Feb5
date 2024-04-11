package JavaTraining;

public class ForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 20; i > 10; i--) {
			System.out.println(i);
		}
		
		String[] value = {"Hello","Hi","Hello1"};
		//int j =20;
		//value[0] = 1
		//value[1] = 2
		//value[2] = 3
		System.out.println("*****Enhanced For Loop*******");
		for(String bhanu : value)
		{
			System.out.println(bhanu);
		}
		
		//if else - i=10, check condition
		//while - 1000 to 0 - print numbers
		//do while - 0 to 1000 - print numbers
		//for loop - 23 to 39 - print numbers
		//enhanced for loop - print 6 names

	}

}
