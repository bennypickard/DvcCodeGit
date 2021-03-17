package asLeapDay;

public class Day {

	//[][]VARIABLES[][]
	private int day;
	protected int month;
	
	
	//[]CONSTRUCTOR[]
	public Day(int d, int m)
	{
		day = d;
		month = m;
	}
	
	
	public int findDayNum()
	{
		int dayNum = 0;//Initialize at zero
		switch (month)
		{
		case 1:
			dayNum = day;
			break;
		case 2:
			dayNum = 31 + day;
			break;
		case 3:
			dayNum = 31 + 28 + day;
			break;
		case 4:
			dayNum = 31 + 28 + 31 + day;
			break;
		case 5:
			dayNum = 31 + 28 + 31 + 30 + day;
			break;
		case 6:
			dayNum = 31 + 28 + 31 + 30 + 31 + day;
			break;
		case 7:
			dayNum = 31 + 28 + 31 + 30 + 31 + 30 + day;
			break;
		case 8:
			dayNum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
			break;
		case 9:
			dayNum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 +  day;
			break;
		case 10:
			dayNum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
			break;
		case 11:
			dayNum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31+ day;
			break;
		case 12:
			dayNum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
			break;
		
		}
		
		return dayNum;
	}
	
	
	//[][][]ACCESSORS[][][]
	public int getDay()
	{
		return day;
	}
	public int getMonth()
	{
		return month;
	}
	
	
}
