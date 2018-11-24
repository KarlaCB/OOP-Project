import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;

public class Student extends Person {
    private int studentId;
    private float score ;
    private char letterGrade ;
    private String remark ;

    private String courseName;
    private String courseCode;
    private String description;
    private String duration;
    private String programmeCode;

   public Student(){
        super();
    }


    public Student(int idNum, String firstName, String lastName, String userName, String password, Date eDate, Address address, ContactNumber contact){
       super(idNum, firstName, lastName, userName, password, eDate, address, contact);
    }

    public void storeCourse(){


        try
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Student Id: ");
            studentId = in.nextInt();

            FileWriter fileObj = new FileWriter("StudentCourse.txt", true);
            fileObj.write(studentId + " ");
            fileObj.write(courseCode + " ");
            fileObj.write(courseName + " ");
            fileObj.write(description + " ");
            fileObj.write(duration + " ");
            fileObj.write(programmeCode + " ");
            fileObj.write(System.lineSeparator()); //Creates New line in file
            fileObj.close();

        }
        catch (IOException e){
            System.err.println("Error, user information could not be stored");
        }
    }

    public void retriveReport(){
       try
       {
           Scanner in = new Scanner(System.in);
           studentId = 0;
           score = 0.0f;
           letterGrade ='U';
           remark = "Well Done";

           System.out.print("Enter Student ID number: ");
           int Id = in.nextInt();

           int sId;
           float sc;
           char letter;
           String rm;

           Scanner fileInp = new Scanner(new File("Report.txt"));
           while(fileInp.hasNext()){
               sId = fileInp.nextInt();
               sc = fileInp.nextFloat();
               letter = fileInp.next().charAt(0);
               rm = fileInp.next();
               if(sId == Id){
                   studentId = sId;
                   score = sc;
                   letterGrade = letter;
                   remark = rm;

                   System.out.println("Student Identification Number: " + studentId );
                   System.out.println("Score: " + score);
                   System.out.println("Letter Grade: " + letterGrade);
                   System.out.println("Remark: " + remark);
                   System.out.println();
               }

           }

           fileInp.close();
           if(studentId == 0){
               System.out.println("Student not found...");
           }

       }
       catch(FileNotFoundException e)
        {
            System.err.println("Error file information could not be retrieved");
            e.printStackTrace();
        }
    }

    public void retriveCourse(){
        try
        {
            courseCode = " ";
            courseName = " ";
            description=" ";
            duration = " ";
            programmeCode = " ";

            System.out.println("Course Information Guide");

            String cc;
            String cn;
            String descript;
            String dur;
            String pc;

            Scanner fileInp = new Scanner(new File("Course.txt"));
            while(fileInp.hasNext()){
               cc = fileInp.next();
               cn = fileInp.next();
               descript = fileInp.next();
               dur = fileInp.next();
               pc = fileInp.next();

               courseCode = cc;
               courseName = cn;
               description = descript;
               duration = dur;
               programmeCode = pc;

               System.out.println("Course Code: " + courseCode );
               System.out.println("Course Name: " + courseName);
               System.out.println("Course Description:  " + description);
               System.out.println("Course Duration: " + duration);
               System.out.println("Course Programme Code: " + programmeCode);
               System.out.println();

               Scanner in = new Scanner(System.in);

               System.out.print("Would you like to select this course [Y/N]: ");
               char ans  = in.next().charAt(0);

               if(ans == 'y' || ans == 'Y'){
                    storeCourse();
               }
            }

            fileInp.close();
        }
        catch(FileNotFoundException e)
        {
            System.err.println("Error file information could not be retrieved");
            e.printStackTrace();
        }

        }



    @Override
    public void selectCourse(){
        retriveCourse();
    }
    @Override
    public void viewReport(){
        retriveReport();
    }

}
