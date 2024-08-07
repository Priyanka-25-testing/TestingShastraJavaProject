package mentorship;

public class Sortingevenoddelements1 {
	public static void main(String[] args) {
		int x[] = { 10, 45, 78, 32, 71, 7, 0, 67 };
		int j = 0, k = 0;
		for (int i = 0; i < x.length; i++) {

			if ( x[i] % 2 == 0) {//even num count
				j += 1;
			} else if (x[i]!=0) {
				k += 1;// odd num count
			}
		}

		int y[] = new int[j];//making array of size of even number
		int z[] = new int[k];//making array of size of odd number
		j = 0;
		k = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 0 ) {
				y[j] = x[i];
				j += 1;
			} else if(x[i]!=0) {
				z[k] = x[i];
				k += 1;
			}
		}
		System.out.println("Even numbers are :");
		for (int j1 = 0; j1 < y.length; j1++) {
			System.out.print(y[j1] + ",");
		}
		System.out.println();
		System.out.println("odd numbers are :");
		for (int k1 = 0; k1 < z.length; k1++) {
			System.out.print(z[k1] + ",");
		}
		
	}
}
