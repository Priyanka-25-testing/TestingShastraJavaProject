package mentorship;
//Bit operation means sum of each digit in every element in array is called Bitoperation
public class Bitoperation {
	public static void main(String[] args) {
		int digit1, sum = 0;
		int x[] = { 121, 343, 456, 677, 78 };
		System.out.println("Bitoperation as:");
		for (int i = 0; i < x.length; i++) {
			while (x[i] > 0) {
				digit1 = x[i] % 10;
				sum = sum + digit1;
				x[i] = x[i] / 10;
			}
			System.out.println(sum);
			sum = 0;
		}

	}
}
