
public class Ever100
{
  public  void main() 
    {
    int n=7;
    int count;
    float sum;
    sum = 0;
    for ( count = 1; count <=n; count++)
    {
    sum = sum +count*(count+1)*(count+2);
    }
    System.out.println("Sum is = " +sum);
    
        }
    }