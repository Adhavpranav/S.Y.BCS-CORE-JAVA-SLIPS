/*
Write a Program to print all Prime numbers in an array of ‘n’ 
elements. (use command line arguments). 
*/
public class prime_num{
    public static void main(String[] args) {
        System.out.print("PRIME NUMBERS:");
        for(int i=0;i<args.length;i++)
        {
            int num=Integer.parseInt(args[i]);
            int j;
            for(j=2;j<num;j++)
            {
                if(num%j==0)
                {
                   break;
                }
            }
            if(j==num)
            System.out.printf("\t%d",num);
        }
    }
}
