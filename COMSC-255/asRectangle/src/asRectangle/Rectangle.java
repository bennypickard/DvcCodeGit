package asRectangle;

public class Rectangle {

	//instance variables
	private double length;
	private double width;
	
	//constructor
	public Rectangle(double l, double w)
	{
		length = l;
		width = w;
	}
	
	//accessor methods
	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}
	
	//other instance methods
	public double computeArea()
	{
		return (width * length);//return calculated area
	}
	
	public double computePerim()
	{
		return 2*(width+length);//return calculated perimeter
	}
}
