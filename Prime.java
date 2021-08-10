package mpack;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = isPrime(11);
		System.out.println(b);

	}
	
	public static boolean isPrime(int a) {
		
		int i;
		if(a<=1) {
			return false;
		}
		else {
	          for(i=2;i<a;i++) {
	        	  if(a%i==0) {
	        		  return false;
	        	  }else {
	        		  return true;
	        	  }
	          }
		}
		return false;
		   
	}

}
