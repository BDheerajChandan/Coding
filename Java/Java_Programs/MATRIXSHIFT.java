import java.io.*;
class MATRIXSHIFT
{
    public static void main(String args[])throws IOException
    {
        int x[][]={{1,0,0,0},{2,0,0,0},{3,0,0,0},{4,0,0,0}};
        int y[][]=new int[4][4],i,j,k;
        for(i=1;i<4;i++)
        {
            for(j=1;j<3;j++)
            {
                x[i][j]=x[i-1][j-1];
            }
            k=x[i-1][3];
            x[i][3]=k+x[i-1][j];
        }
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print(x[i][j]);
            }
            System.out.println();
        }
    }
}