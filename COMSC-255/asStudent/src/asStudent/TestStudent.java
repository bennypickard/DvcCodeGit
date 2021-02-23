package asStudent;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class TestStudent {

	public static void main(String[] args) {
		//this class tests the student class
		//variables
		String in;
		int nStudents, nExams;
		
		in = JOptionPane.showInputDialog("Enter number of students");
		nStudents = Integer.parseInt(in);
		
		//create new array of nstudents references
		Student[] st = new Student[nStudents];
		
		//create each student in loop
		for (int i = 0 ; i < st.length ; i++)
		{
			//get ones students data
			in = JOptionPane.showInputDialog("Enter one student data with items separated by commas");
			
			//Tokenize
			String delim = ",";
			String token;
			
			//create a tokenizer and supply it with in and delim;
			StringTokenizer stk = new StringTokenizer(in,delim);
			
			token = stk.nextToken().trim();
			int id = Integer.parseInt(token);
			
			String name = stk.nextToken().trim();
			
			token = stk.nextToken().trim();
			nExams = Integer.parseInt(token);
			
			//create the array scores
			double[] scores = new double[nExams];
			//populate array scores.
			for(int j = 0 ; j < nExams ; j++)
			{//fill the scores array with each score
				token = stk.nextToken().trim();
				scores[j] = Double.parseDouble(token);
			}
			
			//Create new Student object
			st[i] = new Student (id,name,scores);
			
		}
		
		//Find student grades and display output
		//create and empty output String for each type of grade
		String outA="",outB="",outC="",outD="",outF="";
		
		//find student grades and accumulate output for each type of student
		String grade = "";
		for(int i = 0; i < st.length; i ++) {
			grade = st[i].findGrade();
			if(grade.equalsIgnoreCase("A")) {
				//put A student into output.
				outA += st[i].getId()+" "+st[i].getName()+" ("+grade+")\n";
			}
			else if(grade.equalsIgnoreCase("B")) {
				outB += st[i].getId()+" "+st[i].getName()+" ("+grade+")\n";
			}
			else if(grade.equalsIgnoreCase("C")) {
				outC += st[i].getId()+" "+st[i].getName()+" ("+grade+")\n";
			}
			else if(grade.equalsIgnoreCase("D")) {
				outD += st[i].getId()+" "+st[i].getName()+" ("+grade+")\n";
			}
			else {
				outF += st[i].getId()+" "+st[i].getName()+" ("+grade+")\n";
			}
		}
		
		String outAll = outA+outB+outC+outD+outF;
		//display output
		JOptionPane.showMessageDialog(null, outAll);
	}

}
