package model;

public class Point {

	final private int x, y ;
	static int keepTrack;
	
	


	
	
	public Point(int x, int y) {
		this.x =x ;
		this.y =y;
		keepTrack++;
	}
	
	public Point ( Point p2) {
		this.x = p2.getX();
		this.y = p2.getY();
	}
	
	//1- method translate
	public Point translate(int dx,  int dy) {
		return new Point(this.x + dx,this.y + dy);
		
	}
	
	
	public void showPoint() {
		
		Point p=new Point(2,3);
		System.out.println("Number of Points : " + keepTrack);
		System.out.println(p.getX()+" "+p.getY());
	}
	
	public boolean isSameAs( Point p) {
		if( this.x == p.getX() && this.y == p.getY()) {
			return true;
		}else {
			return false;
		}
		
		
	}
	
	@Override
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}
	
	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}

	
	
}

