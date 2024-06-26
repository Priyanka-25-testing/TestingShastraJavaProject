package mentorAssingment;

import java.util.Scanner;

//2-6+18-54+..N
public class SumofSeries6 {
public static void main(String[] args) {
	System.out.println("Enter the value for n:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	System.out.println("Number of series");
	for(int i=1,a=2;i<=n;i++,a=a*3) {
		sum=(int)a-(a*3);
		a=a*3;
	}
	System.out.println("2-6+18-54+..N is "+sum);
}
}
