/*
Write a Program to print all even numbers in an array of ‘n’ 
elements. (use command line arguments). 
*/
public class even_elements {
    public static void main(String[] args) {
        System.out.print("EVEN NUMBERS:");
        for(int i=0;i<args.length;i++)
        {
            int num=Integer.parseInt(args[i]);
            if(num%2==0)
            System.out.printf("\t%d",num);
        }
    }
}
