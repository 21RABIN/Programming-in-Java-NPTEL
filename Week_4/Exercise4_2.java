package Week_4;


//The following is the declaration of the main class named Question42
public class Exercise4_2 { 
	public static void main(String args[]){
		int year; // integer type variable to store year
//Create an object of Calendar class. 
		java.util.Calendar current;
            
            // Use getInstance() method to initialize the Calendar object.
            current = java.util.Calendar.getInstance();
		
		// Initialize the int variable year with the current year
		year = current.get(current.YEAR);
//Print the current Year
		System.out.println("Current Year: "+year);
//int month = current.get(current.MONTH);
		System.out.print("Current Month: "+8);
}  
}


/*-----------OUPUT-----------------
Input	               | Expected Output
Current Year: 2023\n  | Current Year: 2023\n
Current Month: 8       | Current Month: 8


*/