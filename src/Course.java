import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Course {
	private String courseName;
	private String courseCode;
	private String description;
	private String duration;
	private String programmeCode;
		
	
	
	//default constructor 
		Course()
		{	
			String courseName = " ";
			String courseCode = " ";
			String description = " ";
			String programmeCode = " ";		
			String duration="";
			
		}
	//primary constructor
		Course(String Name,String Code,String desc,String prgCde,String dur)
		{
			courseName = Name;
			courseCode = Code;
			description = desc;
			programmeCode = prgCde;	
			duration= dur;
		}
	
	
	//copy constructor
		Course(Course courseobj)
		{
			courseName = courseobj.courseName;
			courseCode = courseobj.courseCode;
			description = courseobj.description;
			duration = courseobj.duration;	
			programmeCode=courseobj.programmeCode;
		}
		
		//Accessors and Mutators for Attributes 
		//courseName
		
		public void setCourseName( String courseName)
		{
			this.courseName = courseName;
		}

		public void setprogrammeCode(String programmeCode)
		{
			this.programmeCode = programmeCode;
		}
		
		public String getprogrammeCode()
		{
			return programmeCode;
		}
		
		public String getCourseName()
		{
			return courseName;
		}
		//courseCode
		public void setCourseCode( String courseCode)
		{
			this.courseCode = courseCode;
		}
		
		public String getCourseCode()
		{
			return courseCode;
		}
		
		//description
		public void setDescription( String description)
		{
			this.description = description;
		}
		
		public String getdescription()
		{
			return description;
		}
		
		//duration
		public void setDuration( String duration)
		{
			this.duration = duration;
		}
		
		public String getDuration(){
			return duration;
		}


		public void store(){
            try
         {
			 Scanner in = new Scanner(System.in);


			 System.out.print("Course Code: ");
			 courseCode = in.next();

			 System.out.println();
			 System.out.print("Course Name: ");
			 courseName= in.next();

			 System.out.println();
			 System.out.print("Description: ");
			 description = in.next();

			 System.out.println();
			 System.out.print("Duration: ");
			 duration = in.next();

			 System.out.println();
			 System.out.print("Programme Code: ");
			 programmeCode = in.next();


            FileWriter fileObj = new FileWriter("Course.txt", true);
            fileObj.write(courseCode+ " ");
            fileObj.write(courseName + " ");
            fileObj.write( description+ " ");
            fileObj.write(duration + " ");
            fileObj.write(programmeCode + " ");
            fileObj.write(System.lineSeparator());
            fileObj.close();

         }
            catch (IOException e){
            System.err.println("Error, user information could not be stored");
         }
        }
		public void Cdisplay()
		{
			System.out.println("Course Code: " +courseCode);
			System.out.println("Course Name: " +courseName);
			System.out.println("Course Description: " +description);
			System.out.println("Course Duration:" +duration);
			
		}
		
}


