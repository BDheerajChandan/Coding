import java.io.*;
import java.util.*;
public class ThreadsParallel extends Thread
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
			System.out.println(iter+" : "+(i+1));
			try {
				Thread.sleep(1000);
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
	}
}