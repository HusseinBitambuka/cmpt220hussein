import java.util.*;
public class problem2{
    public static void main (String[]args){
Scanner input= new Scanner(System.in);
System.out.println("This program prints the height of a building from  the time it takes a ball"+
" to fall down from the highest point of the building");
System.out.println("Enter the ball travel time in second : ");
double time= input.nextDouble();
double height= (9.8*(time)*(time))/2;
System.out.println("The height of the buiding"+ height);
    }
}