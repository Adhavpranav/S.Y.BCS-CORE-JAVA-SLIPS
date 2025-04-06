// Write a program to find the square of given number using functional interface. 
import java.util.*;
import java.util.function.Function;
public class square {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Function<Integer,Integer> square=(num)->num*num;    
    System.out.print("ENTER A NUMBER:");
    int num=sc.nextInt();
    sc.close();
    System.out.println("SQUARE OF NUM IS:"+square.apply(num));
 }   
}
