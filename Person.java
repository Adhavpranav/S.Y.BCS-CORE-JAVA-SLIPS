/*Write program to define class Person with data member as 
Personname,Aadharno, Panno. Accept information for 5 objects 
and display appropriate information (use this keyword).
*/
import java.util.*;
public class person {

    String Personname,Panno;
    long Aadharno;

    person( String Personname,long Aadharno,String Panno){
        this.Personname=Personname;
        this.Aadharno=Aadharno;
        this.Panno=Panno;
    }

    void display(){
        System.out.println("\nPERSON NAME: "+Personname);
        System.out.println("PERSON ADHARNO: "+Aadharno);
        System.out.println("PERSON PANNO: "+Panno);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        person obj[]=new person[5];
        for(int i=0;i<5;i++)
        {
            System.out.print("\nENTER A PERSON NAME:");
            String Personname=sc.next();
            System.out.print("ENTER A PERSON'S ADHARNO:");
            long Aadharno=sc.nextLong();
            System.out.print("ENTER A PERSON PANNO:");
            String Panno=sc.next();

           obj[i]=new person(Personname, Aadharno, Panno);
        }
        System.out.println("PERSON'S DETAILS:");
        for(int i=0;i<5;i++)
        {
            obj[i].display();
        }
        sc.close();
    }
}
