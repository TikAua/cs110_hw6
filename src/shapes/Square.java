package shapes;

public class Square {
	private int s_Length;

	public Square(int l){
		this.s_Length = l;
	}

	public int getArea(){
		return this.s_Length * this.s_Length;
	}
}