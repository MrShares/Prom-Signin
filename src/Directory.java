import java.util.*;
public class Directory {
	
 private ArrayList<Student> myDanceList = new ArrayList();
 
 public Directory() {//giving me a blank directory to work w/
	 
 }
 
 public void addStudent(Student n){ //adds student to the list
 myDanceList.add(n);
 }
 
 public String toString() {
	 for(int i = 0; i < myDanceList.size(); i++) {
		 System.out.println()
	 }
 }
}
