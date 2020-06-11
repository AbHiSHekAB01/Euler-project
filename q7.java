//Q7) By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//
//What is the 10 001st prime number?

package eulerProject;

public class q7 {
	public static void main(String args[]) {

		int n=3, i=1;
		while(i<10001) {
			if(isPrime(n)) {
				i++;	
			}
			n+=2;
		}
		System.out.println(n-2);
	}
	public static boolean isPrime(int n) {
		int c=0;
		for(int i=3; i<=n/2;i+=2) {
			if(n%i==0) {
				c++;
				return false;
				
			}
		}
		
		if(c==0) {
			return true;
		}
		return false;
	}
}

//------------------output--------------------------------------------------

//104743
