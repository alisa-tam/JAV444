import java.text.DecimalFormat;

public class Tester {
	
	 private static DecimalFormat df2 = new DecimalFormat("#.###");


	public static void main(String[] args) {
		
		System.out.println("------------   TRIANGLE T1   ------------\n");
		
		Triangle2D t1 = new Triangle2D(new MyPoint(2.5,2), new MyPoint(4.2,3), new MyPoint(5, 3.5));
		
		System.out.println("The area of t1 is: " + df2.format(t1.area()));
		
		System.out.println("The perimeter of t1 is: " + df2.format(t1.perimeter()));
		
		System.out.println("Does t1 contain new point(3,3)? Answer: " + t1.contains(new MyPoint(3,3)));
		
		System.out.println("Does t1 contain new triangle? Answer: " + t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))));
		
		System.out.println("Does t1 overlap the new triangle? Answer: " + t1.overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), new MyPoint(2, 6.5))));
		
		System.out.println("\n------------   TRIANGLE T2   ------------\n");
		
		Triangle2D t2 = new Triangle2D(new MyPoint(0, 0), new MyPoint(0, 2), new MyPoint(2, 0));
		
		System.out.println("The area of t2 is: " + df2.format(t2.area()));
		
		System.out.println("The perimeter of t2 is: " + df2.format(t2.perimeter()));
		
		System.out.println("Does t2 contain new point(1, 1)? Answer: " + t2.contains(new MyPoint(1,1)));
		
		System.out.println("Does t2 contain new triangle? Answer: " + t2.contains(new Triangle2D(new MyPoint(4, 5), new MyPoint(10.5, 3.2), new MyPoint(-0.5, -10.5))));
		
		System.out.println("Does t2 overlap the new triangle? Answer: " + t2.overlaps(new Triangle2D(new MyPoint(1, 1.7), new MyPoint(-1, 1.7), new MyPoint(0, -3))));

	}

}
