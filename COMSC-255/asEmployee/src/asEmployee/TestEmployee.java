package asEmployee;

import javax.swing.JOptionPane;

public class TestEmployee {

	public static void main(String[] args) {
		// This method tests out the employee abtract class and its worker, manager and executive child classes
		
		String in, out;
		String name;
		double salary, pctBonus, bonus, travelExpense;
		int optionCount, nw, nm, ne;
		
		
		//get numbers
		in = JOptionPane.showInputDialog("HOw many worker?");
		nw = Integer.parseInt(in);
		in = JOptionPane.showInputDialog("HOw many manager?");
		nm = Integer.parseInt(in);
		in = JOptionPane.showInputDialog("HOw many executive?");
		ne = Integer.parseInt(in);
		
		
		
		//create array of 6  employee ref
		Employee[] emp = new Employee[nw+nm+ne];
		//create an empIndex to index into array
		int empIndex = 0;
		
		//create 3 worker objects
		for (int i = 0 ; i < nw ; i++){
            name = JOptionPane.showInputDialog ("Enter name");
            in = JOptionPane.showInputDialog ("Enter salary");
            salary = Double.parseDouble(in);
            in = JOptionPane.showInputDialog ("Enter bonus percentage");
            pctBonus = Double.parseDouble(in);
            //create a Worker object and store its reference in emp array
            emp[empIndex]=new Worker(name,salary,pctBonus);
            empIndex++;
		}
		
		//create 2 managers
        for (int i=0; i < nm; i++){

            name = JOptionPane.showInputDialog ("Enter name");
            in = JOptionPane.showInputDialog ("Enter salary");
            salary = Double.parseDouble(in);
            in = JOptionPane.showInputDialog ("Enter bonus percentage");
            pctBonus = Double.parseDouble(in);
            in = JOptionPane.showInputDialog ("Enter travel expense");
            travelExpense = Double.parseDouble(in);
            //create a Worker object and store its reference in emp array
            emp[empIndex] = new Manager(name,salary,pctBonus,travelExpense);
            empIndex++;
        }
		
		//create 1 exec
        
        for (int i=0; i < ne; i++){

            name = JOptionPane.showInputDialog ("Enter name");
            in = JOptionPane.showInputDialog ("Enter salary");
            salary = Double.parseDouble(in);
            in = JOptionPane.showInputDialog ("Enter bonus percentage");
            pctBonus = Double.parseDouble(in);
            in = JOptionPane.showInputDialog ("Enter travel expense");
            travelExpense = Double.parseDouble(in);
            in = JOptionPane.showInputDialog ("Enter option count");
            optionCount = Integer.parseInt(in);           
            //create a Worker object and store its reference in emp array
             emp[empIndex] = new Executive (name,salary,pctBonus,travelExpense,optionCount);
             empIndex++;
        }
		
		//generate output
        String outAll, outW="", outM="", outE="";
        
        for( int i = 0 ; i < emp.length ; i++) {
        	name = emp[i].getName();
        	salary = emp[i].getSalary();
        	
        	//computer bonus is polymorphic
        	bonus = emp[i].computeBonus();
        	
        	//typecasting variables
        	
        	//WORKER
        	if(emp[i] instanceof Worker) {
        		pctBonus = ( (Worker)emp[i] ).getPctBonus();
        		
                outW +=  "Name: " + name + "\n";
                outW +=  "Salary: " + salary + "\n";
                outW +=  "PctBonus: " + pctBonus + "\n"; 
                outW +=  "Bonus: " + bonus + "\n\n"; 
        	}
        	//MANAGER
        	else if(emp[i] instanceof Manager) {
        		pctBonus = ( (Manager)emp[i] ).getPctBonus();
        		travelExpense = ( (Manager)emp[i] ).getTravelExpense();
        		
                outM +=  "Name: " + name + "\n";
                outM +=  "Salary: " + salary + "\n";
                outM +=  "PctBonus: " + pctBonus + "\n"; 
                outM +=  "Bonus: " + bonus + "\n"; 
                outM +=  "Travel Expense: " + bonus + "\n\n"; 
        	}
        	//EXECUtVE
        	else if(emp[i] instanceof Executive)
        	{
        		pctBonus = ( (Executive)emp[i] ).getPctBonus();
        		travelExpense = ( (Executive)emp[i] ).getTravelExpense();
        		optionCount = ( (Executive)emp[i] ).getOptionCount();
        		
                outE = outE + "Name: " + name + "\n";
                outE +=  "Salary: " + salary + "\n";
                outE +=  "PctBonus: " + pctBonus + "\n"; 
                outE +=  "Bonus: " + bonus + "\n"; 
                outE +=  "Travel Expense: " + bonus + "\n"; 
                outE +=  "Option Count: " + optionCount + "\n\n";
        	}
        }
		
        outAll = outW + outM + outE;
        JOptionPane.showMessageDialog(null, outAll);
		
		
	}

}
