package mentorship;

import java.util.Scanner;

public class MaxMinNumberInArray {
	public static void main(String[] args) {
	int x[]= {12,45,87,21,79,89,70};
	int temp=0;
	for(int i=0;i<x.length;i++) {
		//int temp=0;
		for(int j=0;j<x.length;j++) {
			if(x[i]<=x[j]) {
				temp=x[i];
				x[i]=x[j];
				x[j]=temp;
			}	
		}
	}
	System.out.println("Maxium number of array is: "+x[0]);
	System.out.println("Minimum number of Array is : "+x[x.length-1]);
	}
}
