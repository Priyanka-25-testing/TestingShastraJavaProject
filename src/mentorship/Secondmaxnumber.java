package mentorship;

import java.util.Iterator;
import java.util.Scanner;
// Second maximum number in the given array
public class Secondmaxnumber {
	public static void main(String[] args) {
		System.out.println("Enter the array size:");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int x[]=new int[n];
		int temp=0;
		int max,secmax=0;
		System.out.println("Enter the array element:");
		for(int i=0;i<x.length;i++) {
			Scanner sc1=new Scanner(System.in);
			x[i]=sc1.nextInt();
		}
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x.length;j++) {
				if(x[i]>=x[j]) {
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		System.out.println("Array elements in Descending order:");
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
		for(int i=0;i<x.length;i++) {
			if(x[i]!=x[i--]) {
				secmax=x[i--];
				
			}
				
		}
	System.out.println("Second max number is :"+secmax);
	}

}
