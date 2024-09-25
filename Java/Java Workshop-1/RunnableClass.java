import java.io.*;
import java.util.*;
public class RunnableClass implements Runnable
{
	public int iter;
	public boolean runit=true;
	public void threadnum(int iter_1)
	{
		this.iter=iter_1;
	}
	public void stopThread()
	{
		runit=false;
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
		System.out.println("t1 before : "+t1.isAlive());
		System.out.println("t2 before : "+t2.isAlive());
		r1.stopThread();
		r2.stopThread();
		try 
		{
			t1.join();
			t2.join();
		} 
		catch(InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("t1 after : "+t1.isAlive());
		System.out.println("t2 after : "+t2.isAlive());
	}
}
