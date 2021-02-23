package asStatistics;

import java.util.Arrays;


public class Statistics {
	//This function has some arrays and does some operations to them
	
	//instance variables
	private double [] data;
	private double [] sdata;
	
	//static variable count
	public static int count = 0;
	
	//constructor
	public Statistics(double [] d)
	{
		//increment static variable count
		count = count + 1;
		
		//clone the array right away
		data = d.clone();
		sdata = d.clone();
		
		//sort sdata array
		Arrays.sort(sdata);
	}
	
	//instance methods
	public double findMin()
	{
		//sdata is from least to greatest. 1st position is minimum
		return sdata[0];
	}
	
	public double findMax()
	{
		//sdata is least to greatest, last index is greatest
		return sdata[sdata.length-1];
	}
	
	public double findMean()
	{
		double sum = 0, mean = 0;
		//Sum all the values
		for( int i = 0; i < sdata.length; i++)
		{
			sum += sdata[i];
		}
		//Divide by length to get mean
		mean = sum / sdata.length;
		
		return mean;
	}
	
	public double findMedian()
	{
		//variables
		int index, indexHi, indexLo;
		double median;
		//find if odd or even
		if(sdata.length % 2 != 0)
		{//if odd, median is the one in the middle
			index = sdata.length / 2;
			median = sdata[index];
		}
		else
		{//take an average of 2 middle numbers
			indexHi = sdata.length / 2; //Rounds up?
			indexLo = indexHi -1;
			median = (sdata[indexLo] + sdata[indexHi]) / 2;
		}
		return median;
	}
	
	public double [] getOrigData()
	{
		//create a new array to return
		double [] d = data.clone();
		return d;
	}
	
	public double [] getSortedData()
	{
		//create new array to return
		double [] d = sdata.clone();
		return d;
	}
	
	
	//static methods
	
	public static double computeMin(double[] data)
	{
		//create new Statistics object
		Statistics st = new Statistics (data);
		//find min
		double min = st.findMin();
		
		//Statistics object is destroyed
		return min;
	}
	public static double computeMax(double[] data)
	{
		//create new Statistics object
		Statistics st = new Statistics (data);
		//find min
		double n = st.findMax();
		
		//Statistics object is destroyed
		return n;
	}
	public static double computeMean(double[] data)
	{
		//create new Statistics object
		Statistics st = new Statistics (data);
		//find min
		double n = st.findMean();
		
		//Statistics object is destroyed
		return n;
	}
	public static double computeMedian(double[] data)
	{
		//create new Statistics object
		Statistics st = new Statistics (data);
		//find min
		double n = st.findMedian();
		
		//Statistics object is destroyed
		return n;
	}
	public static double [] computeSortedData(double[] data)
	{
		//create new Statistics object
		Statistics st = new Statistics (data);
		//find min
		double [] n = st.getSortedData();
		
		//Statistics object is destroyed
		return n;
	}
	
	
	
	
}
