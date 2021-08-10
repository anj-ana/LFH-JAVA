package mypack;

public class Leap {
	
	public static boolean isLeapYear(int year) {
	    
		if(year%4==0) {
			return true;
		}
		else {
			return false;
		}
    }

	public static void main(String[] args) {
		boolean s =isLeapYear(2021);
		 System.out.println(s);

	}

}
