package mypack;
import java.util.Scanner;

public class Binarysearch {

	public static void main(String[] args) {

		int i,key,upper,lower,mid;
		Scanner sc = new Scanner(System.in);
		int arr[]= new int [10];
		System.out.println("Enter the elements:");
		for( i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		 System.out.println("Enter the value:");
	        key=sc.nextInt();
        lower=0;
        upper=(arr.length)-1;
        mid=(upper+lower)/2;
        
        while(lower<=upper) {
        	if(arr[mid]<key) {
        		lower=mid+1;
        	}
        	else if(arr[mid]==key) {
        		System.out.println("Element is found at"+" "+(mid)+" "+"position");
        		break;
        	}else {
        		upper=mid-1;
        	}
        	mid=(upper+lower)/2;
        	
        }
        if(lower>upper) {
        	System.out.println("Element not found");
        }
	}

}
