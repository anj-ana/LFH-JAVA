package mypack;
class Calculator{
	void sum(int a, int b){
		System.out.println(a+b);
	}
	void difference(int c, int d) {
		System.out.println(c-d);
	}
}
class CalculatorNew extends Calculator{
		void mul(int p, int r){
			System.out.println(p*r);
		}
		void div(int m,int n) {
			System.out.println(m/n);
		}
	}


public class Calc {

	public static void main(String[] args) {
		CalculatorNew c1 = new CalculatorNew();
		c1.sum(4, 5);
		c1.difference(10, 6);
		c1.mul(7, 2);
		c1.div(8, 3);
		
		

	}

}
