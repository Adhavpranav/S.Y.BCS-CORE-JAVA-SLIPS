/*
Write a menu driven program to perform the following operations on 
multidimensional array ie matrices : 
1:Addition 
2:Multiplication 
3:Exit
*/

import java.util.Scanner;

public class Menu_driven {
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A LIMIT FOR SQUARE MATRIX:");
        int limit=sc.nextInt();
        int choice;
        int mat1[][],mat2[][],result[][];
        result=new int[limit][limit];
        mat1=new int[limit][limit];
        mat2=new int [limit][limit];
        System.out.println("ENTER ELEMENTS OF FIRST MATRIX:");
        for(int i=0;i<limit;i++){
            for(int j=0;j<limit;j++){
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("ENTER ELEMENTS OF SECOND MATRIX:");
        for(int i=0;i<limit;i++){
            for(int j=0;j<limit;j++){
                mat2[i][j]=sc.nextInt();
            }
        }
        do{
            System.out.println();
            System.out.println("1:ADDITION:");
            System.out.println("2:MULTIPLICATION:");
            System.out.println("3:EXIT:");
            System.out.print("ENTER A CHOICE:");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                for(int i=0;i<limit;i++){
                    for(int j=0;j<limit;j++){
                        result[i][j]=mat1[i][j]+mat2[i][j];
                    }
                }
                System.out.println("ADDITION OF MATRIX:");
                print_matrix(result, limit);
                    break;
                case 2:
                for(int i=0;i<limit;i++){
                    for(int j=0;j<limit;j++){
                        result[i][j] = 0;
                        for (int k = 0; k < limit; k++) {
                            result[i][j] += mat1[i][k] * mat2[k][j];
                        }
                    }
                }
                System.out.println("MULTIPLICATION OF MATRIX:");
                print_matrix(result, limit);
                    break;
                case 3:System.out.println("EXITING");
                        sc.close();
                        return;
                default:System.out.println("INVALID CHOICE:");
                    break;
            }
        }while(true);
    }
    static void print_matrix(int result[][],int limit){
        for(int i=0;i<limit;i++){
            for(int j=0;j<limit;j++){
                System.out.printf("%d\t",result[i][j]);
            }
            System.out.print("\n");
        }
    }

}
