
public class StudentAdvanceTicket extends AdvanceTicket{
	
	//Constructor uses constructor of the super class, then sets the value of the ticket to half
	public StudentAdvanceTicket(int num, int days)
	{
		super(num,days);
		this.setPrice(this.getPrice() / 2);
	}
	
	//Override toString method in Ticket class
	public String toString()
	{
		return "Number: " + this.getNumber() + ", Price: " + this.getPrice() + " (ID Required)";
	}

}
