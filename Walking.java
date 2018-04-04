/* Write a method named randomWalk that performs a random one-dimensional 
 * walk, reporting each position reached and the maximum position reached 
 * during the walk. The random walk should begin at position 0. On each step, 
 * you should either increase or decrease the position by 1 (with equal 
 * probability). The walk stops when 3 or -3 is hit.
 */

import java.util.Random;
public class Walking {
	public static void randomWalk()
	{
		//Declare variables
		Random rand = new Random();
		int pos = 0;
		int max = 0;
		boolean step;
		
		//Begin the walking routine with a while loop
		while(-3 < pos && pos < 3)
		{
			System.out.println("Position: " + pos);
			step = rand.nextBoolean();		//Assign step a true or false value randomly
			if(step)						//If true, pos + 1
			{
				pos += 1;
			}
			else							//Else, pos - 1
			{
				pos -= 1;
			}
			if(pos > max)					//Update max position
			{
				max = pos;
			}
		}
		
		//Report max
		System.out.println("Final Position: " + pos);
		System.out.println("Max position reached: " + max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		randomWalk();

	}

}
