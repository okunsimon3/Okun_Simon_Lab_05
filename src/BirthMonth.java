import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        String trash = "";

        System.out.print("Enter your birth month as a number [1-12]: ");
        if(in.hasNextInt()) {
            birthMonth = in.nextInt();
            in.nextLine();
        }
        else {
            trash = in.nextLine();
            System.out.println("You said your birth month was " + trash);
            System.out.println("Run the program again and enter a valid birth month number");
        }
        if (birthMonth <= 12 && birthMonth >= 1) {
            System.out.println("Your birth month is: " + birthMonth);
        }
        else {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
    }
}
