import java.io.*;
import java.util.*;
public class SpreadSheetReader {
	public static void main(String[]args) throws IOException {
		
		String danceCSV = "/Users/montanezn8819/Desktop/DanceDance/winter formal list.csv";
		
		Directory danceList = new Directory();
		
		Scanner files = new Scanner(new File(danceCSV));
		
		
		int t = 0;
		while(files.hasNext()) {	
			String thisLine = new String(files.nextLine());
			if(thisLine.substring(0,1).equals("\"")){
					
					t++;
					Student n = new Student(null,null,0,false);
					n.setName(thisLine.substring(1, thisLine.indexOf(",")),thisLine.substring(thisLine.indexOf(","),thisLine.substring(1).indexOf("\"")));
					System.out.print(t + thisLine.substring(1, thisLine.indexOf(",")) + " ");
					System.out.println(thisLine.substring(thisLine.indexOf(",") + 2,thisLine.substring(1).indexOf("\"") + 1));
					
					
		}
			
	}
	}
	
	
}
