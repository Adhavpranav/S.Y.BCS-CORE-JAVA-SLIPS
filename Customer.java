/*
 Write a program to create a class 
Customer(custno,custname,contactnumber,custaddr). Write a method to search 
the customer name with given contact number and display the details
 */
import java.util.*;
class customer{
    int custno;
    long contactnumber;
    String custname,custaddr;
    customer(int custno,long contactnumber, String custname,String custaddr)
    {
        this.custno=custno;
        this.contactnumber=contactnumber;
        this.custname=custname;
        this.custaddr=custaddr;
    }
    static void search(customer obj[],long key)
    {
        for(int i=0;i<obj.length;i++)
        {
            if(obj[i].contactnumber==key)
            {
                System.out.println("CUSTOMER NUMBER:"+obj[i].custno);
                System.out.println("CUSTOMER NAME:"+obj[i].custname);
                System.out.println("CUSTOMER CONTACT NUMBER:"+obj[i].contactnumber);
                System.out.println("CUSTOMER ADDRESS:"+obj[i].custaddr);
                return;
            }
        }
        System.out.println("NO CONTACT FOUND");
    }
}
public class cust {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int custno;
        long contactnumber;
        String custname,custaddr;
        System.out.print("ENTER A LIMIT:");
        int limit=sc.nextInt();
        customer obj[]=new customer[limit];
        System.out.println("ENTER CUSTOMER DETAILS:");
        for(int i=0;i<limit;i++)
        {
                System.out.print("\nENTER CUSTOMER NO:");
                custno=sc.nextInt();
                System.out.print("ENTER CUSTOMER NAME:");
                custname=sc.next();
                System.out.print("ENTER CUSTOMER CONTACT NUMBER:");
                contactnumber=sc.nextLong();   
                System.out.print("ENTER CUSTOMER ADDRESS:");
                custaddr=sc.next(); 
                obj[i]=new customer(custno, contactnumber, custname, custaddr);
        }
        long key;
        System.out.println("ENTER CUSTOMER CONTACT NUMBER TO FIND ITS DETAILS:");
        key=sc.nextLong();
        customer.search(obj,key);
        sc.close();
    }
}
