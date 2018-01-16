import java.io.*;
import java.util.*;
public class SpreadSheetReader {
	public void String(String location) throws IOException{
		
		//location = "/Users/montanezn8819/Desktop/DanceDance/winter formal list.csv";
		
		Scanner typed = new Scanner(System.in);
		
		System.out.println("Location of file:");
		
		location = typed.nextLine();
		
		Directory danceList = new Directory();
		
		Scanner files = new Scanner(new File(location));
		
		while(files.hasNext()) {	
			String thisLine = new String(files.nextLine());
			if(thisLine.substring(0,1).equals("\"")){
					Student n = new Student(null,null,0,false);
					n.setName(thisLine.substring(1, thisLine.indexOf(",")),thisLine.substring(thisLine.indexOf(",") + 2,thisLine.substring(1).indexOf("\"") + 1));
					//System.out.print(thisLine.substring(1, thisLine.indexOf(",")) + " ");
					//System.out.println(thisLine.substring(thisLine.indexOf(",") + 2,thisLine.substring(1).indexOf("\"") + 1));
					//String id = new String(thisLine.substring(thisLine.substring(1).indexOf("\"" + 2),thisLine.substring(thisLine.substring(1).indexOf("\"" + 2)).indexOf(",")));
					String skipN = new String(thisLine.substring(thisLine.substring(1).indexOf("\"")+ 4));
					String finID = new String(skipN.substring(0,skipN.indexOf(",")));
					int theID =Integer.parseInt(finID);
					n.setStudID(theID);
					danceList.addStudent(n);
					
		}			
	}
		System.out.println(danceList);
	}
	
	
}
