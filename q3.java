//Q3) The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600851475143 ?

package eulerProject;


public class q3{

	public static void main(String[] args) {
		
		long n= 600851475143L;
		for  (long i=2L; i<n; i++)
		{
			while(n%i==0)
			{
				n=n/i;
			}

		}

		System.out.println(n);
		}
	}

