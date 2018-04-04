/*Write a method called isSorted that accepts an array of real numbers as a parameter
 * and returns true if the list is in sorted(non-decreasing) order and false otherwise.
 * Assume the array has at least 1 element. A one element array is considered sorted.
 */
public class Sorting {
	
	public static boolean isSorted(double[] list)
	{
		boolean sorted = true;
		if(list.length < 2)
		{
			return sorted;
		}
		double prev = list[0];
		for(int i = 0; i < list.length; i++)
		{
			if(list[i] < prev)
			{
				sorted = false;
			}
			prev = list[i];
		}
		return sorted;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] list1 = {2.4,3.7,4.8,6.7};
		System.out.println(isSorted(list1));
	}

}
