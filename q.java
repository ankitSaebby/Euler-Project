//Q3) A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//Find the largest palindrome made from the product of two 3-digit numbers.


public class q4 {
	public static void main(String args[]) {
		int n=0,max=0;
		for(int i=100;i<1000;i++)
			for(int j=100;j<1000;j++)
			{
				n=i*j;
				if(isPallin(n)) {
					if(max<=n)
						max=n;
				}
			}
		System.out.println("the max product of two three digit no. is "+max);
	}

	private static boolean isPallin(int n) {
		{
			int rev = 0, r, p;

		    p = n; 
		    while( n!= 0 )
		    {
		        r=n % 10;
		        rev=rev* 10 + r;
		        n /= 10;
		    }

		   
		    if (p == rev)
		        return true;
		    else
		        return false;
		}
}
}
