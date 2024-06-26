package mentorship;
//add comment
public class AlternateArrayElements {
	public void print(int x[]) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}

	}

	public static void main(String[] args) {
		int x[] = { 23, 34, 54, 63, 73, 82, 92, 13, 56 };
		int y[] = new int[5];
		int z[] = new int[4];
		int j = 0, k = 0;
		AlternateArrayElements a = new AlternateArrayElements();
		System.out.println("Alternate element are as below:");

		for (int i = 0; i < x.length; i++) {
			if (i % 2 == 0) {
				y[j] = x[i];
				j++;
			} else {
				z[k] = x[i];
				k++;
			}

		}

//	for (int i = 0; i < y.length; i++) {
//			System.out.print(y[i] + " ");
//		}
//		System.out.println();
//		for (int i = 0; i < z.length; i++) {
//			System.out.print(z[i] + " ");
//		}
		a.print(y);
		System.out.println();
		a.print(z);
	}
}
