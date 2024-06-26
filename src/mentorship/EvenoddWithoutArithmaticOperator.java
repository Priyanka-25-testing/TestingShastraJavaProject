package mentorship;

import java.util.Scanner;

public class EvenoddWithoutArithmaticOperator {
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		if((num & 1)==0) {
			System.out.println("Number "+num+" is Even");
		}
		else {
			System.out.println("Number  "+num+" is odd");
		}
	}

}
