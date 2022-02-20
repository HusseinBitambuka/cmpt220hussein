import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        System.out.println("this program computes the roots of quadratic equations");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");
        Double a = input.nextDouble(); // this is the term with x^2
        Double b = input.nextDouble(); // this is the term with x
        Double c = input.nextDouble(); // this is the independent term
        Double discriminant = (b * b) - (4 * a * c); // this is the discriminant, the value that determines the number
                                                     // of roots
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / 2; // thsis is the firt root of the quadratic
            double root2 = (-b - Math.sqrt(discriminant)) / 2; // this is the second root of the quadratic
            System.out.println("The equation has two distinct roots " + root1 + root2);

        } else if (discriminant == 0) {
            double root = (-b) / 2; // the double root
            System.out.println("The equation has one root " + root);

        } else {
            System.out.println(" The equation has no real roots");
        }
    }
}