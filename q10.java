// Q10) The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

// Find the sum of all the primes below two million.

package eulerProject;

public class q10
{
	public static void main(String args[])
	{
	   int j,i;
           long n=2,c=0; 
	   for(i=3;i<2000000;i+=2)
	   {
		
	    for(j=3;j*j<=i;j+=2)
	    {
                c=0;
                if(i%j==0)
                {		
		   c=1;
                   break;	
	        }
            }
            if(c==0)
	     n+=i;
        }        
        System.out.println(n);
   }    
} 
