import java.util.*;
public class Directory {
	
 private ArrayList<Student> myDanceList = new ArrayList();
 private ArrayList<Student> notHere = new ArrayList();
 private ArrayList<Student> theyRHere = new ArrayList();
 
 public Directory() 
 {//giving me a blank directory to work w/
	 
 }
 
 public void notChecked() 
 {//Class notCheckedStart
 	for(int i =0; i < myDanceList.size(); i++)
 	{//For Loop Start
 		boolean inOut = myDanceList.get(i).getInside();
 		
 		if(inOut = false)
 		{//If Statement Start
 		notHere.add(myDanceList.get(i));
 		}//If Statement End
 	}//For Loop End
 }//Class notChecked End

 
 public void addStudent(Student n)
 { //adds student to the list
 myDanceList.add(n);
 }
 
 public String toString() {
	 String output = new String();
	 for(int i = 0; i < myDanceList.size(); i++) {
		 output = output + myDanceList.get(i) + "\n";
	 }
	 return output;
 }
}
