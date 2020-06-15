//Q5) 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

package eulerProject;

public class rough5 {
	public static void main(String args[]) {
		int i=20;
		for(;i>0;i+=20) {
			int c=1;
			for(int j=1;j<=20;j++) {
				if(i%j!=0) {
					c++;break;
				}
			}
			if(c==1) 
				break;
		}System.out.println(i);
	}
}

//-----------------------output---------------------------------------------------------------
//232792560

