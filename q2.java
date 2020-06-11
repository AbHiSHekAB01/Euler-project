package eulerProject;


public class q2 {

	public static void main(String[] args) {
	
		int sum=0;
		int i=1;
		int j=2;
		int k=0;
		while (i<=4000000)
		{ 
			if (i%2==0)
				sum+=i;
			k=i+j;
			i=j;
			j=k;
			
			
		}
		System.out.println(sum);

	}

}