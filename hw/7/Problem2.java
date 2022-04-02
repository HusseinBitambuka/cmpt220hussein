import java.util.Scanner;
import Point;
public class Problem2{
    public static void main(String []args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter X1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1=input.nextDouble();
        double y1=input.nextDouble();
        double x2=input.nextDouble();
        double y2=input.nextDouble();
        double x3=input.nextDouble();
        double y3=input.nextDouble();
        double x4=input.nextDouble();
        double y4=input.nextDouble();
        Point first= new Point(x1,y1);
        Point second=new Point(x2,y2);
        Point third=new Point(x3,y3);
        Point fourth=new Point(x4,y4);
        Point response=getIntersectingPoint(first,second,third,fourth);
        System.out.print("The intersecting point is at ( "+response.getX()+", " +response.getY()+" )" );
    }
    public static Point getIntersectingPoint(Point p1, Point p2, Point p3, Point p4){
        double a=(p1.y-p2.y);
        double b=(p1.x-p2.x);
        double e=(p1.y-p2.y)*p1.x-(p1.x-p2.x)*p1.y;
        double c=(p3.y-p4.y);
        double d=(p3.x-p4.x);
        double f=(p3.y-p4.y)*p3.x-(p3.x-p4.x)*p3.y;
        double delta=a*d-b*c; // determinat
        if (delta==0){
            return null;
        }
        else{
            double x=(e*d-b*f)/delta;
            double y=(a*f-e*c)/delta;
            Point intersection=new Point(x,y);
            return intersection;
        }
    }
}