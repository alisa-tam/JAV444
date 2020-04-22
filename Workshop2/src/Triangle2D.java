
import java.awt.geom.Line2D;
import java.lang.Math;

public class Triangle2D {

	MyPoint p1;
	MyPoint p2;
	MyPoint p3;
	
	Triangle2D() {
		
		p1 = new MyPoint(0,0);
		p2 = new MyPoint(1,1);
		p3 = new MyPoint(2,5);
		
	}
	
	Triangle2D(MyPoint one, MyPoint two, MyPoint three) {
		
		p1 = new MyPoint(one.getX(),one.getY());
        p2 = new MyPoint(two.getX(),two.getY());
        p3 = new MyPoint(three.getX(),three.getY());
	}
	
	public MyPoint getP1() {
		
		return this.p1;
	}
	
	public MyPoint getP2() {
		
		return this.p2;
	}
	
	public MyPoint getP3() {
		
		return this.p3;
	}
	
	public double area() {
		
		double side_1 = p1.distance(p2);
        double side_2 = p1.distance(p3);
        double side_3 = p2.distance(p3);
        
        double s = ((side_1 + side_2 + side_3)/2);
        
        return Math.sqrt(s * ((s - side_1) * (s - side_2) * (s - side_3)));
		
	}
	
	public double perimeter() {
		
		double side1 = p1.distance(p2);
		double side2 = p1.distance(p3);
		double side3 = p2.distance(p3);
		
		return (side1 + side2 + side3);
			
	}
	
	public boolean contains(MyPoint p) {
		
		Triangle2D t1 = new Triangle2D(p, this.p1, this.p2);
		Triangle2D t2 = new Triangle2D(p, this.p1, this.p3);
		Triangle2D t3 = new Triangle2D(p, this.p2, this.p3);
		
		double t1_area = t1.area();
		double t2_area = t2.area();
		double t3_area = t3.area();
		double t_area = this.area();
		
		double total_area = t1_area + t2_area + t3_area;
		
		if (total_area == t_area) {
						
			return true;
			
		} else {
			
			return false;
		}
		
	}
	
	public boolean contains(Triangle2D t) {
		
		if( this.contains(t.getP1()) && this.contains(t.getP2()) && this.contains(t.getP3())){
			
			return true;
			
		} else {
					
		return false;
		
		}
    }
       
	public boolean overlaps(Triangle2D t) {
		
		Line2D line_1 = new Line2D.Double();
        line_1.setLine(this.getP1().getX(),this.getP1().getY(),this.getP2().getX(),this.getP2().getY());

        Line2D line_2 = new Line2D.Double();
        line_2.setLine(this.getP1().getX(),this.getP1().getY(),this.getP3().getX(),this.getP3().getY());

        Line2D line_3 = new Line2D.Double();
        line_3.setLine(this.getP3().getX(),this.getP3().getY(),this.getP2().getX(),this.getP2().getY());

        Line2D s1 = new Line2D.Double();
        s1.setLine(t.getP1().getX(),t.getP1().getY(),t.getP2().getX(),t.getP2().getY());

        Line2D s2 = new Line2D.Double();
        s2.setLine(t.getP1().getX(),t.getP1().getY(),t.getP3().getX(),t.getP3().getY());

        Line2D s3 = new Line2D.Double();
        s3.setLine(t.getP3().getX(),t.getP3().getY(),t.getP2().getX(),t.getP2().getY());

        boolean c1 = line_1.intersectsLine(s1);
        boolean c2 = line_1.intersectsLine(s2);
        boolean c3 = line_1.intersectsLine(s3);

        boolean c4 = line_2.intersectsLine(s1);
        boolean c5 = line_2.intersectsLine(s2);
        boolean c6 = line_2.intersectsLine(s3);

        boolean c7 = line_3.intersectsLine(s1);
        boolean c8 = line_3.intersectsLine(s2);
        boolean c9 = line_3.intersectsLine(s3);

        if (c1 || c2 || c3 || c4 || c5 || c6 || c6 || c7 || c8 || c9){
        	
            return true;
            
        }
      
            return false;
      }

	}

