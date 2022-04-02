import java.util.Scanner;
import Point;
public class Problem3{
    public static void main(String [] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter X1, y1, x2, y2, x3, y3: ");
        double x1=input.nextDouble();
        double y1=input.nextDouble();
        double x2=input.nextDouble();
        double y2=input.nextDouble();
        double x3=input.nextDouble();
        double y3=input.nextDouble();
        Point first= new Point(x1,y1);
        Point second=new Point(x2,y2);
        Point third=new Point(x3,y3);
        Point answer=getCenterPoint(first,second,third);
        System.out.print("The center point is at( "+ answer.getX()+", "+answer.getY()+" )");

    }
    public static Point getCenterPoint(Point p1, Point p2, Point p3){
        double ox=(p1.x+p2.x+p3.x)/3;
        double oy=(p1.y+p2.y+p3.y)/3;
        Point center=new Point(ox,oy);
        return center;

    }
}
