package swichcasemonthofdaycheck;

import java.util.Scanner;

public class SwichCaseMonthOfDayCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name of the month to check how many days in it");

        String mon = input.nextLine().toUpperCase();
       

        switch (mon) {
            case "JAN":
            case "MAR":
            case "MAY":
            case "JUL":
            case "AUG":
            case "OCT":
            case "DEC":
                System.out.println("This "+mon+ " month is 30 days");
                break;
                
            case "APR":
            case "JUN":
            case "SEP":
            case "NOV":

                System.out.println("This " +mon+ " month is 31 days");
                break;
                
            case "FEB":
                System.out.println("This "  +mon+ " month is 28 days");
                break;
                
            default:
                System.out.println("Please input month name as 'JAN -- DEC'");
        }

    }

}
