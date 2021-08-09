package mypack;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		 Scanner myVar = new Scanner(System.in);
		  System.out.println("Enter the number:");
		  String str = myVar.nextLine();
		  whileLoop(1);
         }
        
	
	
	public static void whileLoop(int num) {
	     while(num <11) {
       	 System.out.println(num);
       	 num++;
	}
}
}