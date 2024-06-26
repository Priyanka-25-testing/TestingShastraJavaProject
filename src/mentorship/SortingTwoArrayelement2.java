package mentorship;

public class SortingTwoArrayelement2 {
	public static void main(String[] args) {
	int x[] = { 10, 45, 78, 32, 71, 7, 0, 67 };
	int y[] = { 11, 45, 67, 34, 57, 23, 58, 10 };
	int e=0,o=0;
	int [] temp=new int[x.length + y.length];
	for(int i = 0;i<x.length;i++)
	{
		temp[i] = x[i];
	}
	
		for (int j = 0; j < y.length; j++) {
			temp[x.length+j] = y[j];		
		}
	
	for(int i1 = 0;i1<(x.length+y.length);i1++)
	{
	  if(temp[i1]%2==0) {
		  e+=1;
	  }else {
		  o+=1;
	  }
	}
	int x1[]=new int[e];
	int y1[]=new int[o];
	e=0;o=0;
	for(int i=0;i<(x.length+y.length);i++) {
		if(temp[i]%2==0) {
			x1[e]=temp[i];
			e+=1;
		}else {
			y1[o]=temp[i];
			o+=1;
		}
	}
	System.out.println("X array with even elements: ");
	for(int i=0;i<e;i++) {
		System.out.print(x1[i]+" ,");
	}
	System.out.println();
	System.out.println("Y array with odd elements:");
	for(int i=0;i<o;i++) {
		System.out.print(y1[i]+" ,");
	}
	
	}
}
