package mentorship;

public class AscendingDescendingSum {
	public static void main(String[] args) {
		int x[]= {11,58,35,73,5,18};
		int temp=0;
		
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x.length;j++) {
				temp=0;
				if(x[i]<=x[j]) {
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;	
				}
					}
				}
		System.out.println("Array in Ascending order as below:");
		for(int i=0;i<x.length;i++) {
		System.out.print(x[i]+",");
		}
		System.out.println();
		System.out.println("Array in Descending order as below:");
		for(int i=x.length-1;i>=0;i--) {
			System.out.print(x[i]+",");
		}
		
				}
			}
			
