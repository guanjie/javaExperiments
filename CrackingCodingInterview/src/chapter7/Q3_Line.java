package chapter7;

public class Q3_Line {//Simple yet powerful, and beautiful. Good Question;
	public double epsilon =0.00001;
	public double slope;
	
	Q3_Line(double slope){
		this.slope = slope;
	}
	
	boolean intersect(Q3_Line line2){
		return Math.abs((this.slope-line2.slope))>epsilon;
	}

}
