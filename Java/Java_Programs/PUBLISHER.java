class PUBLISHER
{
private long IDNumber;
private String Title;
private String Author;
private double Price;
private double StockQty;
private double StockValue;
private double Valcal()
{

StockValue=Price*StockQty;
return StockValue;
}
public PUBLISHER()
{
Price=0;
StockQty=0;
StockValue=0;
}
void Enter()
{
System.out.println(+IDNumber);
System.out.println(Title);
System.out.println(Author);
}
void TakeStock(int N)
{
StockQty = StockQty + N;
StockValue = Valcal();
}
void Sale(int N)
{
StockQty = StockQty - N;
StockValue = Valcal();
}
void Outdata()
{
System.out.println("ID NUMBER "  +IDNumber);
System.out.println("Title "  +Title);
System.out.println("Author "  +Author);
System.out.println("Price "  +Price);
System.out.println("Stock "  +StockQty);
System.out.println("Value "  +StockValue);
}
}




