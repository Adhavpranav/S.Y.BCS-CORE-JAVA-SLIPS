/*
Write a java program to display the system date and time in various formats 
shown below: 
Current date is : 31/08/2021 
Current date is : 08-31-2021 
Current date is : Tuesday August 31 2021 
Current date and time is : Fri August 31 15:25:59 IST 2021 
Current date and time is : 31/08/21 15:25:59 PM +0530 
Current time is : 15:25:59 
Current week of year is : 35 
Current week of month : 5 
Current day of the year is : 243 
Note: Use java.util.Date and java.text.SimpleDateFormat class 
*/

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTimeFormats {
    public static void main(String[] args) {
        Date now = new Date();
        Calendar cal = Calendar.getInstance();

        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat format2 = new SimpleDateFormat("MM-dd-yyyy");
        SimpleDateFormat format3 = new SimpleDateFormat("EEEE MMMM dd yyyy");
        SimpleDateFormat format4 = new SimpleDateFormat("E MMMM dd HH:mm:ss z yyyy");
        SimpleDateFormat format5 = new SimpleDateFormat("dd/MM/yy HH:mm:ss a Z");
        SimpleDateFormat format6 = new SimpleDateFormat("HH:mm:ss");

        System.out.println("Current date is : " + format1.format(now));
        System.out.println("Current date is : " + format2.format(now));
        System.out.println("Current date is : " + format3.format(now));
        System.out.println("Current date and time is : " + format4.format(now));
        System.out.println("Current date and time is : " + format5.format(now));
        System.out.println("Current time is : " + format6.format(now));

        System.out.println("Current week of year is : " + cal.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Current week of month is : " + cal.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Current day of the year is : " + cal.get(Calendar.DAY_OF_YEAR));
    }
}
