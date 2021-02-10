package asSibling;

public class Sibling {

	//Instance variables
	private String name;
	private int age;
	private int weight;
	
	//Constructor
	public Sibling(String n, int a , int w)
	{
		name = n;
		age = a;
		weight = w;
	}
	
	//Accessor methods
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public int getWeight()
	{
		return weight;
	}
	
}
