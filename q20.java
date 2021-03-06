/* Q20) n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!*/
import java.math.BigInteger;
public class q20 {
		public static void main(String args[]) {
			BigInteger f= getFact(100);
			BigInteger s= new BigInteger("10");
			BigInteger r= new BigInteger("1");
			BigInteger sum=new BigInteger("0");
		    while(f.compareTo(r)>0)
		    {
		    	r=f.remainder(s);
	    		sum=sum.add(r);
	    		f=f.divide(s);
		    }
		    System.out.println(sum);
		}
		public static BigInteger getFact(int n) {
	        BigInteger fact = new BigInteger("1");

	        for (int i=n;i>0;i--) {
	            fact= fact.multiply(BigInteger.valueOf(i));
	        }
	        return fact;
	    }
		
		

}
