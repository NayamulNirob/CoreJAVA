package leapyear;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter a year");
//
//        int year = input.nextInt();
//
//        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
//
//        System.out.println(year + "Is a leapyear " + isLeapYear);

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter year number");
        int year=scanner.nextInt();
       
        if(year%4==0 && year%400==0 && year%100!=0){
            System.out.println("this year is a Leap Year");
        }
        else{
            System.out.println("This year is not a Leap Year");
        }

    }

}
