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