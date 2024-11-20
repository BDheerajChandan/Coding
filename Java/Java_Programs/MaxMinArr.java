public class MaxMinArr 
{
    public static void main(String args[])
    {
        int a[]={7,17,20,35,10};
        int max=a[0],min=a[0];
        for(int i:a)
        {
            if(i>max)
            {
                max=i;
            }
            if(i<min)
            {
                min=i;
            }
        }
        System.out.println("Maximum : "+max+"\nMinimum : "+min);
    }
}