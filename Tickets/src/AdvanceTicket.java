//Advance Ticket class's constructor is a ticket number and number of days bought in advance
public class AdvanceTicket extends Ticket{
	
	//Calls constructor for ticket, then sets ticket price based on number of days bought in advance
	public AdvanceTicket(int num, int days)
	{
		super(num);
		if (days >= 10)
		{
			this.setPrice(30);
		}
		
		else
		{
			this.setPrice(40);
		}
	}
}
