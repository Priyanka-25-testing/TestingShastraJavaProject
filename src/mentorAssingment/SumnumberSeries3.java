package mentorAssingment;

import java.util.Scanner;

//series 1^1+2^2+3^3+.....+n^n=
public class SumnumberSeries3 {
	public static void main(String[] args) {
		System.out.println("Enter the value  N:");
		Scanner sc = new Scanner(System.in);
		// int x=sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + (int) Math.pow(i, i);
		}
		System.out.println("sum of series 1^1+2^2+3^3+.....+n^n for n = " + n + " is = " + sum);
	}

}
