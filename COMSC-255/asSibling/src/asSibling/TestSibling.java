package asSibling;

import javax.swing.JOptionPane;

public class TestSibling {

	public static void main(String[] args) {
		// This methods tests the Sibling class
		
		String in, out, name;
		int age, weight, height;
		
		//create siblings
		SiblingExt sib1,sib2,sib3;
		
		// input name, age, weight values for first sibling object
		name = JOptionPane.showInputDialog("Enter name");
		in = JOptionPane.showInputDialog("Enter age");
		age = Integer.parseInt(in);
		in = JOptionPane.showInputDialog("Enter weight");
		weight = Integer.parseInt(in);
		in = JOptionPane.showInputDialog("Enter height");
		height = Integer.parseInt(in);
		
		//Create the first SiblingExt object
		sib1 = new SiblingExt (name, age, weight, height);
		
		// input name, age, weight values for second sibling object
		name = JOptionPane.showInputDialog("Enter name");
		in = JOptionPane.showInputDialog("Enter age");
		age = Integer.parseInt(in);
		in = JOptionPane.showInputDialog("Enter weight");
		weight = Integer.parseInt(in);
		in = JOptionPane.showInputDialog("Enter height");
		height = Integer.parseInt(in);
		
		//Create the second Sibling object
		sib2 = new SiblingExt(name, age, weight, height);
		
		// input name, age, weight values for third sibling object
		name = JOptionPane.showInputDialog("Enter name");
		in = JOptionPane.showInputDialog("Enter age");
		age = Integer.parseInt(in);
		in = JOptionPane.showInputDialog("Enter weight");
		weight = Integer.parseInt(in);
		in = JOptionPane.showInputDialog("Enter height");
		height = Integer.parseInt(in);

		//Create the third SiblingExt object
		sib3 = new SiblingExt(name, age, weight, height);
		
		//create Sibling references
		SiblingExt youngest=null, lightest=null, tallest = null;
		
		//Find the youngest
		if (sib1.getAge() <= sib2.getAge() && sib1.getAge() <= sib3.getAge() )
		{
			youngest=sib1;
		}
		else if (sib2.getAge() <= sib1.getAge() && sib2.getAge() <= sib3.getAge() )
		{	
			youngest=sib2;
		}
		else
		{
			youngest=sib3;
		}
		
		//Find the lightest
		if (sib1.getWeight() <= sib2.getWeight() && sib1.getWeight() <= sib3.getWeight() )
		{
			lightest=sib1;
		}
		else if (sib2.getWeight() <= sib1.getWeight() && sib2.getWeight() <= sib3.getWeight() )
		{	
			lightest=sib2;
		}
		else
		{
			lightest=sib3;
		}
		
		//Find the tallest
				if (sib1.getHeight() >= sib2.getHeight() && sib1.getHeight() >= sib3.getHeight() )
				{
					tallest=sib1;
				}
				else if (sib2.getHeight() >= sib1.getHeight() && sib2.getHeight() >= sib3.getHeight() )
				{	
					tallest=sib2;
				}
				else
				{
					tallest=sib3;
				}
		
		
		
		out = "The Youngest Sibling: " + youngest.getName() + " " + youngest.getAge() + " " + youngest.getWeight() + " " + youngest.getHeight() +  "\n";	
		out = out + "The Lightest Sibling: " + lightest.getName() + " " + lightest.getAge() + " " + lightest.getWeight() +  " " + lightest.getHeight() + "\n";
		out = out + "The Tallest Sibling: " + tallest.getName() + " " + tallest.getAge() + " " + tallest.getWeight() + " " + tallest.getHeight() +  "\n";
		
		//display output
		JOptionPane.showMessageDialog(null, out);
		
		
		
	}

}
