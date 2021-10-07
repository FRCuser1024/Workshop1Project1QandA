import java.util.Scanner;

public class Workshop1Project2ShoppingCalculator {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please input the five missile prices in US cents on separate lines: ");
        int price1 = in.nextInt();
        int price2 = in.nextInt();
        int price3 = in.nextInt();
        int price4 = in.nextInt();
        int price5 = in.nextInt();
        int sum = price1 + price2 + price3 + price4 + price5;
        System.out.println("The total cost of your purchase (before tax and tip) is " + sum + " US cents. Please consider using our missile price summing service again. Have a wonderful day!");
    }
}