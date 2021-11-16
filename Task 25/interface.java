//interface
package mypack;

public interface Voicecall {
	boolean isadvertise();
	int callduration();

}
interface groupchat{
	int grouplimit();
	void groupabout();
	
}
// implementing to a class

package mypack;

public class Whatsapp implements Voicecall , groupchat {

	public static void main(String[] args) {
		Whatsapp objW = new Whatsapp();
		objW.groupabout();
		}

    @Override
	public  boolean isadvertise() {
		boolean n = false;
		// TODO Auto-generated method stub
		return n;
	}

	@Override
	public int callduration() {
		int n = 7200;
		return n;
	}

	@Override
	public int grouplimit() {
		int m = 250;
		return m;
		 
	}
	
    public void groupabout() {
    	System.out.println("Welcome Techies!! Network and Learn");
    	System.out.println(this.isadvertise());
    	System.out.println("Duration:"+this.callduration());
    	System.out.println("Limit:"+this.grouplimit());
    	
		
		
	}

}
