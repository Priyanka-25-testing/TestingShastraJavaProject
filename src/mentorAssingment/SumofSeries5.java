package mentorAssingment;

import java.util.Scanner;

//9^2 +13^2+17^2+.....N
public class SumofSeries5 {
public static void main(String[] args) {
	System.out.println("Enter the value for n: ");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	for(int i=1,a=9;i<=n;i+=1,a+=4) {
		sum=sum+(int)Math.pow(a,2);	
	}
	System.out.println("Sum of Series for 9^2 +13^2+17^2+.....N is ="+sum);
}
}
