package asStatus;

import javax.swing.JOptionPane;

public class Sibling implements Status{

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
	
	//interface functions
	public String getStatus()
	{
		String status = "Sibling\nname="+name+", age="+age+", weight="+weight+"\n";
		return status;
	}
	
	public void displayStatus()
	{
		String status = getStatus();
		JOptionPane.showMessageDialog(null, status);
	}
}
