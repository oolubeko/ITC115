/*Write a method called season that takes as parameters two integers representing
 * a month and day and returns a String indicating the season for that month and day. 
 * Assume that the month is specified as an integer between 1 and 12(1 for January and
 * 12 for December) and that the day of the month is a number between 1 and 31. If the 
 * date falls between 12/16 and 3/15, the method should return "winter." If the date falls 
 * between 3/16 and 6/15, the method should return "spring." If the date falls between
 * 6/16 and 9/15, the method should return "summer." If the date falls between 9/16 and 12/15,
 * the method should return "fall."
 */


public class Seasons {
	
	public static String season(int month, int day)
	{
		String s = "";		//Declare an empty string
		
		//Handles all the edge cases
		if(((month == 12) && (day >= 16)) || ((month == 3) && (day <= 15)))
		{
			s += "winter";
		}
		else if(((month == 3) && (day >= 16)) || ((month == 6) && (day <= 15)))
		{
			s += "spring";
		}
		else if(((month == 6) && (day >= 16)) || ((month == 9) && (day <= 15)))
		{
			s += "summer";
		}
		else if(((month == 9) && (day >= 16)) || ((month == 12) && (day <= 15)))
		{
			s += "fall";
		}
		
		//Handles the regular cases
		else if((month == 1) || (month == 2))
		{
			s += "winter";
		}
		else if((month == 4) || (month == 5))
		{
			s += "spring";
		}
		else if((month == 7) || (month == 8))
		{
			s += "summer";
		}
		else if((month == 10) || (month == 11))
		{
			s += "fall";
		}
		else
		{
			s += "Invalid inputs. Terminating Program.";
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test code using this print statement. First parameter is month,
		//second parameter is day
		System.out.println(season(22,45));
	
		
	}

}
