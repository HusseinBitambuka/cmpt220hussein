import java.util.Scanner;
public class problem1{
    public static void main(String[] args){
        System.out.println("This program displays the area of a polygone");
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        double sides= input.nextDouble();// number of sides of the polygones
        System.out.print("Enter the side: ");
        double side=input.nextDouble(); // the lenght of the polygones
        double area= ((sides)* (side*side))/(4*Math.tan(Math.PI/sides)); // the area of the polygone
        System.out.println("The area of the polygone is "+ area);
    }
}