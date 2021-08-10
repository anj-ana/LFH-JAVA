package mypack;

public class VowelTest {
	
	  public static boolean isVowel(char letter) {
		switch(letter) {
		case 'a':
			return true;
		case 'e':
			return true;
		case 'i':
			return true;
		case 'o':
			return true;
		case 'u':
			return true;
	    default:
	    	return false;
	   }
		
	}
       public static void main(String[] args) {
		// TODO Auto-generated method stub
      boolean b = isVowel('g');
      System.out.println(b);
      }
	
}
