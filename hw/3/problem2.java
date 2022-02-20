import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a numerator: ");
        int numerator = input.nextInt();// the numerator of the fraction
        System.out.println("Enter the denominator: ");
        int denominator = input.nextInt();// tbe denominator of the fraction
        int quotient = numerator / denominator;// the quotient of the division between numerator and denominator
        int reminder = numerator - (quotient * denominator);// the reminder of the division betwenn numerator and
                                                            // denominator
        if (quotient < 1) {
            System.out.println(numerator + " / " + denominator + " is a proper fraction");
        } else if (reminder == 0 && quotient > 1) {
            System.out.println(numerator + " / " + denominator + " is an improper fraction," +
                    " and it can be reduced to " + quotient);
        } else {
            System.out.println(numerator + " / " + denominator + " is an improper fraction," +
                    " and its mixed fraction is " + quotient + " +  " + reminder + "/ " + denominator);
        }

    }

}