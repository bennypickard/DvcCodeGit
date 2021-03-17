package asLeapDay;

import javax.swing.JOptionPane;

public class TestDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//[][][]VARIABLES[][][]
		String in, out;
		int day, month, year, dayNumber;
		
		
		//[][][]INPUT[][][]
		in = JOptionPane.showInputDialog("Enter day");
		day = Integer.parseInt(in);
		in = JOptionPane.showInputDialog("Enter month");
		month = Integer.parseInt(in);
		in = JOptionPane.showInputDialog("Enter year");
		year = Integer.parseInt(in);
		
		//[]CREATE OBJECT[]
		Day epoch = new LeapDay(day, month, year);
		
		//[]GET DAYNUMBER[]
		dayNumber = epoch.findDayNum();
		
		//[][][]OUTPUT[][][]
		out = "Day Number for " + month + "/" + day + "/" + year + " is " + dayNumber;
		JOptionPane.showMessageDialog(null, out);
		
		
	}

}
