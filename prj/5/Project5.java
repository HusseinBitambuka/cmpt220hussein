import java.util.Scanner;
import Complex;
public class Project5{
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first complex number: ");
        double real1=input.nextDouble();
        double imaginary1=input.nextDouble();
        Complex number1=new Complex(real1, imaginary1);
        System.out.print("Enter the second complex number: ");
        double real2=input.nextDouble();
        double imaginary2=input.nextDouble();
        Complex number2=new Complex(real2, imaginary2);
        System.out.println("( " + number1.toString()+" )"+
        " + "+" ( "+ number2.toString()+" )" +" = "+ " ( "+ number1.add(number2).toString()+" )" );
        System.out.println("( " + number1.toString()+" )"+
        " - "+" ( "+ number2.toString()+" )" +" = "+ " ( "+ number1.substract(number2).toString()+" )" );
        System.out.println("( " + number1.toString()+" )"+
        " * "+" ( "+ number2.toString()+" )" +" = "+ " ( "+ number1.multiply(number2).toString()+" )" );
        System.out.println("( " + number1.toString()+" )"+
        " / "+" ( "+ number2.toString()+" )" +" = "+ " ( "+ number1.divide(number2).toString()+" )" );
        System.out.print("| "+number1.toString()+" |"+" = "+ Complex.abs(number1));

        
    }
}