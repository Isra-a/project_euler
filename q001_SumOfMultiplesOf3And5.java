//Project Euler solution001
//The sum of all the multiples of 3 or 5 below 1000.
public class MultiplesOf3And5 {

	public static void main(String[] args) {
		int sum=0;
		int n=0;
		while(n<1000) {
			if(n%3==0||n%5==0) {
				sum=sum+n;
				System.out.println(sum);
			}
			n++;
		}
		System.out.println("The sum of all multiple of 3 or 5 below "+n+" is "+sum);
	}

}
