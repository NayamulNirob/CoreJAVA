package swichcasemalefemale;

import java.util.Scanner;

public class SwichCaseMaleFemale {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("""
                           Between 1 to 13Enter a number to check  About sex Category
                           """);

        int gender = input.nextInt();

        String sex = "";

        switch (gender) {
            case 1 -> sex = "Male";
            case 2 -> sex = "Female";
            case 3 -> sex = "Gay";
            case 4 -> sex = "Shemale";
            case 5 -> sex = "Bisexual";
            case 6 -> sex = "Lesbian";
            case 7 -> sex = "Crossdresser";
            case 8 -> sex = "Transgender";
            case 9 -> sex = "Asexual";
            case 10 -> sex = "Demisexual";
            case 11 -> sex = "Demiromantic";

            case 12 -> sex = "Pansexual";

            default -> System.out.println("""
                                          There are 13 categories in this list
                                          please select between this 13 categories""");
        }
        System.out.println(sex);
    }

}
