/*
Write a program for multilevel inheritance such that Country is inherited from Continent. 
State is inherited from Country. Display the place, State, Country and Continent. 
*/
import java.util.*;
class Continent
{
    String cname;
    Scanner sc=new Scanner(System.in);
    void acceptc()
    {
        System.out.print("ENTER CONTINENT NAME:");
        cname=sc.next();
    }
}

class Country extends Continent
{
    String coname;
    void acceptco()
    {
        System.out.print("ENTER COUNTRY NAME:");
        coname=sc.next();
    }
}

class State extends Country
{
    String sname,pname;
    Scanner sc=new Scanner(System.in);
    void accepts()
    {
        System.out.print("ENTER STATE NAME:");
        sname=sc.next();
        System.out.print("ENTER PLACE NAME:");
        pname=sc.next();
    }
    void display()
    {
        System.out.println("THE CONTINENT NAME:"+cname);
        System.out.println("THE COUNTRY NAME:"+coname);
        System.out.println("THE STATE NAME:"+sname);
        System.out.println("THE PLACE NAME:"+pname);
    }
}

public class multilevel2 {
	public static void main(String[] args) {
		 State ob=new State();
	        ob.acceptc();
	        ob.acceptco();
	        ob.accepts();
	        ob.display();
	}
}
