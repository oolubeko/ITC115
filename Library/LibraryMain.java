//ITC115 Final
//Oluwatomisin Olubeko
//Eric Yocom
//Morgan Richmond

//Main class to test
public class LibraryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LibraryItems book = new Book("To Kill a Mockingbird", "fiction");
		book.setDaysPastDue(4);
		LibraryItems audioTape = new AudioTape("Serial","English");
		audioTape.setDaysPastDue(4);
		LibraryItems cd = new CD("Waves", "Music");
		cd.setDaysPastDue(4);
		LibraryItems mag = new Magazine("Sports Illustrated", 5);
		mag.setDaysPastDue(4);
		LibraryItems video = new Video("Moonrise Kingdom", "Wes Anderson");
		video.setDaysPastDue(4);
		
		
		
		LibraryMember steve = new LibraryMember("Steve Conger", "spconger@gmail.com");
		System.out.println(steve);
		steve.checkOut(book);
		steve.checkOut(audioTape);
		steve.checkOut(cd);
		steve.checkOut(mag);
		steve.checkOut(video);
				
		//Checkout books
		for(int i = 0; i < steve.getItemsCheckedOut().length; i++)
		{
			System.out.println(steve.getItemsCheckedOut()[i]);
		}
		
		/*
		//Set days past due
		for(int i = 0; i < 5; i++)
		{
			steve.getItemsCheckedOut()[i].setDaysPastDue(3);
		}
		*/
		System.out.println("Current balance: " + steve.displayBalance());
		for(int i = 0; i < 5; i++)
		{
			steve.updateBalance(steve.getItemsCheckedOut()[i]);
		}
		//Check them back in
		for(int i = 0; i < 5; i++)
		{
			steve.getItemsCheckedOut()[i].checkIn();
		}
		
		//Print out steve's basket
		//for(int i = 0; i < steve.getItemsCheckedOut().length; i++)
		//{
		//	System.out.println(steve.getItemsCheckedOut()[i]);
		//}
		
		//Print steve's balance
		
		System.out.println("Current balance: " + steve.displayBalance());
		
		//Pay balance
		
		steve.payFines(5);
		
		
		
		
		
		
		
		
		
		
		

	}

}
