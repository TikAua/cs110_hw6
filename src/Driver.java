
import shapes.Rectangle;
import shapes.Square;
import utils.Math;
public class Driver{
	public static void main(String[] args) {
		Square a = new Square(8);
		System.out.println(a.getArea());
		Rectangle b = new Rectangle(10, 15);
		System.out.println(b.getArea());
		double x = 15.6;
		System.out.println(Math.factorial((int)x));
		System.out.println(Math.factorialLoop((int)x));
	}

}