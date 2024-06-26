package mentorAssingment;

import java.util.Scanner;

public class SumofSeries4 {
	public static void main(String[] args) {
		System.out.println("Enter the value for a & n");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int n=sc.nextInt();
		double sum=0.0;
		for(int i=1;i<=n;i++) {
			sum=(double)sum+i/Math.pow(a, i); 
		}
		System.out.println("Sum of series for 1/a^1 +2/a^2+.. n/a^n is "+sum);
	}
	

}
