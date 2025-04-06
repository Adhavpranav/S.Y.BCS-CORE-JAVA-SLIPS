/*
Write a program to display the Employee(Empid, Empname, Empdesignation, 
Empsal) information using toString().
*/
import java.util.*;
class Employee{
    String Empname,Empdesignation;
    int Empid;
    float Empsal;
    Scanner sc=new Scanner(System.in);
    void accept(){
        System.out.print("ENTER EMPLOYEE ID:");
        Empid=sc.nextInt();
        System.out.print("ENTER EMPLOYEE NAME:");
        Empname=sc.next();
        System.out.print("ENTER EMPLOYEE DESIGNATION:");
        Empdesignation=sc.next();
        System.out.print("ENTER EMPLOYEE SALARY:");
        Empsal=sc.nextFloat();
    }
    public String toString(){
        return "EMP ID: "+Empid+"\nEMP NAME: "+Empname+"\nEMP DESIGNATION: "+Empdesignation+"\nEMP SALARY: "+Empsal;
    }
}
public class slip10 {
    public static void main(String[] args) {
        Employee obj=new Employee();
        obj.accept();
        System.out.println(obj);
    }   
}
