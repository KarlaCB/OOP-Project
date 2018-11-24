import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Report {
	private int studentId ;
	private float score ;
	private char letterGrade ;
	private String remark ;
	
	@SuppressWarnings("null")
	public Report () {
		studentId=0;
		score=0.0f;
		letterGrade= 'U';
		remark=" ";
	}
	public Report (int stud,float sco,char letg,String rmk) {
		studentId=stud;
		score=sco;
		letterGrade=letg;
		remark=rmk;
	}

	public Report (Report R1) {
		studentId=R1.studentId;
		score=R1.score;
		letterGrade=R1.letterGrade;
		remark=R1.remark;
	}
	public  int getStudentId() {
		
		return studentId;
	}
    public  void setStudentId(int studId) {
		
		studentId=studId;
	}
	public  float getScore() {
		
		return score;
	}
    public  void setScore(float Sc) {
		
		score=Sc;
	}
	public  char getLetterGrade() {
		
		return letterGrade;
	}
    public  void setLetterGrade(char lettrG) {
		
		letterGrade=lettrG;
	}
	public  String getRemark() {
		
		return remark;
	}
    public  void setRemark(String Remrk) {
		
		remark=Remrk;
	}
    public void display() {
    	System.out.println("Student Id: "+studentId+" Score: "+score+" Letter Grade: "+letterGrade+" Remark: "+remark);
    	
    }
    public void viewReport() {
    	//System.out.println("Student Id: "+studentId+" Score: "+score+"Letter Grade: "+letterGrade+"Remark: "+remark);
    	
    }

    public void store(){
       try
       {
           Scanner in = new Scanner(System.in);


           System.out.print("Student Id: ");
           studentId = in.nextInt();

           System.out.println();
           System.out.print("Score: ");
           score = in.nextFloat();

           System.out.println();
           System.out.print("Letter Grade: ");
           letterGrade = in.next().charAt(0);

           System.out.println();
           System.out.print("Remark: ");
           remark = in.next();


           FileWriter fileObj = new FileWriter("Report.txt", true);
           fileObj.write(studentId + " ");
           fileObj.write(score + " ");
           fileObj.write(letterGrade + " ");
           fileObj.write(remark + " ");
           fileObj.write(System.lineSeparator());
           fileObj.close();

       }
       catch (IOException e){
           System.err.println("Error, user information could not be stored");
       }
    }

}
