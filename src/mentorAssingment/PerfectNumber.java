package mentorAssingment;

public class PerfectNumber {
/*
 * Perfect number is number equals to the sum of it's divisors, except that number
 For example number 28
 */
	public static void main(String[] args) {
		System.out.println("Try programiz.pro");
		int num = 28, sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
		if (num == sum) {
			System.out.println("The " + num + " is perfect number");
		} else {
			System.out.println("The " + num + " isnot perfect number");
		}

	}
}
