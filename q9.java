package eulerProject;

public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		for (int b=1; b<1000;b++)
			for (int c=b+1; c<1000; c++)
			{
				a=1000-b-c;
				if(a*a==b*b+c*c)
				{
					System.out.println(a*b*c);
				}
			}
			

	}

}
