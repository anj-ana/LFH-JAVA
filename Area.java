package mypack;
public class Area {

	public static void main(String[] args) {
		
	   
		double d = area(3);
		System.out.println(d);
		
		double d2 = area(5,7);
		System.out.println(d2);
	}
	public static double area(int radius) {
		double pi = 3.14;
		double area = pi * radius * radius;
		if(radius < 0) {
			return -1;
		}else {
			return area;
		}
		      
	}
	public static double area(double x,double y) {
		double l=0;
		double b = 0;		
		double areaRect = x * y;
		if(x<0 || y<0) {
		      return -1;
		}
		else {
			return areaRect;
		}
	}
}
