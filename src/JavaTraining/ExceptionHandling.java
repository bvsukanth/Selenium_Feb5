package JavaTraining;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exception - try, catch, finally
		int a = 4;
		int b = 2;

		try {
			int k = a / b;
			System.out.println(k);
			
			
		} catch (ArithmeticException e) {
			System.out.println("Got Arithmetic Exception");
			//retry mechanism
		}
		catch (Exception e) {
			System.out.println("Got Exception");
			//retry mechanism
		}
		finally {
			
			//finally block will execute irrespective of exception thrown or not
			//closing DB connections, closing any other applications which are open
			System.out.println("I am in finally block");
		}

	}

}
