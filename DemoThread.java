package mypack;

class ThreadOne extends Thread{
	public void run() {
	for(int i=0;i<6;i++) {
		System.out.println("Hello!Anjana here!!");
	}
	try {
		Thread.sleep(1000);
		
	}
	catch(Exception e) {
		
	}
}
}
class ThreadTwo extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Heyy!what a surprise");
		}
		try {
			Thread.sleep(2000);
			
		}
		catch(Exception e) {
			
		}
}
}
class ThreadThree extends Thread{
	public void run() {
		for(int i=0;i<4;i++) {
			System.out.println("What about having a coffee?!!");
		}
		try {
			Thread.sleep(1000);
			
		}
		catch(Exception e) {
			
}
	}
}
class ThreadFour extends Thread{
	public vid run(){
		for(int i=0;i<4;i++) {
			System.out.println("Yeah!!It's Christhmas Here!!!!");
		}
		try{
			Thread.sleep(1000)
		}
		catch(Exception e){
		
		}
		
	}
}

class ThreadFour extends Thread{
	public vid run(){
		for(int i=0;i<4;i++) {
			System.out.println("ooh!! It's over");
		}
		try{
			Thread.sleep(2000)
		}
		catch(Exception e){
		
		}
		
	}
}

public class DemoThread {

	public static void main(String[] args)throws InterruptedException {
		
		ThreadOne obj1 = new ThreadOne();
		ThreadTwo obj2 = new ThreadTwo();
		ThreadThree obj3 = new ThreadThree();
		ThreadFour obj4 = new ThreadFour();
		ThreadFive obj5 = new ThreadFive();
		obj1.start();
		obj2.start();
		obj3.start();
		obj4.start();
		obj5.start();
			

	}
	

}
