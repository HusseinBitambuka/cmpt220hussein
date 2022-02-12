import java.util.*;
//import math;
// Always add comments to your code
public class problem1{
    public static void main (String[]args){
        System.out.println("This program displays the diameter and area");
        System.out.println("Enter the radius of a circle: ");
        Scanner input= new Scanner(System.in);
        double radius= input.nextDouble();
        double diameter= radius*2;
        double area= radius*radius*Math.PI;
        System.out.println("The diameter is "+ diameter);
        System.out.println("The area is "+ area);
    }
}
