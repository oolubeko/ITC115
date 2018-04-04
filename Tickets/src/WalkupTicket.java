//Walkup Tickets are also constructed by number, and they have a price of $50
public class WalkupTicket extends Ticket{
	
	//Constructor calls the superclass Ticket and sets ticket price to $50
	public WalkupTicket(int number)
	{
		super(number);
		this.setPrice(50);
	}
}
