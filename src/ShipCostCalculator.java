import java.util.Scanner;

public class ShipCostCalculator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        final double SHIP_RATE = 0.02;
        double shipCost = 0;
        double totalCost = 0;
        String trash = "";

        System.out.print("Enter the price of your item: ");

        if(in.hasNextDouble()) { // if user gives a double than it's safe to read
            itemPrice = in.nextDouble();
            in.nextLine(); // Clear buffer
        }
        else {
            trash = in.nextLine();
            System.out.println("You said the price of your item was " + trash);
            System.out.println("Run the program again and enter a valid number");
        }
        if (itemPrice <= 100) {
            shipCost = itemPrice * SHIP_RATE;
            totalCost = itemPrice + shipCost;
            System.out.println("The price of shipping your item is " + shipCost);
            System.out.println("The total price of your item with shipping is " + totalCost);
        }
        else {
            System.out.println("The price of shipping your item is " + shipCost);
            System.out.println("The total price of your item with shipping is " + itemPrice);
        }
    }
}