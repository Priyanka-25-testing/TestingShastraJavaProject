package mentorAssingment;

import java.util.Scanner;

//1/2+ 2/4 + 3/6+..N
public class SumofSeries7 {
public static void main(String[] args) {
	System.out.println("Enter the value for n:");
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	double sum=0.0;
	for(int i=1;i<=n;i++) {
		sum=sum+(double)i/(2*i);
	}
	System.out.println("Sum of Series for 1/2+ 2/4 + 3/6+..N is "+sum);
}
}
