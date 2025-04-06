/*
Define an abstract class Staff with protected members id and name. Define a 
parameterized constructor. Define one subclass OfficeStaff with member department. 
Create n objects of OfficeStaff and display all details.
*/
import java.util.Scanner;

abstract class staff{
    protected int id;
    protected String name;
    staff(int id,String name){
        this.id=id;
        this.name=name;
    }
}
class  officeStaff extends staff{
    String department;
    officeStaff(int id,String name,String department){
        super(id,name);
        this.department=department;
    }
    static void display(officeStaff obj[])
    {
        System.out.print("DETAILS OF OFFICE STAFF:\n");
        for(int i=0;i<obj.length;i++)
        {
            System.out.println("STAFF ID:"+obj[i].id);
            System.out.println("STAFF NAME:"+obj[i].name);
            System.out.println("STAFF DEPARTMENT:"+obj[i].department);
        }
    }
}
public class office {
    public static void main(String[] args) {
        int id;
        String name,department;
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A LIMIT:");
        int limit=sc.nextInt();
        officeStaff obj[]=new officeStaff[limit];
        for(int i=0;i<limit;i++)
        {
            System.out.print("ENTER STAFF ID:");
            id=sc.nextInt();
            System.out.print("ENTER STAFF NAME:");
            name=sc.next();
            System.out.print("ENTER STAFF DEPARTMENT:");
            department=sc.next();
            obj[i]=new officeStaff(id,name,department);
        }
        officeStaff.display(obj);
        sc.close();
    }
}
