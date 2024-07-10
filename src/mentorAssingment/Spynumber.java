package mentorAssingment;

import java.util.Scanner;
//Spy number is number A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
//ex = 1412 is spy number
public class Spynumber {
	public static void main(String[] args) {
		System.out.println("Enter the number :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int t=num;
		int d,sum=0,p=1;
		while(num>0) {
			d=num%10;
			sum=sum+d;
			p=p*d;
			num=num/10;
		}
		if (sum==p) {
			System.out.println("The number "+t+" is Spy number");
		}else {
			System.out.println("The number "+t+"is not a Spy number");
		}
	}
}
