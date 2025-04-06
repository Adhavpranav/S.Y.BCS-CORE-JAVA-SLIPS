/*
Create a class Sphere, to calculate the volume and surface area of 
sphere. (Hint : Surface area=4*3.14(r*r), Volume=(4/3)3.14(r*r*r)) 
*/
import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER RADIUS OF SPHERE:");
        float radius=sc.nextFloat();
        System.out.println("SURFACE AREA OF A SPHERE: "+(4*3.14*(radius*radius)));
        System.out.println("VOLUME OF A SPHERE: "+((4.0/3)*Math.PI*(radius*radius*radius)));
        sc.close();
    }
}
