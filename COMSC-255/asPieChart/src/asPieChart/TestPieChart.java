package asPieChart;

import javax.swing.JOptionPane;


public class TestPieChart {

	public static void main(String[] args) {
		//Runs the PieChart methods
		
		String in , out;
		int north, south, east, west, midwest;
		
		
		in = JOptionPane.showInputDialog("enter north");
		north = stringToint(in);
		
		in = JOptionPane.showInputDialog("enter south");
		south = stringToint(in);
		
		in = JOptionPane.showInputDialog("enter east");
		east = stringToint(in);
		
		in = JOptionPane.showInputDialog("enter west");
		west = stringToint(in);
		
		in = JOptionPane.showInputDialog("enter midwest");
		midwest = stringToint(in);
		
		

		
		//create object
		PieChart p = new PieChart(north, south, east, west, midwest);
		
		//options
		p.setSize(500,500);
		p.setVisible(true);

	}
	
	
	
	//Integer class broke for some reason. so I couldn't use Integer.parseInt()
    public static int stringToint( String str ){
        int i = 0, number = 0;
        int len = str.length();
        
        

        while( i < len ){
            number *= 10;
            number += ( str.charAt(i++) - '0' );
        }
        return number;
    }  
	

}
