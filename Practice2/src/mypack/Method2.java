package mypack;

public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String i = oddOrEven(5);
		System.out.println(i);
		
	}
	
	
	public static String oddOrEven(int num) {
		    String s = "";
		
          if(num%2==0) {
        	  s = "The number is even";
        	  
          }
          
          else {
        	  s = "The number is odd";
          }
                return s ;
	}     
              
}
