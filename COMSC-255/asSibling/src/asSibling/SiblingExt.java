package asSibling;

public class SiblingExt extends Sibling {
	private int height;
	
	//constructor
	public SiblingExt(String n ,int a, int w, int h)
	{
		//Parent instructor
		super(n,a,w);
		height = h;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	
	
}
