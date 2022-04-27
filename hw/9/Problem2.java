import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the Binary number: ");
        String binary = input.next(); // the binary String to be converted
        boolean checker = true; // the boolean value to atleast make sure we get one binary code
        while (checker) {
            try {
                System.out.println("The corresponding decimal of " + binary + " is " + bin2D(binary)); // checking
                                                                                                       // whether the
                                                                                                       // function
                                                                                                       // convert the
                                                                                                       // binary into
                                                                                                       // decimal
                checker = false;
            } catch (NumberFormatException ex) {
                System.out.println("You did not enter a binary number");
                System.out.println("\n Please, Enter the Binary number: ");
                binary = input.next();

            }
        }
    }

    public static int bin2D(String binaryString) throws NumberFormatException {
        int result = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if (Integer.valueOf(String.valueOf(binaryString.charAt(i))) > 1) { // checking if the number is a binary
                                                                               // number, and if not, throw Number
                                                                               // exception error
                throw new NumberFormatException();
            }
        }
        // start the transformation from binary to decimal
        String newBinary = new StringBuffer(binaryString).reverse().toString(); // reverse the binary string to get the
                                                                                // positions that matche the decimal
                                                                                // ones
        for (int i = 0; i < newBinary.length(); i++) {
            if (newBinary.charAt(i) == '1') { // just check the if the character in the reverse string is one, and if it
                                              // is, take two and raise to its position
                result += Math.pow(2, i);
            }
        }
        return result;
    }
}
