import java.util.Scanner;
public class problem2{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of the sides: ");
        double sides=input.nextDouble(); // the number of the sides
        System.out.print("Enter the radius of the bounding circle: "); 
        Double radius=input.nextDouble();// the radius of the bounding cirlce
        Double OCLOK=0.0;
        Double TWO=2.0;
        Double leapAngle=(TWO*(Math.PI))/sides; // the angle between two radius
        Double TIMER=0.0; // the constant that moves the radius
        System.out.println(" The coordinates of the points on the polygone are ");
        for(int i=0; i<sides; i++){
            Double xcoordinate= radius*(Math.cos(0.0+TIMER*(leapAngle))); // the x-coordinate
            Double ycoordinate= radius*(Math.sin(0.0+TIMER*(leapAngle))); // the y-coordinate
            TIMER+=1.0;
            System.out.println("( "+ xcoordinate +  " , "+ ycoordinate +" )");
        }
    }
}