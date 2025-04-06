/*
Design a Super class Customer (name, phone-number). Derive a 
class Depositor(accno , balance) from Customer. Again, derive a 
class Borrower (loan-no, loan-amt) from Depositor. Write 
necessary member functions to read and display the details of 
‘n’customers.  
*/
import java.util.*;
class Customer{
    Scanner sc=new Scanner(System.in);
    String name;
    long phone_number;
}
class Depositor extends Customer{
    int accno;
    int balance;
}
public class Borrower extends Depositor{
    int loan_no,loan_amt;

    void accept()
    {
        System.out.print("\nENTER CUSTOMER NAME:");
        name=sc.next();
        System.out.print("ENTER CUSTOMER PHONE NUMBER:");
        phone_number=sc.nextLong();
        System.out.print("ENTER DEPOSITOR'S ACCOUNT NUMBER:");
        accno=sc.nextInt();
        System.out.print("ENTER BALANCE:");
        balance=sc.nextInt();
        System.out.print("ENTER LOAN NUMBER:");
        loan_no=sc.nextInt();
        System.out.print("ENTER LOAN AMOUNT:");
        loan_amt=sc.nextInt();
    }
    static void display(Borrower obj[])
    {
        for(int i=0;i<obj.length;i++)
        {
            System.out.println("\nCUSTOMER NAME: "+obj[i].name);
            System.out.println("CUSTOMER PHONE NUMBER: "+obj[i].phone_number);
            System.out.println("DEPOSITOR'S ACCOUNT NUMBER: "+obj[i].accno);
            System.out.println("BALANCE: "+obj[i].balance);
            System.out.println("LOAN NUMBER: "+obj[i].loan_no);
            System.out.println("LOAN AMOUNT: "+obj[i].loan_amt);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A LIMIT:");
        int limit=sc.nextInt();
        Borrower obj[]=new Borrower[limit];
        System.out.println("ENTER DETAILS:");
        for(int i=0;i<limit;i++)
        {
            obj[i]=new Borrower();
            obj[i].accept();
        }
        System.out.println("DETAILS :");
        display(obj);
        sc.close();
    }
}
