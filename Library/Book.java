
public class Book extends LibraryItems{
	
	private String bookType;
	public Book(String bookName,String type)
	{
		super();
		this.setItemType("Book");
		this.setCheckedOut(false);
		this.setItemName(bookName);
		this.bookType = type;
	}
	
	public void checkIn()
	{
		if(this.isCheckedOut())
		{
			this.setCheckedOut(false);
			this.setDaysPastDue(0);
		}
		else
		{
			System.out.println("This item is already checked in.");
		}
	}
	
	
	public void checkOut()
	{
		if(!this.isCheckedOut())
		{
			this.setCheckedOut(true);
		}
		else
		{
			System.out.println("Sorry, this item is already checked out.");
		}
	}
	
	public boolean securityChipInstalled()
	{
		return this.getSecurityChip();
	}
	
	public String toString()
	{
		System.out.println("Item Number: " + this.getItemNumber());
		System.out.println("Item Type: " + this.getItemType());
		System.out.println("Title: " + this.getItemName());
		System.out.println("Book Type: " + this.bookType);
		
		return "";
	}
	

}
