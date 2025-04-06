/*
Write a program to accept the two dimensional array from user and 
display sum of its diagonal elements.
 */
import java.util.*;
public class Diagonal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int limit;
        System.out.print("ENTER NO OF COL AND ROW FOR SQUARE MATRIX:");
        limit=sc.nextInt();
        System.out.println("ENTER THE SQUARE MATRIX:");
        int arr[][]=new int[limit][limit];
        for(int i=0;i<limit;i++)
        {
            for(int j=0;j<limit;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<limit;i++)
        {
           sum=sum+arr[i][i];
        }
        System.out.println("SUM OF DIAGONAL ELEMENTS: "+sum);
        sc.close();
    }
}
