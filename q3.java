//The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600851475143 ?


public class q3 {

	public static void main(String[] args) {
		 double n=600851475143.0;double max=0; int c=0,s = 0;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				if(i>1) {
					for(int j=2;j<=i/2;j++) {
						if(i%j==0)
							c++;
					}if(c==0)
						s=i;
				}
		}

	}System.out.println(s);
	}
}
