/*
Write a program to create parent class College(cno, cname, 
caddr) and derived class Department(dno, dname) from College. 
Write a necessary methods to display College details. 
*/
import java.util.*;
class College{
    int cno;
    String cname,address;
    Scanner sc=new Scanner(System.in);
}
class Department extends College{
    int dno;
    String dname;
    void accept()
    {
        System.out.print("\nENTER COLLEGE NUMBER:");
        cno=sc.nextInt();
        System.out.print("ENTER COLLEGE NAME:");
        cname=sc.next();
        System.out.print("ENTER COLLEGE ADDRESS:");
        address=sc.next();
        System.out.print("ENTER DEPARTMENT NUMBER:");
        dno=sc.nextInt();
        System.out.print("ENTER DEPARTMENT NAME:");
        dname=sc.next();
    }
    void display()
    {
        System.out.println("\nCOLLEGE NUMBER: "+cno);
        System.out.println("COLLEGE NAME: "+cname);
        System.out.println("COLLEGE ADDRESS: "+address);
        System.out.println("DEPARTMENT NUMBER: "+dno);
        System.out.println("DEPARTMENT NAME: "+dname);
    }
}
public class College_department {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A LIMIT:");
        int limit=sc.nextInt();
        Department obj[]=new Department[limit];
        System.out.println("ENTER DETAILS:");
        for(int i=0;i<limit;i++)
        {
            obj[i]=new Department();
            obj[i].accept();
        }
        System.out.println("ALL DETAILS:");
        for(int i=0;i<limit;i++)
        {
            obj[i].display();
        }
        sc.close();
    }
}
