/*
 Write a menu driven program to perform the following operations 
a. Calculate the volume of cylinder. (hint : Volume: π × r² × h) 
b. Find the factorial of given number. 
c. Check the number is Armstrong or not. 
d. Exit 
*/

import java.util.Scanner;

public class Slip18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1:VOLUME OF CYLINDER");
            System.out.println("2:FACTORIAL");
            System.out.println("3:ARMSTRONG");
            System.out.println("4:EXIT");
            System.out.print("ENTER YOUR CHOICE:");
            int choice=sc.nextInt();
            switch(choice){
                case 1: 
                    System.out.print("ENTER RADIUS OF CYLINDER:");
                    float radius=sc.nextFloat();
                    System.out.print("ENTER HEIGHT OF CYLINDER:");
                    float height=sc.nextFloat(); 
                    System.out.println("VOLUME OF CYLINDER IS: "+(Math.PI*radius*radius*height));
                    break;
                case 2:
                    System.out.print("ENTER A NUMBER:");
                    int num=sc.nextInt();
                    int fact=1;
                    for(int i=1;i<=num;i++){
                        fact=fact*i;
                    }
                    System.out.println("FACTORIAL OF A NUMBER IS: "+fact);
                    break;
                case 3:
                    System.out.print("ENTER A NUMBER:");
                    num=sc.nextInt();
                    int digit=0,temp=num,sum=0;
                    while(temp!=0){
                        temp=temp/10;
                        digit++;
                    }
                    temp=num;
                    while(temp!=0){
                        int rem=temp%10;
                        sum=sum+((int)Math.pow(rem,digit));
                        temp=temp/10;
                    }
                    if(sum==num){
                        System.out.println("GIVEN NUMBER IS ARMGSTRONG");
                    }
                    else
                    System.out.println("GIVEN NUMBER IS NOT ARMGSTRONG");
                    break;
                case 4:
                    sc.close();
                    return;
                default:System.out.println("INVALID CHOICE");
            }
        }
    }
}
