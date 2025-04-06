/*
Write a program to accept ‘n’ name of cities from the user and 
sort them in ascending order. 
*/
import java.util.*;
public class cities {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A LIMIT:");
        int limit=sc.nextInt();
        String arr[]=new String[limit];
        for(int i=0;i<limit;i++)
        {
            System.out.print("ENTER CITY NAME:");
            arr[i]=sc.next();
        }
        for(int i=0;i<limit;i++)
        {
            for(int j=0;j<limit-i-1;j++)
            {
                if(arr[j].compareTo(arr[j+1])>0)
                {
                    String temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("CITIES AFTER SORTING:");
        for(int i=0;i<limit;i++)
        {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
