package eulerProject;

import java.math.BigInteger;
public class q16 {
	public static void main(String args[]) {
		BigInteger f = new BigInteger("2");
		BigInteger x=f.pow(1000);
		BigInteger a= new BigInteger("10");
        BigInteger s = new BigInteger("1");
        BigInteger sum = new BigInteger("0");
		
	    while( x.compareTo(s)>0 )
	    {
	    	s=x.remainder(a);
            sum=sum.add(s);
            x=x.divide(a);
	    }System.out.println(sum);

	
	}
}