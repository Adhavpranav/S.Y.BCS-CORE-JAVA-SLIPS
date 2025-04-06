//Write a program to accept the array element and display in reverse order
import java.util.*;
public class reverse_order {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER ARRAY LIMIT:");
        int limit=sc.nextInt();
        int arr[]=new int[limit];
        System.out.print("ENTER ARRAY ELEMENTS:");
        for(int i=0;i<limit;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("ARRAY ELEMENTS IN REVERSE ORDER:");
        for(int i=(arr.length-1);i>=0;i--)
        {
            System.out.printf("\t%d",arr[i]);
        }
        sc.close();
    }
}
