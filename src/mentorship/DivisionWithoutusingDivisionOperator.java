package mentorship;

public class DivisionWithoutusingDivisionOperator {
	public static void main(String[] args) {
     int a,b;
     a=43  ;
     b=-8;
     System.out.println(divide(a,b));
	}

	static long divide(long dividend,long divisor) {
	long quotient = 0;
	if(dividend<0 || divisor<0) {
		dividend=Math.abs(dividend);
		divisor=Math.abs(divisor);
	}
	 
    while (dividend >= divisor) {
        dividend -= divisor;
        ++quotient;
	}
    return(quotient);
	}
}
