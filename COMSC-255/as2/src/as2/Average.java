package as2;

import javax.swing.JOptionPane;

public class Average {

	public static void main(String[] args) {
		// A function that averages 3 numbers and outputs to user
		
		double n1, n2, n3, sum, avg;
		String in, out;
		
		//First number
		in = JOptionPane.showInputDialog("Enter a number");
		n1 = Double.parseDouble(in);
		
		//Second number
		in = JOptionPane.showInputDialog("Enter a number");
		n2 = Double.parseDouble(in);
		
		//Third number
		in = JOptionPane.showInputDialog("Enter a number");
		n3 = Double.parseDouble(in);
		
		//Calculations
		sum = n1+ n2 + n3;
		avg = sum / 3;
		
		//Output sum and average
		out = "";
		out = out + "The sum of " + n1 + ", " + n2 + " and " + n3 + " is " + sum + "\nThe average of " + n1 + ", " + n2 + " and " + n3 + " is " + avg;
		JOptionPane.showMessageDialog(null, out);
		
	
		System.exit(0);
	}

}
