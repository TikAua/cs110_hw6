package shapes;

public class Rectangle {
	private int Width;
	private int Height;
	
	public Rectangle(int wid, int hei){
		this.width = wid;
		this.height = hei;
	}
	
	public int getArea(){
		return this.Width*this.Height;
	}
}
