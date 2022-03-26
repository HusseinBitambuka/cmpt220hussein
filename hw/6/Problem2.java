import java.util.Scanner;
public class Problem2{
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        double[] polygone=new double[12]; // an array that contains the points that define the polygone
        System.out.print("Enter the coordinates by adding x then y of each point: ");
        for(int i=0;i<12;i++){
            polygone[i]=input.nextDouble();
        }
        double area=getArea(polygone);// the area of the polygone
        System.out.print("the area of the convex polygone is: "+ area);
    }
    public static double getArea(double[] point){
        double areaFirstTriangle=Math.abs(point[0]*(point[3]-point[5])+point[2]*(point[5]-point[1])+point[4]*(point[1]-point[3]))/2; // the area of the first triangle given the first triangle
        double areaSecondTriangle=Math.abs(point[0]*(point[5]-point[7])+point[4]*(point[7]-point[1])+point[6]*(point[1]-point[5]))/2; // the area of the second triangle
        double areaFouthTriangle=Math.abs(point[0]*(point[9]-point[11])+point[8]*(point[11]-point[1])+point[10]*(point[1]-point[9]))/2; // the area of the third triangle
        double areaThirdTriangle=Math.abs(point[0]*(point[7]-point[9])+point[10]*(point[9]-point[1])+point[10]*(point[1]-point[7]))/2; // the area of the fourth triangle
        double area=areaFirstTriangle+areaSecondTriangle+areaThirdTriangle+areaFouthTriangle; // total area of the polygone
        return area;
    }
}