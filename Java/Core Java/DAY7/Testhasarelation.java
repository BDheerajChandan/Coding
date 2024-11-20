class Person
{
	int id;
	String name;
	Address ad;
	public Person(int id, String name, Address ad)
	{
		
		this.id = id;
		this.name = name;
		this.ad = ad;
	}
	
	void dispPerson()
	{
		System.out.println(id+name+ad.state+ad.city+ad.pin);
		//ad.dispAddress();
	}
	
}


class Address
{
	String city;
	String state;
	int pin;
	
	public Address(String city, String state, int pin) {
		
		this.city = city;
		this.state = state;
		this.pin = pin;
	}
	
	void dispAddress()
	{
		System.out.println(city+state+pin);
	}
}


public class Testhasarelation 
{

	public static void main(String[] args) 
	{
		Address ad = new Address("Karnataka","Blr",560038);
		
		Person p = new Person(1001,"shan",ad);
		p.dispPerson();
	}
}



