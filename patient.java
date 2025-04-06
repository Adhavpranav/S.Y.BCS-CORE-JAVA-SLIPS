/* Define a class patient(patient_name, patient_age, patient_oxy_level,patient_HRCT_report).
Create an object of patient. Handle 
appropriate exception while patient oxygen level less than 95% and HRCT scan report 
greater than 10, then throw user defined Exception “Patient is Covid Positive(+) and 
Need to Hospitalized” otherwise display its information
 */
import java.util.*;
class covid extends Exception{
    public String toString(){
        return "PATIENT IS COVID POSITIVE AND NEED TO BE HOSPITALIZED";
    }
}

class patient{
    String patient_name;
    int patient_age;
    float patient_oxy_level,patient_HRCT_report;
    void accept(){
        Scanner sc=new Scanner(System.in);
        try{
        System.out.print("ENTER PATIENT NAME:");
        patient_name=sc.next();
        System.out.print("ENTER PATIENT AGE:");
        patient_age=sc.nextInt();
        System.out.print("ENTER PATIENT OXYGEN LEVEL:");
        patient_oxy_level=sc.nextFloat();
        System.out.print("ENTER HRCT REPORT:");
        patient_HRCT_report=sc.nextFloat();
        if(patient_oxy_level<95 && patient_HRCT_report>10)
            throw new covid();
            else
            display();
        }
        catch(Exception e){
            System.out.println("EXCEPTION OCCURES:"+e);
        }
        finally{
            sc.close();
        }
    }
    void display(){
        System.out.println("PATIENT NAME:"+patient_name);
        System.out.println("PATIENT AGE:"+patient_age);
        System.out.println("PATIENT OXYGEN LEVEL:"+patient_oxy_level);
        System.out.println("PATIENT HRCT REPORT:"+patient_HRCT_report);
    }
}
public class slip7 {
    public static void main(String[] args) {
        patient obj=new patient();
        obj.accept();
    }
}
