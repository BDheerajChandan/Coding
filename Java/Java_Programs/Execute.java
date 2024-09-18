class Execute
{
int Execute(int M)
{
if(M%3 ==0)
return M*3;
else 
return M*10;
}
void Output(int B)
{
B=2;
for (int T=0; T<B; T++)

System.out.println(Execute(T) +"*");
}
public void main()
{
Output(4);
Output(3);
}
}