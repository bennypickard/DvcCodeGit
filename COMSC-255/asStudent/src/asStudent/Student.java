package asStudent;

public class Student {
	//variables
	private int id;
	private String name;
	private double[] scores;
	
	
	//constructor
	public Student(int id, String name, double[]scores) {
		super();//run default Object constructor
		this.id = id;
		this.name = name;
		//Copy array
		this.scores = scores.clone();
	}
	
	//methods
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
}
