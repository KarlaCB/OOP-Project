

import java.util.Scanner;

public class Programme {
	protected String programmeCode;
	protected String programmeName;
	protected int maxNumCourses;
	protected String award;
	protected String accreditation;
	
	//default constructor 
	
	Programme()
	{
		String programmeCode = " ";
		String programmeName = "";
		int maxNumCourses = 0;
		String award = " ";
		String accreditation = " ";			
	}
	//primary constructor
	Programme(String pCode, String pName, int mNCourses,String award,String acc)
	{
		programmeCode = pCode;
		programmeName = pName;
		maxNumCourses =mNCourses;
		this.award = award;
		accreditation = acc;
	}
	
	// copy constructor
	Programme(Programme programmeObj)
	{
		programmeCode = programmeObj.programmeCode;
		programmeName = programmeObj.programmeName;
		maxNumCourses = programmeObj.maxNumCourses;
		award = programmeObj.award;
		accreditation = programmeObj.accreditation;

	}
	
	//Accessors and Mutators for Attributes 
	//ProgrammeCode
	public void setProgrammeCode(String programmeCode)
	{
		//System.out.println("Enter Your Programme Code");
		//Scanner.in
		this.programmeCode=programmeCode;
	}
	
	public String getProgrammeCode()
	{
		return programmeCode;
	}
	
	//Accessors and Mutators for Attributes 
	//ProgrammeName
	
	public void setProgrammeName(String programmeName)
	{
		this.programmeName=programmeName;
	}
	
	public String getProgrammeName()
	{
		return programmeName;
	}
	
	//Accessors and Mutators for Attributes 
		//Max Number of Courses
		
		public void setMaxNumCourses(int maxNumCourses)
		{
			this.maxNumCourses=maxNumCourses;
		}
		
		public int getmaxNumCourses()
		{
			return maxNumCourses;
		}
		
	
	//Accessors and Mutators for Attributes 
		//Award
		
		public void setAward(String award)
		{
			this.award=award;
		}
		
		public String getAward()
		{
			return award;
		}
		
		
	//Accessors and Mutators for Attributes 
		//Accreditation
		
		public void setAccreditation(String accreditation)
		{
			this.accreditation=accreditation;
		}
		
		public String getAccreditation()
		{
			return accreditation;
		}
		
		
		public void display()
		{
			System.out.println("Programme Course : " +programmeCode);
			System.out.println("Programme Name : " +programmeName);
			System.out.println("Maximum Number of Courses: " +maxNumCourses);
			System.out.println("Award Given" +award);
			System.out.println("Accredited By: " +accreditation);
		
			
		}
		
		

		
	
	
	
	

}
