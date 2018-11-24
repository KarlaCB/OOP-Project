import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;

public class StudentLogin {
    private int idNum;
    private String username;
    private String password;

    public StudentLogin() {
        idNum = 0;
        username = " ";
        password = " ";
    }

    public StudentLogin(int idNum, String username, String password) {
        this.idNum = idNum;
        this.username = username;
        this.password = password;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void storeStudentLogin(){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Student Id Number: ");
        idNum = in.nextInt();

        System.out.println();
        System.out.print("Enter Student Username: ");
        username = in.next();

        System.out.println();
        System.out.print(" Enter Student Password: ");
        password = in.next();
        try
        {
            FileWriter fileObj = new FileWriter("Student.txt", true);
            fileObj.write(idNum + " ");
            fileObj.write(username + " ");
            fileObj.write(password + " ");
            fileObj.write(System.lineSeparator());
            fileObj.close();

        }
        catch (IOException e){
            System.err.println("Error, user information could not be stored");
        }
    }
}
