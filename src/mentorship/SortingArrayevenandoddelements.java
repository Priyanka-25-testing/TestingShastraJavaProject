package mentorship;

public class SortingArrayevenandoddelements {
public static void main(String[] args) {
	int x[]= {10, 45, 78, 32, 71, 7};
	for(int i=0;i<x.length;i++) {
		if(x[i]%2==0 && x[i]!=0) {
			System.out.println(x[i]+" is even number");
		}else if(x[i]!=0){
			System.out.println(x[i]+" is odd number");
		}else {
			System.out.println(x[i]+"is not even number nor odd number");
		}
	}
}
}
