package mentorAssingment;

import java.util.Scanner;

public class SumofSeries1 {
	public static void main(String[] args) {
		System.out.println("Enter the value for x & N ");
	   Scanner sc=new Scanner(System.in);
	   int x=sc.nextInt();
	   int N=sc.nextInt();
	   int add=0;
	   for(int i=1;i<=N;i++) {
		   add=add+(int)(Math.pow(x,i));
	   }
		System.out.println("Sum of series of x to the power of n = "+x +"for raise to power N =  "+add);
	}

}
