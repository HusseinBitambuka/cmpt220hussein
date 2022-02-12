import java.util.*;
public class problem3{
    public static void main(String[]args){
        System.out.println("This program displays the coefficient for fiction of an object");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the friction force in Newton: ");
        double force= input.nextDouble();
        System.out.println("Enter the object's mass in Kg: ");
        double mass= input.nextDouble();
        System.out.println("Enter the object's acceleration in m/s^2: ");
        double acceleration= input.nextDouble();
        double coefficient=(force-mass*acceleration)/(mass*9.8);
        System.out.println("the coefficient for fiction is: "+ coefficient);
    }
}