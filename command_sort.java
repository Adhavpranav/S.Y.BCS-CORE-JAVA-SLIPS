/* Write a java program to accept 5 numbers using command line 
arguments sort and display them.
*/
import java.util.Arrays;
public class command_sort {
    public static void main(String[] args) {
        int arr[]=new int[args.length];
        System.out.print("BEFORE SORTING: ");
        for(int i=0;i<args.length;i++)
        {
            arr[i]=Integer.parseInt(args[i]);
            System.out.printf("\t%d",arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("AFTER SORTING: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.printf("\t%d",arr[i]);
        }
    }
}
