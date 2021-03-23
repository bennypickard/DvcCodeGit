package asStatus;

import javax.swing.JOptionPane;

public class TestStatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String in, out;
		
		//create array of 6 Status
		Status[] status = new Status[6];
		int statusIndex = 0;
		int scoreCount = 0;
		
		//3 rectangles
		for(int i = 0 ; i < 3 ; i++) {
			in = JOptionPane.showInputDialog("Enter length");
			double length = Double.parseDouble(in);
			in = JOptionPane.showInputDialog("Enter width");
			double width = Double.parseDouble(in);
			
			//create rectangle object and store in array
			status[statusIndex] = new Rectangle(length,width);
			statusIndex++;
				
		}
		//2 siblings
		for( int i = 0; i < 2 ; i ++)
		{
			//input & parse
			String name = JOptionPane.showInputDialog("Enter name");
			in = JOptionPane.showInputDialog("Enter age");
			int age = Integer.parseInt(in);
			in = JOptionPane.showInputDialog("Enter weight");
			int weight = Integer.parseInt(in);
			
			//create sibling object add to array
			status[statusIndex]= new Sibling(name, age, weight);
			statusIndex++;
		}
		
		//1 student
		for(int i = 0; i < 1; i++)
		{
			//get name and id
			in = JOptionPane.showInputDialog("Enter id");
			int id = Integer.parseInt(in);
			String name = JOptionPane.showInputDialog("Enter name");
			
			//score Count
			in = JOptionPane.showInputDialog("Enter number of scores");
			scoreCount = Integer.parseInt(in);
			
			//get scores
			double[] scores = new double[scoreCount];
			for(int j = 0; j < scoreCount; j++)
			{
				in = JOptionPane.showInputDialog("Enter score");
				scores[i] = Integer.parseInt(in);
				//JOptionPane.showMessageDialog(null, scores[i]);

			}
			
			status[statusIndex]= new Student(id, name, scores);
			statusIndex++;	
		}
		
		
		
		//FIRST POLYMORPHIC LOOP
		for(int index = 0; index < status.length ; index++)
		{
			status[index].displayStatus();
		}
		//SECOND POLYMORPHIC LOOP
		out = "";
		for( int index = 0; index < status.length ; index++)
		{
			out = out + status[index].getStatus();
		}
		JOptionPane.showMessageDialog(null, out);
		
				
		
		
		

	}

}
