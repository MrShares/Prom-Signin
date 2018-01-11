/**
 * Contains All Methods For Student
 * 
 * @author (Jakob Allen) 
 * @version (1/11/18)
 */
public class Student 
{//Student Class Start
	
	private String LName;
	private String FName;
	private int studID;
	private boolean inside = false;
	
public Student(String LName, String FName, int studID, boolean inside) 
{//Student Method Start
this.LName = LName;
this.FName = FName;
this.studID = studID;
this.inside = inside;
}//Student Method End

public String getName()
{//getName Method Start
	String check = FName + " " + LName;
	return check;
}//getName Method End

public void setName(String newLName, String newFName)
{
this.LName = newLName;
this.FName = newFName;
}//setName Method End

public boolean getInside()
{//getInside Method Start
boolean check = this.inside;
return check;
}//getInside Method End
}//Student Class End
