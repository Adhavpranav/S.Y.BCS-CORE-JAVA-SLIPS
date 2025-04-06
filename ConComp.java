/*
Write a package for String operation which has two classes Con and Comp. Con 
class has to concatenates two strings and comp class compares two strings. Also 
display proper message on execution.
*/
package Conc;
public class compare_string {
	public static String compare(String s1,String s2) {
		int k=s1.compareTo(s2);
		if(k==0) {
			return "BOTH STRING ARE EQUAL";
		}
		else if(k<0)
		{
			return "FIRST STRING IS GREATER";
		}
		else
		{
			return "SECOND STRING IS GREATER";
		}
	}
}

package Conc;

public class Concate_string {
	public static String concatenate(String s1,String s2)
	{
		return s1+s2;
	}
}

package javaprogram;
import Conc.*;
import java.util.*;
public class Main {

public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        System.out.println("Concatenated String: " + Concate_string.concatenate(str1, str2));
        System.out.println("Comparison Result: " + compare_string.compare(str1, str2));
        sc.close();
	}
}
