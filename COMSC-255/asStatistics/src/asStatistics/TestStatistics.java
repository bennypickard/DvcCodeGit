package asStatistics;

import java.text.DecimalFormat;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;


public class TestStatistics {
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// This method tests the Statistics class and calls each of its functions on an array

		//[][]Variables
		String in, out, delim, token;
		int itemCount = 0;
		double min = 0, max = 0, mean = 0, median = 0;
		int placesCount;
		
		/*
		[][][]OLD INPUT CODE[][][]
		//input item count
		in = JOptionPane.showInputDialog("Enter the Number Of Data Values: ");
		itemCount = Integer.parseInt(in);//turn to int
		
		//new array
		double [] data = new double [itemCount];
		
		//input data into array
		for(int i = 0 ; i < itemCount ; i ++)
		{
			in = JOptionPane.showInputDialog("Enter Data Value");
			data[i] = Double.parseDouble(in);//turn to double
		}
		
		*/
		
		
		//[][][]TOKENIZER CODE[][][]
		delim = ",";
		
		//INPUT STRING
		in = JOptionPane.showInputDialog("Enter data values separated by commas");
		
		
		//create new Tokenizer object
		StringTokenizer st = new StringTokenizer(in, delim);//instantly tokenizes the string into an array
		
		//Get array length.
		itemCount = st.countTokens();
		
		//Create data array with itemCount length
		double [] data = new double [itemCount];
		
		//This for loop converts the Tokens in st into a usable data array
		for(int i = 0 ; i < itemCount ; i ++)
		{
			token = st.nextToken();//fetch a string from the array
			//TRIM the token
			token = token.trim();
			
			//add String to data array.
			data[i] = Double.parseDouble(token);
		}
		
		
		
		
		
		//[][][]STATISTICS CLASS CODE[][][]
		//create Statistics object to handle array
		Statistics stat = new Statistics(data);
		
		//find min, max, median, with methods
		min = stat.findMin();
		max = stat.findMax();
		mean = stat.findMean();
		median = stat.findMedian();
		
		//retrieve data back from function
		double [] origData = stat.getOrigData();
		double [] sortData = stat.getSortedData();
		
		//[][][]DECIMAL PLACE CODE
		//input how many decimal places we want.
		in = JOptionPane.showInputDialog("Enter number of decimal places for output");
		placesCount = Integer.parseInt(in);
		
		String pattern = "0.";
		for ( int i = 0 ; i < placesCount ; i ++)
		{//append zeros till satisfied
			pattern = pattern + "0";
		}
		
		//create DecimalFormat object and give it the pattern
		DecimalFormat df = new DecimalFormat();
		df.applyPattern(pattern);
		
		
		

		//[][]START OUTPUT STATEMENT
		
		//Build output statement
        out = "Original Data: \n";
        for (int i = 0 ; i < origData.length ; i ++)
        {//loop thru original data list.
        	out = out + origData [i] + " ";
        }
        out += "\n\nResults Using Instance Methods\n\n";//newline

        //Add sorted data to output
        out = out + "Sorted Data: \n";
        for (int i = 0 ; i < sortData.length ; i ++)
        {//loop thru sorted data list.
        	out = out + sortData [i] + " ";
        }
        out += "\n\nComputed Values:\n";
        
        //value output
        out += "Min Value: " + df.format(min) + "\n";
        out += "Max Value: " + df.format(max) + "\n";
        out += "Mean: " + df.format(mean) + "\n";
        out += "Median: " + df.format(median) + "\n";

        //[][]STATIC RESULTS
        double min2 = Statistics.computeMin(data);
        double max2 = Statistics.computeMax(data);
        double mean2 = Statistics.computeMean(data);
        double median2 = Statistics.computeMedian(data);
        double [] sortData2 = Statistics.computeSortedData(data);
        

        
        out += "\nResults Using Static Methods:";
        		
        //Add sorted data to output
        out +=  "\n\nSorted Data: \n";
        for (int i = 0 ; i < sortData2.length ; i ++)
        {//loop thru sorted data list.
        	out = out + sortData2 [i] + " ";
        }
        
        out += "\n\nComputed Values:\n";
        out += "Min: " + df.format(min2) + "\n";
        out += "Max: " + df.format(max2) + "\n";
        out += "Mean: " + df.format(mean2) + "\n";
        out += "Median: " + df.format(median2) + "\n";
        
        //get value of static variable count
        int instanceCount = Statistics.count;
        
        out += "\nThe Total Number of Statistics objects created during execution:\n";
        out += instanceCount + "\n";
        
        
		//Deliver output
        JOptionPane.showMessageDialog ( null, out);
        
		
		
	}

}
