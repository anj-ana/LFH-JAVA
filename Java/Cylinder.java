package mypack;
class Circle{
	 static double radius;
	public static double area;
	 Circle(double radius){
		this.radius = radius;
		}
	public static  double getRadius() {
		if(radius<0) {
			return 0;
		}else {
		return radius;
	}
	}
    public static double getArea() {
		double area = Math.PI *radius * radius;
		return area;
	}
}
public class Cylinder extends Circle {
	    static double height;
	    static double volume;
	    public static void main(String[]args) {
			Cylinder c = new Cylinder(4.5,2.5);
			System.out.println(  "Volume:"+" "+getVolume());
			}
		Cylinder(double height,double radius) {
			super(radius);
			this.height = height;
	}
		public static double getHeight() {
			if(height<0) {
				return 0;
			}else {
				return height;
			}
		}
		public static double getVolume() {
			 volume = getArea() * height;
			return volume;
		}
	}
