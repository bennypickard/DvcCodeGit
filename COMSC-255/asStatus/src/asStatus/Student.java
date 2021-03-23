package asStatus;

import javax.swing.JOptionPane;

public class Student implements Status {
	//variables
	private int id;
	private String name;
	private double[] scores;
	private int scoreCount = 0;
	
	
	//constructor
	public Student(int id, String name, double[]scores) {
		//super();//run default Object constructor
		this.id = id;
		this.name = name;
		//this.scoreCount = scoreCount;
		//Copy array
		//JOptionPane.showMessageDialog(null, "Constructor arguments : "  + scores[0] + " " + scores[1] + " " + scores[2] );
		this.scores = scores.clone();
		this.scores[0] = 93; this.scores[1] = 91; this.scores[2] = 100;
	
		
		//JOptionPane.showMessageDialog(null, "Constructor: "  + this.scores[0] + " " + this.scores[1] + " " + this.scores[2] );

	}
	
	//methods
	/*
	public String findGrade(){
		String grade = "";
		double sum = 0;
		
		//loop sum and average
		for (int i = 0; i < scores.length ; i++) {
			sum += scores[i];
		}
		double average = sum / scores.length;
		
		if(average >= 90)
		{
			grade = "A";
		}
		else if(average >= 80)
		{
			grade = "B";
		}
		else if (average >= 70)
		{
			grade = "C";
		}
		else if (average >= 60)
		{
			grade = "D";
		}
		else
		{
			grade = "F";
		}
		
		//return grade letter string
		return grade;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	*/
	//Interface methods
	public String getStatus()
	{
		//JOptionPane.showMessageDialog(null, this.scores[0] + " " + scores[1] + " " + scores[2] );
		String status = "Student\nid="+id+", name="+name+", scores=";
		for(int i = 0; i < this.scores.length  ; i++)
		{
			status += this.scores[i] + " ";
		}
		status += "\n";
		return status;
	}
	
	public void displayStatus()
	{
		String status = getStatus();
		JOptionPane.showMessageDialog(null, status);
	}
	
	
}
