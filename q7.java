//Q7) By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//
//What is the 10 001st prime number?


public class q7 {
	public static void main(String args[]) {
		int n=2,i=0,p = 0;
		while(i<=10001) { int c=0;
			for(int j=2;j<=10001;j++)
				if(n%j==0)
					c++;
			if(c==0)
			{
				i++;p=n;
			}n++;
		}
		System.out.println("the 10001th prime no will be  "+p);
	}
}
