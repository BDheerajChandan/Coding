import java.io.*;
import java.util.*;
public class ThreadsParallel extends Thread
{
	public int iter;
	public boolean runit=true;
	public void threadnum(int iter_1)
	{
		this.iter=iter_1;
	}
	public void threadstop()
	{
		runit=false;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(iter+" : "+(i+1));
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String args[])throws IOException
	{
		ThreadsParallel tp1=new ThreadsParallel();
		tp1.threadnum(1); 
		
		ThreadsParallel tp2=new ThreadsParallel();
		tp2.threadnum(2); 
		
		tp1.start();
		tp2.start();
		System.out.println("tp1 before : "+tp1.isAlive());
		System.out.println("tp2 before : "+tp2.isAlive());
		tp1.threadstop();
		tp2.threadstop();
		try
		{
			tp1.join();
			tp2.join();
		}
		catch(InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("tp1 after : "+tp1.isAlive());
		System.out.println("tp2 after : "+tp2.isAlive());
	}
}