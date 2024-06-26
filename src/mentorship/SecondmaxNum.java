package mentorship;

public class SecondmaxNum {
public static void main(String[] args) {
	int [] a= {12,34, 56,78, 90,234,78,234};
	int secondmax = 0,max;
	max=a[0];
	for(int i=0;i<a.length;i++) {
		if (a[i]>max) {
			secondmax=max;
			max=a[i];
		}else if(a[i]>secondmax) {
			secondmax=a[i];
		}
		if (max==secondmax) {
			
		}
	}
	System.out.println("max number : "+max);
	System.out.println("Second max number :"+secondmax);
}
}
