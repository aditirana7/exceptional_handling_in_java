package comm.exceotionhandling;

public class Checked_Exception_wex2_throws {
	int x=143;
	public void m1()
	{
		System.out.println("x="+x);
	}
	public static void main(String args[]) throws InterruptedException
	{
		Checked_Exception_wex2_throws obj=new Checked_Exception_wex2_throws();
		obj.m1();
		Thread.sleep(0);
	}
}
