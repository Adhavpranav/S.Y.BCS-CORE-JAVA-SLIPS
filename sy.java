/*
 Write a Java program to create a Package “SY” which has a class SYMarks 
(members – ComputerTotal, MathsTotal, and ElectronicsTotal). Create another 
package TY which has a class TYMarks (members – Theory, Practicals). 
Create n objects of Student class (having rollNumber, name, SYMarks and 
TYMarks). Add the marks of SY and TY computer subjects and calculate the 
Grade (‘A’ for >= 70, ‘B’ for >= 60 ‘C’ for >= 50 , Pass Class for > =40 else 
‘FAIL’) and display the result of the student in proper format.
*/
package SY;

public class SYmarks {
	public int ComputerTotal, MathsTotal,ElectronicsTotal;
	public SYmarks(int ComputerTotal, int MathsTotal,int ElectronicsTotal){
		 this.ComputerTotal=ComputerTotal;
		 this.MathsTotal=MathsTotal;
		 this.ElectronicsTotal=ElectronicsTotal;
	 }
}

package TY;

public class TYMarks {
	public int theory,practical;
	public TYMarks(int theory,int practical){
		this.theory=theory;
		this.practical=practical;
	}
}

package javaprogram;
import TY.*;
import SY.*;
import java.util.*;

public class Studentresult {
    int roll_no;
    String name;
    SYmarks sy;
    TYMarks ty;

    public Studentresult(int roll_no, String name, SYmarks sy, TYMarks ty) {
        this.roll_no = roll_no;
        this.name = name;
        this.sy = sy;
        this.ty = ty;
    }

    int calculate_comp_sub() {
        return sy.ComputerTotal + ty.theory + ty.practical;
    }

    void display() {
        int total = calculate_comp_sub();
        String grade;
        if (total >= 70) grade = "A";
        else if (total >= 60) grade = "B";
        else if (total >= 50) grade = "C";
        else if (total >= 40) grade = "Pass";
        else grade = "Fail";

        System.out.println("\nROLL NO: " + roll_no);
        System.out.println("NAME: " + name);
        System.out.println("TOTAL COMPUTER SUBJECT MARKS: " + total);
        System.out.println("GRADE: " + grade);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A LIMIT:");
        int limit = sc.nextInt();
        Studentresult obj[] = new Studentresult[limit];
        
        System.out.print("ENTER STUDENT DETAILS:");
        for (int i = 0; i < limit; i++) {
            System.out.print("\nENTER STUDENTS ROLL NO:");
            int roll_no = sc.nextInt();
            System.out.print("ENTER STUDENT NAME:");
            String name = sc.next();
            System.out.print("ENTER SY COMPUTERS MARKS:");
            int sycomp = sc.nextInt();
            System.out.print("ENTER SY MATH MARKS:");
            int symath = sc.nextInt();
            System.out.print("ENTER SY ELECTRONICS MARKS:");
            int syele = sc.nextInt();
            SYmarks sy = new SYmarks(sycomp, symath, syele);
            
            System.out.print("Enter TY Theory Marks: ");
            int tyTheory = sc.nextInt();
            System.out.print("Enter TY Practicals Marks: ");
            int tyPracticals = sc.nextInt();
            TYMarks ty = new TYMarks(tyTheory, tyPracticals);
            
            obj[i] = new Studentresult(roll_no, name, sy, ty);
        }
        
        System.out.println("STUDENTS DETAILS:");
        for (int i = 0; i < limit; i++) {
            obj[i].display();
        }
    }
}
