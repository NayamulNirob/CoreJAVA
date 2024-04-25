package swichcasemalefemale;

import java.util.Scanner;

public class SwichCaseMaleFemale {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to check  About sex Category\n" + "Between 1 to 13");

        int gender = input.nextInt();

        String sex = "";

        switch (gender) {
            case 1:
                sex = "Male";
                break;
            case 2:
                sex = "Female";
                break;
            case 3:
                sex = "Gay";
                break;
            case 4:
                sex = "Shemale";
                break;
            case 5:
                sex = "Bisexual";
                break;
            case 6:
                sex = "Lesbian";
                break;
            case 7:
                sex = "Crossdresser";
                break;
            case 8:
                sex = "Transgender";
                break;
            case 9:
                sex = "Asexual";
                break;
            case 10:
                sex = "Demisexual";
                break;
            case 11:
                sex = "Demiromantic";
                break;

            case 12:
                sex = "Pansexual";
                break;

            default:
                System.out.println("There are 13 categories in this list\n"
                        + "please select between this 13 categories");
        }
        System.out.println(sex);
    }

}
