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

	private static boolean isdivisiable(int n) {int c=0;
		for(int i=1;i<=20;i++) {
			if(n%i==0) {
				c++;
			}
		}if(c==20)
			return true;
		else 
			return false;
	}

}
