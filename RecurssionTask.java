package mypack;
import java.util.Scanner;

public class RecurssionTask {

	public static void main(String[] args) {
		
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the no:");
		
		int a = myObj.nextInt();
		isRecurssion(a);
		
	}
	
	public static void isRecurssion(int a) {
		int fact = 1;
		
		int i;
		for(i=1;i<=a;i++) {
			fact = fact*i;
		}
		System.out.println(fact);
	}

}
