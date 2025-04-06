/*
Define a class CricketPlayer (name,no_of_innings,no_of_times_notout, totatruns, 
bat_avg). Create an array of n player objects .Calculate the batting average for each 
player using static method avg(). Define a static sort method which sorts the array on 
the basis of average. Display the player details in sorted order.
*/
import java.util.*;
class CricketPlayer{
    String name;
    int no_of_innings,no_of_times_not_out,total_runs;
    float bat_avg;
    CricketPlayer(String name,int no_of_innings,int no_of_times_not_out,int total_runs){
        this.name=name;
        this.no_of_innings=no_of_innings;
        this.no_of_times_not_out=no_of_times_not_out;
        this.total_runs=total_runs;
        this.bat_avg=avg(no_of_innings,no_of_times_not_out,total_runs);
    }
    static float avg(int no_of_innings,int no_of_times_not_out,int total_runs){
        return total_runs/(no_of_innings-no_of_times_not_out);
    }
     static void sort_player(CricketPlayer obj[]){
        for(int i=0;i<obj.length;i++){
            for(int j=0;j<obj.length-i-1;j++){
                if(obj[j].bat_avg<obj[j+1].bat_avg){
                    CricketPlayer temp=obj[j];
                    obj[j]=obj[j+1];
                    obj[j+1]=temp;
                }
            }
        }
    }
}
public class cricket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A LIMIT:");
        int limit=sc.nextInt();
        CricketPlayer obj[]=new CricketPlayer[limit];
        for(int i=0;i<obj.length;i++){
            System.out.print("\nENTER PLAYER NAME: ");
            String name=sc.next();
            System.out.print("ENTER NUMBER OF INNINGS: ");
            int no_of_innings=sc.nextInt();
            System.out.print("ENTER NO OF TIME NOT OUT: ");
            int no_of_times_not_out=sc.nextInt();
            System.out.print("ENTER TOTAL RUNS: ");
            int total_runs=sc.nextInt();
            obj[i]=new CricketPlayer(name,no_of_innings,no_of_times_not_out,total_runs);
        }
        CricketPlayer.sort_player(obj);
        System.out.println("CRICKET PLAYERS AFTER SORT:");
        for(int i=0;i<obj.length;i++){
            System.out.println("\nPLAYER NAME: "+obj[i].name);
            System.out.println("NUMBER OF INNINGS: "+obj[i].no_of_innings);
            System.out.println("NUMBER OF TIMES NOT OUT: "+obj[i].no_of_times_not_out);
            System.out.println("TOTAL RUNS: "+obj[i].total_runs);
            System.out.println("BATTING AVERAGE: "+obj[i].bat_avg);
        }
        sc.close();
    }
}
