import java.io.*;
import java.util.*;
public class SpreadSheetReader {
	/*public static void main(String[]args) throws IOException { //testing method
		SpreadSheetReader();
	}*/
	
	public static void SpreadSheetReader() throws IOException{ //method to read a file and make it into a directory
		
		//location = "/Users/montanezn8819/Desktop/DanceDance/winter formal list.csv"; <-- testing purposes
		
		Scanner typed = new Scanner(System.in);	//prompting user
		System.out.println("Location of file:");//for the location
		String location = typed.nextLine();		//of file
		
		Directory danceList = new Directory();//creating a new directory to hold the students from csv
		
		Scanner files = new Scanner(new File(location)); //creating a new scanner to read in the file
	
		while(files.hasNext()) { //checking to see if ive gotten to the bottom of the csv file
			
			String thisLine = new String(files.nextLine());//making a string the represents the current line
			
			if(thisLine.substring(0,1).equals("\"")){ 	//checking to see if the cvs starts w/ a "
														//if so then I know that it is a line w/ info that needs to be turned into a student object
				
					Student n = new Student(null,null,0,false);//creating a base student object to build off of
					
					//cutting up the current line so i have just the two names to put into my student object
					n.setName(thisLine.substring(1, thisLine.indexOf(",")),thisLine.substring(thisLine.indexOf(",") + 2,thisLine.substring(1).indexOf("\"") + 1));
					
					//stuff below to check locations where i needed to "cut up" the string
					//System.out.print(thisLine.substring(1, thisLine.indexOf(",")) + " ");
					//System.out.println(thisLine.substring(thisLine.indexOf(",") + 2,thisLine.substring(1).indexOf("\"") + 1));
					//String id = new String(thisLine.substring(thisLine.substring(1).indexOf("\"" + 2),thisLine.substring(thisLine.substring(1).indexOf("\"" + 2)).indexOf(",")));
					
					//a new string that chops off the names
					String skipN = new String(thisLine.substring(thisLine.substring(1).indexOf("\"")+ 4));
					
					//using the string that skips the names the finID string only contains the ID
					String finID = new String(skipN.substring(0,skipN.indexOf(",")));
					
					int theID =Integer.parseInt(finID);//changing the string into an int
					
					n.setStudID(theID);//putting that new int into the student object
					
					danceList.addStudent(n);//adding student object to the danceList
					
		}			
	}
		files.close();//closing the file
		
		//System.out.println(danceList); <-- for testing to see if all students made it in
	}
	
	
}
