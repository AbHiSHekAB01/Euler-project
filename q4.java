//Q4) A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//Find the largest palindrome made from the product of two 3-digit numbers.

package eulerProject;


public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=0, n, maxp=0, product;
		for(int i = 999;i>=0;i--)
		{
			for(int j=999;j>=0;j--)
			{
				p=0;
				product=i*j;
				n=product;
				while(n>0)
				{
					p=p*10+n%10;
					n=n/10;
				}
				if (product==p && p>maxp)
				{
					maxp=p;
				}
			}
		}
		System.out.println(maxp);

	}
}
