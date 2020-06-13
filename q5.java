//Q5) 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

package eulerProject;

public class q5 {

	public static void main(String[] args) {
		for(int i=20;i>=1;i+=20) {
			if(isdivisiable(i)) {
				System.out.println( "the smallest positive number that is evenly divisible by all of the numbers from 1 to 20  "+i);
				break;
			}
		}
	}

	private static boolean isdivisiable(int n) {
		int c=0;
		for(int i=1;i<=20;i++) {
			if(n%i==0) 
				c++;
			else {
				return false;
			}
		}
		if(c==20)
			return true;
		
		return false;
	}

}

//------------------output--------------------------------------------------

//the smallest positive number that is evenly divisible by all of the numbers from 1 to 20  232792560
