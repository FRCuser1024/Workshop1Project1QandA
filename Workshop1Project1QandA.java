import java.util.Scanner;

public class Workshop1Project1QandA {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What color is the sky at day?");
        String string1 = in.nextLine();

        System.out.println("What is 1 raised to the power of 1?");
        String string2 = in.nextLine();

        System.out.println("What is the name of the United States' first president?");
        String string3 = in.nextLine();

        System.out.println("What is the probability that a fair die rolls 1?");
        String string4 = in.nextLine();

        System.out.println("What is the derivative of ln(x) + 3?");
        String string5 = in.nextLine();

        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println(string4);
        System.out.println(string5);
    }
}