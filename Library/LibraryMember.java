
public class LibraryMember {
	
	//instance variables
	private String name;
	private String email;
	private double balance;
	private LibraryItems[] itemsCheckedOut;
	
	//constructors
	public LibraryMember(String name, String email)
	{
		this.name = name;
		this.email = email;
		this.balance = 0;
		this.itemsCheckedOut = new LibraryItems[15];
	}
	
	public void Add(LibraryItems l)
	{
		int i = 0;
		while(i < itemsCheckedOut.length){
			if(itemsCheckedOut[i] == null)
			{
				itemsCheckedOut[i] = l;
				break;
			}
			i++;
		}	
	}
	
	public void Remove(LibraryItems l)
	{
		int i = 0;
		while(i < itemsCheckedOut.length)
		{
			if(itemsCheckedOut[i].getItemNumber() == l.getItemNumber())
			{
				itemsCheckedOut[i] = null;
				break;
			}
		}
	}
	
	public void checkOut(LibraryItems l)
	{
		if(!l.isCheckedOut())
		{
			l.checkOut();
			this.Add(l);
		}
	}
	
	public void checkIn(LibraryItems l)
	{
		this.updateBalance(l);
		if(l.isCheckedOut())
		{
			l.checkIn();
			this.Remove(l);
		}
	}
	
	public void updateBalance(LibraryItems l)
	{
		this.balance += l.getDaysPastDue();
		
	}
	
	public double displayBalance()
	{
		return this.balance;
	}
	
	public void payFines(double d)
	{
		this.balance -= d;
		System.out.println("Remaining Balance: " + this.balance);
	}
	
	public String toString()
	{
		System.out.println("Name of Patron: " + this.name);
		System.out.println("Email: " + this.email);
		return "";
	}
	
	public LibraryItems[] getItemsCheckedOut()
	{
		return this.itemsCheckedOut;
	}
}
