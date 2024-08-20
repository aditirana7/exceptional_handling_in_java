package comm.exceotionhandling;

public class Unchecked_exception_try_catch_finally {
	public static void main(String args[])
	{
		System.out.println("Program Started");
		try
		{
			int x=10;
			System.out.println("Division result is:"+x);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Something went wrong"+e.getMessage());
		}
		finally {
		System.out.println("This is finally block");
				}
	}
}
