import java.io.*;
import java.util.*;
public class RunnableClass implements Runnable
{
	public int iter;
	public void threadnum(int iter_1)
	{
		this.iter=iter_1;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(iter+" : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String args[])
	{
		RunnableClass r1=new RunnableClass();
		r1.threadnum(1);
		Thread t1=new Thread(r1);
		RunnableClass r2=new RunnableClass();
		r2.threadnum(2);		
		Thread t2=new Thread(r2);
		
		t1.start();
		t2.start();
	}
}
