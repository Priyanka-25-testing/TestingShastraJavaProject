package mentorship;

import java.util.Scanner;
//Write a java program to find even and odd element in given array
public class EvenOddPrimeNumber {
	public int evenNumber(int array[]) {// method to print only even numbers from array
		System.out.println("The even number in the Array are below:");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.println(array[i]);
			}
		}
		return 0;
	}

	public int oddNumber(int array[]) {// method to print only odd numbers from array
		System.out.println("The odd number in the Array are below:");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				System.out.println(array[i]);
			}
		}
		return 0;
	}

	public int primeNumber(int array[]) {//// method to print only Prime numbers from array
		System.out.println("The Prime number in the Array are below:");
		int temp, c = 0;

		for (int i = 0; i < array.length; i++) {
			c = 0;
			for (int j = 1; j <= array[i]; j++) {
				if (array[i]%j == 0) {
					c++;
				}
			}
			if (c == 2) {
				System.out.println(array[i]);
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println("Enter the array Size ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the Array element:");
		int x[] = new int[n];
		for (int i = 0; i < x.length; i++) {
			Scanner sc1 = new Scanner(System.in);
			x[i] = sc1.nextInt();
		}
		EvenOddPrimeNumber obj = new EvenOddPrimeNumber();
		obj.evenNumber(x);
		obj.oddNumber(x);
		obj.primeNumber(x);

	}

}
