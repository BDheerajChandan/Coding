class MN
{
public void main()
{
int M[][]={{-1,0,2},{-3,-1,-6},{4,3,-1}};
int MplusN[][]={{-6,9,4},{4,5,0},{1,-2,-3}};
int N[][]=new int[3][3];
int i,j;
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
N[i][j]=MplusN[i][j]-M[i][j];
    }
}
System.out.println("The array N[] is=");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(N[i][j]+" ");
    }
}
    }
}