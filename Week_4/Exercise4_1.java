package Week_4;
//Import of pre-defined package java.util and class Scanner
import java.util.Scanner;
//Import of pre-defined package java.lang and class System and all of its member
import static java.lang.System.*;
//main class Question is created
public class Exercise4_1{
public static void main(String[] args) {
	// Scanner object is created
 Scanner scanner = new Scanner(System.in);
  // Read String input using scanner class
 String courseName = scanner.nextLine(); 
  // Print the scanned String
 out.println("Course: " + courseName); 
}
}



/*--------------OUTPUT--------------------
Input      | Expected Output
NPTEL JAVA |  Course: NPTEL JAVA

*/