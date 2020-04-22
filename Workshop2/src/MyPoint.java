
import java.lang.Math;

public class MyPoint {
	
	double x;
	double y;
	
	public MyPoint() {
		
		x = 0;
		y = 0;
	}
	
	public MyPoint (double a, double b){
		
		x = a;
		y = b;
	}
	
	public double getX() {
		
		return this.x;
	}
	
	public double getY() {
		
		return this.y;
	}
	
	public MyPoint getPoint(){
		
		return this;
	}
	
	public double distance(MyPoint p) {
		
		double x_total = Math.pow((p.x - this.x), 2);
		double y_total = Math.pow((p.y - this.y), 2);
		
		double distance =  Math.sqrt(x_total + y_total);
		
		//System.out.println("distance: " + distance);
		
		return distance;	

	}
	
	public double distance(double x, double y) {
		
		double x_total = Math.pow((this.x - x), 2);
		double y_total = Math.pow((this.y - y), 2);
		
		return Math.sqrt(x_total + y_total);	
		
	}
	
}
