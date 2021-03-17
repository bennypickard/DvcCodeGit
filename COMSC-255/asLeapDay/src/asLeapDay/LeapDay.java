package asLeapDay;

public class LeapDay extends Day{

	//[][][]VARIABLES[][][]
	private int year;
	
	//[][][]CONSTRUCTOR[][][]
	LeapDay(int d, int m, int y)
	{
		super(d, m);
		year = y;
	}
	
	//[]FIND DAY NUM FUNCTION[]
	public int findDayNum()
	{
		int day = getDay();
		int dayNum = super.findDayNum();
		//int dayNum
		
		//[]CHECK LEAPYEAR[]
		//add one if its a leap year and month > 2
		if( ( year % 400 == 0 || ( year % 4 == 0 && year % 100 != 0 ) )  &&  month > 2 )
		{
			dayNum++;
		}
		
		return dayNum;
	}
	
	//[][][]ACCESSOR[][][]
	int getYear()
	{
		return year;
	}
	
}
