package eulerProject;

public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3,i=1;
		while ( i<10001)
		{ 
			int c=0;
			for ( int j=3; j<=a/2; j+=2)
			{
				if (a%j==0)
				{
					c++;
					break;
		
				}
			}
			if (c==0) {
				i++;
			}
			a+=2;	
		}
		System.out.println(a-2);
		}

	}