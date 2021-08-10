package mypack;

import java.util.Scanner;

public class Loop3 {

	public static void main(String[] args) {
		 Scanner myVar = new Scanner(System.in);
		  System.out.println("Enter the number:");
		  String str = myVar.nextLine();
		 forLoop(1);

	}
	
	public static void forLoop(int var) {
		
	for(var=1;var<11;var++) {
			System.out.println(var);
		}
	}
	

}
