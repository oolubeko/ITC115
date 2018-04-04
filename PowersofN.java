//Write a function called printPowersofN that takes in 2 arguments, a base b and a power n,
//and prints out the powers of b up to n

public class PowersofN {
	
	public static void printPowersofN(int b, int n)
	{
		for(int i = 0; i <= n; i++)
		{
			int result = 1;
			for(int j = 0; j < i; j++)
			{
				result *= b;
			}
			System.out.print(result + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPowersofN(2,7);
		printPowersofN(5,3);
	}

}
