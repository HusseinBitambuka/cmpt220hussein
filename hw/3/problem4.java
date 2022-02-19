public class problem4{
    public static void main(String[] args){
        double xPoint=(-5 +Math.random()*5); //the x coordonate of the point
        double yPoint=(-5 +Math.random()*5); // the y coordonate of the point
        System.out.println("The point is ("+ xPoint+" , "+ yPoint+ " )");
        double distance=Math.sqrt((xPoint*xPoint)+(yPoint*yPoint)); // the distance between the point and the center (0,0)
        System.out.println("its distance to the center is " + distance);

    }
}