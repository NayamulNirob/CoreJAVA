
package currenttime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;


public class CurrentTime {

    
    public static void main(String[] args) {
//        
        String date = new SimpleDateFormat
        ("ss_mm_HH_dd_MM_YYYY").format(Calendar.getInstance().getTime());
        
        System.out.println(date);
//        
        
        String CurrentDate = new SimpleDateFormat
        ("hh:mm:ss   dd:MM:YYYY").format(Calendar.getInstance().getTime());
        
        System.out.println(CurrentDate);
        
         String CurrentDate1 = new SimpleDateFormat
        ("dd:MM:YYYY").format(Calendar.getInstance().getTime());
        
        System.out.println(CurrentDate1);
        
        Date date1 = new Date(System.currentTimeMillis());
        
        System.out.println(date1);
        
        LocalDate localDate = LocalDate.now();
        
        System.out.println(localDate);
        
        
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        
        
        
        long currentTime = System.currentTimeMillis();
        
        System.out.println(currentTime);
        
        long seconds =currentTime/1000;
        
        System.out.println(seconds);
        
        long currentSecond = seconds%60;
        
        System.out.println(currentSecond);
        
        long minute = seconds/60;
        
        System.out.println(minute);
        
        long currentminuts = minute%60;
        
        System.out.println(currentminuts);
        
        long hour = (minute/60)+6 - 24;
        
        System.out.println(hour);
        
        long currentHour = hour%24;
        
        System.out.println(currentHour);
        
        System.out.println("Current time is: "+currentHour+":"+currentminuts+":"+currentSecond+"GMT"+" /"+CurrentDate1);
         
    }


    
}
