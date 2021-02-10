package asRectangle;

import javax.swing.JOptionPane;

public class TestRectangle {

	public static void main(String[] args) {
		//This fuction tests the rectangle class
		
		String in, out;
		double l, w;
		double area, perim;
		
		//Inputs for rectangle 1, convert strings to doubles
		in = JOptionPane.showInputDialog("Enter length");
		l = Double.parseDouble(in);
		in = JOptionPane.showInputDialog("Enter width");
		w = Double.parseDouble(in);
		
		//create rectangle 1
		Rectangle r1 = new Rectangle(l,w);
		
		//Input object 2. string to doubles
		in = JOptionPane.showInputDialog("Enter length");
		l = Double.parseDouble(in);
		in = JOptionPane.showInputDialog("Enter width");
		w = Double.parseDouble(in);
		
		//create rectangle 2
		Rectangle r2 = new Rectangle(l,w);
		
		//call methods for r1
		l = r1.getLength();
		w = r1.getWidth();
		area = r1.computeArea();
		perim = r1.computePerim();
		
		//format output string
		out = "First Rectangle:\n";
        out = out + "Length: " + l + "\n";
        out = out + "Width: " + w + "\n";
        out = out + "Area: " + area + "\n";
        out = out + "Perimeter: " + perim + "\n\n";
		
        //call methods for r2
        l = r2.getLength();
		w = r2.getWidth();
		area = r2.computeArea();
		perim = r2.computePerim();
		
		//format output part 2
		out = out + "Second Rectangle:\n";
        out = out + "Length: " + l + "\n";
        out = out + "Width: " + w + "\n";
        out = out + "Area: " + area + "\n";
        out = out + "Perimeter: " + perim + "\n";

        //display entire output
        JOptionPane.showMessageDialog(null,out);
	}

}
