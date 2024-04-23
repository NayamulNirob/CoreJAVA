/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package showcurrenttimeok;

/**
 *
 * @author Administrator
 */
public class ShowCurrentTimeOk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       long totalMilliseconds = System.currentTimeMillis();
        System.out.println(totalMilliseconds);
       long totalSeconds = totalMilliseconds/1000;
        System.out.println(totalSeconds);
        long currentSecond = totalSeconds %60;
        System.out.println(currentSecond);
        long totalMinutes =totalSeconds/60;
        System.out.println(totalMinutes);
        long currentMinute = totalMinutes%60;
        System.out.println(currentMinute);
        long totalHours = (totalMinutes/60)+6 - 12;
        System.out.println(totalHours);
        long currentHour = totalHours %24;
        System.out.println(currentHour);
        
        System.out.println("Current time is "+currentHour+":"
                +currentMinute +":"+currentSecond+"GMT");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
