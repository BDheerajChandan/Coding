import java.io.*;
import java.util.*;
class Electricity_BillMain_2
{
    public static void main(String args[])throws IOException
    {
        Electricity_bill_2 eb=new Electricity_bill_2();
        eb.readData();
        eb.computeBill();
    }
}