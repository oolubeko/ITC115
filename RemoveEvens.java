import java.util.ArrayList;

//Write a method called removeEvenLength that takes an ArrayList of strings as a parameter and removes all the strings of
//even length from that list


public class RemoveEvens {

	public static void removeEvenLength(ArrayList<String> stringList)
	{
		int i = 0;
		while(i <stringList.size())
		{
			if(stringList.get(i).length() % 2 == 0)
			{
				stringList.remove(i);
				continue;
			}
			i++;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("This");
		list.add("party");
		list.add("is");
		list.add("so");
		list.add("crazy");
		
		System.out.println("List before function call: " + list);
		removeEvenLength(list);
		System.out.println("List after function call: " + list);

	}

}
