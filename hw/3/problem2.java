import java.util.Scanner;
public class problem2{
    public static void main(String[]args){
        Scanner input= new Scanner (System.in);
        System.out.println("Enter a numerator: ");
        int numerator= input.nextInt();
        System.out.println("Enter the denominator: ");
        int denominator= input.nextInt();
        int quotient=numerator/denominator;
        int reminder=numerator-(quotient*denominator);
        if (quotient<1){
            System.out.println(numerator+ " / "+ denominator+ " is a proper fraction");
        }
        else if (reminder==0&&quotient>1){
            System.out.println(numerator+ " / "+ denominator+ " is an improper fraction," +
            " and it can be reduced to " + quotient );
                 }
        else{
            System.out.println(numerator+ " / "+ denominator+ " is an improper fraction,"+
             " and its mixed fraction is " + quotient + " +  "+reminder + "/ "+ denominator );
            }
            
            
        }


    }