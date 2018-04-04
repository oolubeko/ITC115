
public class CD extends LibraryItems {
	
	
	private String cdGenre;
	public CD(String name, String genre)
	{
		super();
		this.setItemType("CD");
		this.setCheckedOut(false);
		this.setItemName(name);
		this.cdGenre = genre;
	}
	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		
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

	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		
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
		System.out.println("Genre: " + this.cdGenre);
		
		return "";
	}

}
