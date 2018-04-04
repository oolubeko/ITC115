//Main ticket class to test all of the ticket classes
public class TicketMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ticket walkUp = new WalkupTicket(5);
		Ticket adv30 = new AdvanceTicket(7,10);
		Ticket adv40 = new AdvanceTicket(18,7);
		Ticket st_adv15 = new StudentAdvanceTicket(12,13);
		Ticket st_adv20 = new StudentAdvanceTicket(14,5);
		
		System.out.println(walkUp);
		System.out.println(adv30);
		System.out.println(adv40);
		System.out.println(st_adv15);
		System.out.println(st_adv20);

	}

}
