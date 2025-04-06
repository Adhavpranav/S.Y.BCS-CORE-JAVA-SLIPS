/*
 Write a program to calculate perimeter and area of rectangle. 
(hint : area = length * breadth , perimeter=2*(length+breadth))
*/
import java.util.Scanner;
public class rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER LENGTH OF RECTANGLE:");
        float length=sc.nextFloat();
        System.out.print("ENTER BREADTH OF RECTANGLE:");
        float breadth=sc.nextFloat();
        System.out.println("AREA OF RECTANGLE IS: "+(length*breadth));
        System.out.println("PERIMETER OF RECTANGLE IS "+(2*(length+breadth)));
        sc.close();
    }
}
