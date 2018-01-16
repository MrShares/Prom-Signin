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
{//setName Method Start

this.LName = newLName;
this.FName = newFName;

}//setName Method End

public boolean getInside()
{//getInside Method Start

boolean check = this.inside;
return check;

}//getInside Method End

public void setInside(boolean set)
{//setInside Method Start
	this.inside = set;
}//setInside Method End

public int getStudID()
{//getStudID Method Start
int check = this.studID;
return check;
}//getStudID Method End 

public void setStudID(int set)
{
	this.studID = set;
}

public String toString(){
	String output = new String();
	output = LName + " " + FName + " " + studID + " " + inside;
	return output;
}
<<<<<<< HEAD

=======
>>>>>>> 1/16/18-2
}//Student Class End

