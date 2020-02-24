/* Q20) n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!*/

public class q20 {
		public static void main(String args[]) {
			double a= getFact(100);
			int sum = 0, r;
		    while( a!= 0 )
		    {
		        r=(int)a% 10;
		        sum=sum+r;
		        a/= 10;
		    }
		    System.out.println("the sum of the digits in the number 100!  "+sum);
		}
		public static double getFact(int n) {
			double fact=1;
			while(n!=0) {
				fact=fact*n;
				n--;
			}
			return fact;
		}

}
