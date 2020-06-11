//Q6) The sum of the squares of the first ten natural numbers is,
//
//12+22+...+102=385
//The square of the sum of the first ten natural numbers is,
//
//(1+2+...+10)2=552=3025
//Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025−385=2640.
//
//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

package eulerProject;


public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1=0;
		int s2=0;
		for ( int i=0; i<=100; i++)
		{
			s1 += i*i;
			s2 += i;
		}
		s2=s2*s2;
		int difference = s2-s1;
		System.out.println(difference);

	}

}
