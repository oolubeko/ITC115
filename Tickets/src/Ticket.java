//Ticket class that contains ticket number and price, getters and setters, and toString.
public abstract class Ticket {
	private int ticketNumber;
	private double price;
	public Ticket(int number)
	{
		this.ticketNumber = number;
	}
	
	public int getNumber()
	{
		return this.ticketNumber;
	}
	
	public void setNumber(int num)
	{
		this.ticketNumber = num;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public String toString()
	{
		 return "Number: " + this.getNumber() + ", Price: " + this.getPrice();
	}
}
