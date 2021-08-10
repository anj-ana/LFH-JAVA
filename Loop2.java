package mypack;

import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		 Scanner myVar = new Scanner(System.in);
		  System.out.println("Enter the number:");
		  String str = myVar.nextLine();
		  doWhileLoop(1);	
	    

	}
	
	public static void doWhileLoop(int i) {
		 do{
			 System.out.println(i);
			 i++;
			 
		 }while(i<11);
	}

}
