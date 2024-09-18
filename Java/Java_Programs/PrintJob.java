class PrintJob {
int job[] = new int[20];
int Newjob;
int Capacity;
int Front;
int Rear;
PrintJob()
{
Capacity=20;
Front=-1;
Rear=-1;
}
void createjob()
{
for(int i=0;i<20;i++)
job[i]=0;
}

void addjob()
{
System.out.println("Enter Job Number=" +Newjob);
if(Front==18)
System.out.println("Printjob is full, Cannt not enter more");
else
{
job[Front+1] = Newjob;
Front++;
Rear++;
}
}
void removejob()
{
if(Front==-1)
{

System.out.println("Printjob is Empty");
return;
}
else
{
job[0]=0;
Front--;
Rear--;
System.out.println("Now First Job is="+job[0]);
System.out.println("Advancing Other Jobs\n");

for(int i=0;i<Capacity;i++)
{
job[i]=job[i+1];
}
System.out.println("New First job is " +job[0]);
}
}

}

 