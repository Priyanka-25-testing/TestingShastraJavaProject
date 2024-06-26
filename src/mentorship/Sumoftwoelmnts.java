package mentorship;

public class Sumoftwoelmnts {
	public static void main(String[] args) {
		int x[]={11,34,56,23,9,13,48,45};
		int targetsum=71;
		System.out.println("The index of array element are");
		for(int i=0; i<x.length-1 ;i++) {
			for(int j=0; j<x.length-1;j++) {
			if(x[i]+x[j]==targetsum) {  
				System.out.println(i);
			}
		}
	}
	}
}
