
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int fib[] = new int[12];
		int count = 12;
		fib[0] = 1;
		fib[1] = 1;
		while(count > 0)
		{
			if(i < 2)
			{
				System.out.println(fib[i]);
				i += 1;
				count -= 1;
				continue;
			}
			fib[i] = fib[i-1] + fib[i-2];
			System.out.println(fib[i]);
			i += 1;
			count -= 1;
		}
			

	}

}
