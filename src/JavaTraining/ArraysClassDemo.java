package JavaTraining;

public class ArraysClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//syntax 1
		int[] value = { 1, 2, 3 };
		// value[0] = 1
		// value[1] = 2
		// value[2] = 3

		//syntax
		int value1[] = new int[3];
		value1[0] = 10;
		value1[1] = 20;
		value1[2] = 30;

		for (int i = 0; i < value.length; i++) {
			System.out.println(value[i]);
		}

		for (int i = 0; i < value1.length; i++) {
			System.out.println(value1[i]);
		}
		
		System.out.println(value1[1]);

	}

}
