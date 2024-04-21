import java.io.*;
import java.util.*;
interface DBconnect
{
    public void New();
}
class Oracle implements DBconnect
{
    public void New()
    {
        System.out.println("Oracle with Java");
    }
}
class Sql implements DBconnect
{
    public void New()
    {
        System.out.println("SQL with Java");
    }
}
class MongoDB implements DBconnect
{
    public void New()
    {
        System.out.println("MongoDB with Java");
    }
}
public class Implement
{
    Oracle o=new Oracle();
    o.New();
    Sql s=new Sql();
    s.New();
    MongoDB m=new MongoDB();
    m.New();    
}