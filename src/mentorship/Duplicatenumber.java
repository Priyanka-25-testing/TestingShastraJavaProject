package mentorship;

public class Duplicatenumber {
	public static void main(String[] args) {
		int a1[] = { 12, 34, 56, 12, 34, 10, 12,34,12 };
		System.out.println("Duplicate number from array :");
		for (int i = 0; i <a1.length; i++) {
		int c=0;
			for (int j = i+1; j < a1.length; j++) {
				
				if (a1[i] == a1[j]) {  
					c=a1[i];
			      }
			}
			if(c!=0) {
			System.out.println(c);
	}
}
}
}