package mypack;
public class Overload {
   public static void main(String[] args) {
	   getDuration(110);
	   getDuration(70,110);
	}
	public static void getDuration(int minutes, int seconds ) { //minutes = 70,seconds=110    110 sec= 1 min & 50 sec, 70 min= 1 hr & 10 min
	    minutes =minutes + (seconds/60);       // minutes= 71
		seconds = seconds%60;      // seconds = 50
		int hours = minutes/60;    // hour=1 , minutes=71
		minutes = minutes%60;  // minutes = 11
		printTheResult(hours,minutes,seconds);
	}
	public static void getDuration(int seconds) {
		int minutes= seconds/60;
         seconds=seconds%60;
		getDuration(minutes,seconds);
		
	}
	public static void printTheResult(int hours, int minutes, int seconds) {
		//System.out.println(hours + " "+ "hours"+" "+ minutes+" "+"minutes"+" "+ seconds+" "+"seconds"+" "+"are there");
		if(hours==0) {
			System.out.println( minutes+" "+"minutes"+" "+ seconds+" "+"seconds"+" "+"are there");
		}else if(hours==0 && minutes==0) {
			System.out.println( seconds+" "+"seconds"+" "+"are there");
		}
		else if(seconds==0) {
			System.out.println(hours + " "+ "hours"+" "+ minutes+" "+"minutes"+" "+"are there");
		}else {
			System.out.println(hours + " "+ "hours"+" "+ minutes+" "+"minutes"+" "+ seconds+" "+"seconds"+" "+"are there");
		}
	}
	

}
