import processing.core.PApplet;

public class Toothpick {
	PApplet p;
	public Coordinate end1;
	public Coordinate end2;
	public static int size = 10; //Half size
	public Toothpick(PApplet p,Coordinate end1, Coordinate end2) {
		this.p = p;
		this.end1 = end1;
		this.end2 = end2;
	}
	
	public Toothpick(PApplet p,Coordinate end, char orien) {
		this.p = p;
		switch(orien) {
		case 'v' :
			end1 = new Coordinate(end.x-size,end.y);
			end2 = new Coordinate(end.x+size,end.y);
			break;
		case 'h' :
			end1 = new Coordinate(end.x,end.y-size);
			end2 = new Coordinate(end.x,end.y+size);
			break;
		default : break;
		}
	}
	
	public void plot() {
		//stroke((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
		p.line(end1.x,end1.y,end2.x,end2.y);
	}
}
