package mentorship;

import java.util.Scanner;

public class EvenoddWithoutArithmaticOperator {
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		evenoddnumUsingConditions(num);
		System.out.println(evenOddNumberWithoutConditions(num)?"Even" : "Odd");
		
	}
		private static void evenoddnumUsingConditions(int num) {
		
		if((num & 1)==0) {
			System.out.println("Number "+num+" is Even");
		}
		else {
			System.out.println("Number  "+num+" is odd");
		}
	}
		public static boolean evenOddNumberWithoutConditions(int num){
			return (num & 1)==0;
		}

}
// 10 = 2*3  2*2 2*1 2*0
//        8    4   2   1
//  10       1    0    1   0
//    9     1    0     0   1
//    1     0   0     0    1
//  10 & 1= 0    0    0    0  for even
//  
//  9&1   = 0001 for odd