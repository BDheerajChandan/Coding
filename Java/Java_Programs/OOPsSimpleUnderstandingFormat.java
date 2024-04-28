// OOPs simple understanding - interface, method overriding, method overloading
import java.io.*;
import java.util.*;
interface Girl
{
    public void relation();  // A girl having a relation
}
class Relationship implements Girl
{
    public void relation()   // Girl relation status - comitted
    {
    }
}
class Boy_1 extends Relationship
{
    public void relation()   // Girl with boy_1
    {
    }
    public void MarrigaeWithGirl(boolean engagement)  
    {
    }
    public void MarrigaeWithGirl(String NewSurName)  
    {
    }
}
class Boy_2 extends Relationship
{
    public void relation() // Girl with boy_2
    {
    }
    public void MarrigaeWithGirl(boolean engagement)  
    {
    }
    public void MarrigaeWithGirl(String NewSurName)  
    {
    }
}
public class OOPsSimpleUnderstandingFormat 
{
    Boy_1 b1=new Boy_1();   // Boy_1 has relation with same girl
    Boy_2 b2=new Boy_2();   // Boy_1 has relation with same girl
}