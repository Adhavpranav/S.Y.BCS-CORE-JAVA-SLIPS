// Write a program to find the cube of given number using functional interface.
import java.util.*;
import java.util.function.Function;
public class cube {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Function<Integer, Integer> cubeFunction = (num) -> num * num * num;
    System.out.print("ENTER A NUMBER:");
    int num=sc.nextInt();
    sc.close();
    int cube=cubeFunction.apply(num);
    System.out.println("CUBE IS:"+cube);
 }   
}
