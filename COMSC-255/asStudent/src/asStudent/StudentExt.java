package asStudent;

public class StudentExt extends Student {
	//new Variables
	private String gradeType;
	
	//constructor
	public StudentExt(int id, String name, double[] scores, String gradeType)
	{
		super(id, name, scores);
		this.gradeType= gradeType;
	}
	//return grade type
	public String getGradeType()
	{
		return this.gradeType;
	}
	
	//overridden gradefind function
	public String findGrade()
	{
		//call parent method to use old functionality
		String grade = super.findGrade();
		
		if(gradeType.equalsIgnoreCase("Credit") )
		{//if its a credit class
			if(grade.equalsIgnoreCase("A") || grade.equalsIgnoreCase("B") || grade.equalsIgnoreCase("C"))
				grade = "CR";//if they passed give credit
			else//they didnt pass
				grade = "NCR";
		}
		//grade is either a letter or CR/NCR
		return grade;
	}
	
	
	
}
