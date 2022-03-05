import java.util.Scanner;
public class problem1{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the digits to be multiplied: ");
        long digits=input.nextLong(); // the digits that need to be multiply
        System.out.println("multipying  the digits"+" ("+digits+") returns "+ multipyDigits(digits));
    }
    public static long multipyDigits(long n){
        long multiple=1; //the multiple of the entered digits
        do{
            long extraction= n%10; // the extrarion of digits
            multiple*=extraction;
            n/=10;
        } while (n>0);
        return multiple;
    }
}