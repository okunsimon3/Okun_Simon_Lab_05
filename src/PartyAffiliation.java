import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String partyAffil = ""; // either R, D, or I
        boolean done = false;

        do {
            System.out.print("Enter your party affiliation as a letter [R, D, or I]: ");
            partyAffil = in.nextLine();

            if(partyAffil.equalsIgnoreCase("R")){
                System.out.println("You get a Republican Elephant");
                done = true;
            }
            else if(partyAffil.equalsIgnoreCase("D")){
                System.out.println("You get a Democratic Donkey");
                done = true;
            }
            else if(partyAffil.equalsIgnoreCase("I")){
                System.out.println("You get an Independent Man");
                done = true;
            }
            else {
                System.out.println("You entered: " + partyAffil + " as your party affiliation");
                done = true;
            }
        }while(!done);
    }
}
