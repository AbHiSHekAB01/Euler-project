//Q7) By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//
//What is the 10 001st prime number?

package eulerProject;

public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3,i=1;
		while ( i<10001)
		{ 
			int c=0;
			for ( int j=3; j<=a/2; j+=2)
			{
				if (a%j==0)
				{
					c++;
					break;
		
				}
			}
			if (c==0) {
				i++;
			}
			a+=2;	
		}
		System.out.println(a-2);
		}

	}

//------------------output--------------------------------------------------

//104743
