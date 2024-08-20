package comm.exceotionhandling;

public class C_03_Unchecked_exception_try_catch {
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
		System.out.println("Program End");
	}
}
