
public class Coordinate {
	public float x;
	public float y;
	public Coordinate(float x, float y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Coordinate)) return false;
		Coordinate c2 = (Coordinate) o;
		return this.x == c2.x && this.y == c2.y;
	}
}
