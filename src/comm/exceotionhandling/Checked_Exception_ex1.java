package comm.exceotionhandling;

public class Checked_Exception_ex1 {
	int x=10;
	public void m1()
	{
		System.out.println("x="+x);
	}
	public static void main(String args[])
	{
		Checked_Exception_ex1 c=new Checked_Exception_ex1();
		c.m1();
		try
		{
			Thread.sleep(1000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
}
