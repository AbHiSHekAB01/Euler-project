//Q9) A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//
//a2 + b2 = c2
//For example, 32 + 42 = 9 + 16 = 25 = 52.
//
//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//Find the product abc.


package eulerProject;

public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		for (int b=1000; b>1;b--)
			for (int c=b-1; c>1; c--)
			{
				a=1000-b-c;
				if(a*a==b*b+c*c)
				{
					System.out.println(a*b*c);
				}
			}
			

	}

}

//------------------output--------------------------------------------------

//31875000
