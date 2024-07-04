package mentorAssingment;

import java.util.Scanner;
//x^i+ series
public class NumberofSeries2 {
public static void main(String[] args) {
	System.out.println("Enter the value for x & N for number Series ");
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int N=sc.nextInt();
	int numseries;
	for(int i=1;i<=N;i++) {
		numseries=(int)(Math.pow(x,i));
		System.out.print(numseries+" ");
	}
}
}
