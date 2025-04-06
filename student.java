/*
  Define Student class(roll_no, name, percentage) to create n objects of 
the Student class. Accept details from the user for each object. Define a 
static method “sortStudent” which sorts the array on the basis of 
percentage.
 */
 import java.util.Scanner;

 public class student {
     int roll_no;
     String name;
     float percentage;
     student(int roll_no,String name,float percentage){
         this.roll_no=roll_no;
         this.name=name;
         this.percentage=percentage;
     }
     static void sort_stud(student obj[]){
         for(int i=0;i<obj.length;i++)
         {
             for(int j=0;j<obj.length-i-1;j++)
             {
                 if(obj[j].percentage<obj[j+1].percentage){
                     student temp=obj[j];
                     obj[j]=obj[j+1];
                     obj[j+1]=temp;
                 }
             }
         }
     }
     static void display(student obj[]){
         for(int i=0;i<obj.length;i++)
         {
             System.out.println("\nSTUDENT ROLL NO: "+obj[i].roll_no);
             System.out.println("STUDENT NAME: "+obj[i].name);
             System.out.println("STUDENT PERCENTAGE: "+obj[i].percentage);
         }
     }
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.print("ENTER A LIMIT:");
         int limit=sc.nextInt();
         student obj[]=new student[limit];
         System.out.println("ENTER STUDENTS DETAILS:");
         for(int i=0;i<limit;i++){
             System.out.print("\nENTER STUDENT ROLL NO: ");
             int roll_no=sc.nextInt();
             System.out.print("ENTER STUDENT NAME: ");
             String name=sc.next();
             System.out.print("ENTER STUDENT PERSENTAGE: ");
             float percentage=sc.nextFloat();
             obj[i]=new student(roll_no, name, percentage);
         }
         sort_stud(obj);
         System.out.println("AFTER SORTING:");
         display(obj);
         sc.close();
     }
 }
 
