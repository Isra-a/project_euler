//Project Euler solution002
//The sum of the even-valued terms in the Fibonacci sequence that do not exceed 4 million
public class AddEvenFibNumber{

	public static void main(String[] args) {

		int n=1;	//first fibonacci number
		int m=2;	//second fibonacci number
		int sum=0;
		
		while(n<4000000) {
			if(n%2==0) {
				sum=sum+n;
			}
			int k = n+m;	
			n=m;		//incrementing fibonacci number
			m=k;		
		}
		System.out.println("This sum of even fibonacci numbers until four million is "+sum);
	}

}
