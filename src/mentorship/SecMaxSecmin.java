package mentorship;

public class SecMaxSecmin {
	public static void main(String[] args) {
		int [] arr= {14,12,4,45,67,9,97,70,71};
		int temp=0;
		//Sorting array element
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		}
		System.out.println("Array element in ascending order : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=arr.length-1;i>0;i--) {
			if(arr[i]!=arr[i-1]) {
				System.out.println("Secong largest number : "+arr[i-1]);
				break;
			}
			}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=arr[i+1]) {
				System.out.println("Second minium number :"+arr[i+1]);
				break;
			}
		}
		// Occurance of the array elements 
		int count=0;
		for(int i=0;i<arr.length;i++) {
			count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]&& arr[i]!=-1) {
					count++;
				   arr[j]=-1;	
				}
				}
			if(arr[i]!=-1) {
				System.out.println(arr[i]+" occures "+count );
			}
		}
		}
	}
    
