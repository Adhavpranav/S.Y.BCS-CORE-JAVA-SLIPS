/*. Define a class MyNumber having one private int data member. Write a 
default constructor to initialize it to 0 and another constructor to initialize it 
to a value (Use this). Write methods isNegative, isPositive, isZero, isOdd, 
isEven. Create an object in main. Use command line arguments to pass a 
value to the object
*/
public class MyNumber{
    private int data;
    MyNumber(){
        data=0;
    }
    MyNumber(int data){
        this.data=data;
    }
    boolean isNegative(){
       return data<0;
    }
    boolean isPositive(){
        return data>0;
    }
    boolean isZero(){
        return data==0;
    }
    boolean isOdd(){
        return data%2!=0;
    }
    boolean isEven(){
        return data%2==0;
    }
    public static void main(String[] args) {
        int num=Integer.parseInt(args[0]);
        MyNumber obj=new MyNumber(num);
        System.out.println("NUMBER: "+num);
        System.out.println("IS NEGATIVE ?: "+obj.isNegative());
        System.out.println("IS POSITIVE ?: "+obj.isPositive());
        System.out.println("IS ZERO ?: "+obj.isZero());
        System.out.println("IS ODD ?: "+obj.isOdd());
        System.out.println("IS EVEN ?: "+obj.isEven());
    }
}
