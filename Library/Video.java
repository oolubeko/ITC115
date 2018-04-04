
public class Video extends LibraryItems {
	
	private String director;
	public Video(String name, String dir)
	{
		super();
		this.setItemType("Video");
		this.setCheckedOut(false);
		this.setItemName(name);
		this.director = dir;
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
	
	public boolean securityChipInstalled()
	{
		return this.getSecurityChip();
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
	
	public String toString()
	{
		System.out.println("Item Number: " + this.getItemNumber());
		System.out.println("Item Type: " + this.getItemType());
		System.out.println("Title: " + this.getItemName());
		System.out.println("Director: " + this.director);
		
		return "";
	}

}
