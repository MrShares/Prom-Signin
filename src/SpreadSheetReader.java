import java.io.*;
import java.util.*;
public class SpreadSheetReader {
	public static void main(String[]args) throws IOException {
		
		String danceCSV = "/Users/montanezn8819/Desktop/DanceDance/winter formal list.csv";
		
		Directory danceList = new Directory();
		
		Scanner files = new Scanner(new File(danceCSV));
		while(files.hasNext()) {
		System.out.println(files.nextLine());
		}
	}
	
	
}
