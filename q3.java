//The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600851475143 ?


public class q3 {

	public static void main(String[] args) {
		 double n=600851475143.0;double max=0;
		for(double i=2;i<Math.sqrt(n);i++) {
			if(n%i==0) {
				if(i>max)
					max=i;
			}
		}System.out.println((int)max);

	}

}
