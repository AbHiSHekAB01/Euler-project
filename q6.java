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
	static int squareDiff(int n){ 
		  
		int l, k, m;  
		    l = (n * (n + 1) * (2 * n + 1)) / 6; 
		    k = (n * (n + 1)) / 2; 
		    k = k * k;  
		    m = Math.abs(l - k); 
		      
		    return m; 
		  
		} 
	public static void main(String s[]) 
	{ 
		    int n = 100; 
		    System.out.println(squareDiff(n));      
	}  
	

}

//------------------output--------------------------------------------------

//25164150
