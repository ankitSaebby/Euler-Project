//Q16) 215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
//
//     What is the sum of the digits of the number 2^1000?


public class q16 {
	public static void main(String args[]) {
	double x= Math.pow(2, 1000);
	System.out.println(x);
		double sum = 0, r;
	    while( x!= 0 )
	    {
	        r=x % 10;
	        sum=sum+r;
	        x /= 10;
	    }System.out.println(" the sum of the digits of the number 2^1000"+sum);

	
	}
}
