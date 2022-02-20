import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        System.out.println(" This program computes the equation of a line given the coordinates");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coordinates for two points: ");
        Double x_firstPoint = input.nextDouble(); // x coordinate of the first point
        Double y_firstPoint = input.nextDouble(); // y coordinate of the first point
        Double x_secondPoint = input.nextDouble(); // x coordinate of the second point
        Double y_secondPoint = input.nextDouble(); // y coordinate of the second point
        Double slope = (y_secondPoint - y_firstPoint) / (x_secondPoint - x_firstPoint); // the slope of the equartion
        Double y_intercept = y_firstPoint - (slope * x_firstPoint); // the y intercept of the equation
        if (slope != 1 && y_firstPoint == 0) {
            System.out.println("The line equation for two points (" + x_firstPoint + " , " + y_firstPoint
                    + ") and (" + x_secondPoint + ", " + y_secondPoint + ") is y= " + slope);
        } else if (slope != 1 && y_intercept != 0) {
            System.out.println("The line equation for two points (" + x_firstPoint + " , " + y_firstPoint
                    + ") and (" + x_secondPoint + ", " + y_secondPoint + ") is y= " + slope + "x +" + y_intercept);
        } else if (slope == 1 && y_intercept == 0) {
            System.out.println("The line equation for two points (" + x_firstPoint + " , " + y_firstPoint
                    + ") and (" + x_secondPoint + ", " + y_secondPoint + ") is y= x");
        } else if (slope == 1 && y_intercept != 0) {
            System.out.println("The line equation for two points (" + x_firstPoint + " , " + y_firstPoint
                    + ") and (" + x_secondPoint + ", " + y_secondPoint + ") is y= " + y_intercept);
        }
    }
}
