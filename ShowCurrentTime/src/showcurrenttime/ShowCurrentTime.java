
package showcurrenttime;


public class ShowCurrentTime {

    
    public static void main(String[] args) {
        
        long currentTime = System.currentTimeMillis();
        System.out.println(currentTime);
        long seconds = currentTime/1000;
        System.out.println(seconds);
        long minutes = seconds/60;
        System.out.println(minutes);
        long hours = minutes/60;
        System.out.println(hours);
        long days = hours/24;
        System.out.println(days);
        long month = days/30;
        System.out.println(month);       
        long year = month/12;
        System.out.println(year);
    }
    
}
