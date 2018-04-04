
//Abstract class for the library
public abstract class LibraryItems {
	
	public static int inventory = 0;
	//Every item in the library has an item number, item name, and item type
	private int itemNumber;
	private String itemName;
	private boolean checkedOut;
	private String itemType;
	private int daysPastDue;
	private boolean securityChip;
	
	public LibraryItems()
	{
		LibraryItems.inventory += 1;
		this.itemNumber = LibraryItems.inventory;
		this.securityChip = true;
	}
	
	//abstract methods
	
	public abstract void checkIn();
	public abstract void checkOut();
	public abstract String toString();
	public abstract boolean securityChipInstalled();
	
	
	
	public int getItemNumber()
	{
		return this.itemNumber;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public boolean isCheckedOut() {
		return checkedOut;
	}

	public void setCheckedOut(boolean checkedOut) {
		this.checkedOut = checkedOut;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public int getDaysPastDue() {
		return daysPastDue;
	}

	public void setDaysPastDue(int daysPastDue) {
		this.daysPastDue = daysPastDue;
	}
	
	public boolean getSecurityChip()
	{
		return this.securityChip;
	}

	
	
	
	
	
}
