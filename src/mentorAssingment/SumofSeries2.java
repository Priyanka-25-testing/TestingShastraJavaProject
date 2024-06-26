package mentorAssingment;

import java.util.Scanner;

public class SumofSeries2 {
	public static void main(String[] args) {
		int n;
		double sum=0;
		System.out.println("Enter the number n");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
		sum+=(double)i/(i*4);
		}
		System.out.println("Sum of series for 1/4 +2/8 + 3/12 ...n, for n= " +n+" is "+sum);
	}

}
