package asRectangleProc;

import javax.swing.JOptionPane;

public class RectangleProc {

	public static void main(String[] args) {
		// This function inputs length and width and prints out Perimeter and Area
		
		//Variables
		double len = 0;
		double wid = 0;
		double area = 0;
		double perim = 0;
		String in = "";
		
		//input length and width
		in = JOptionPane.showInputDialog("Enter Length");
		len = Double.parseDouble(in);
		in = JOptionPane.showInputDialog("Enter Width");
		wid = Double.parseDouble(in);
		
		//function calls
		area = computeArea(len, wid);
		perim = computePerim(len, wid);
		
		//cout statement
		in = "Length: "+len+"\nWidth: "+wid+"\nArea: "+area+"\nPerimeter: "+perim;
		JOptionPane.showMessageDialog(null, in);
	}
	
	static double computeArea(double len, double wid) {
		//This function inputs length and width and outputs area
		return (len * wid);
	}
	
	static double computePerim(double len, double wid) {
		//This function inputs length and width and outputs perimeter
		return  2 * ( len + wid );
	}
	
	

}
