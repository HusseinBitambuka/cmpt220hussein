public class Problem1{
    public static void main(String []args){
        QuadraticEquation mido=new QuadraticEquation(1,3,2);
        System.out.println(mido.getRoot2());
    }
}
class QuadraticEquation{
    private double a;
    private double b;
    private double c;
    QuadraticEquation(double a1,double b1,double c1){
         a=a1;
         b=b1;
         c=c1;
    }
    double getA() {
        return a;
    }
    double getB() {
        return b;
    }
    double getC() {
        return c;
    }
    double getDiscrisminat(){
        return b*b-4*a*c;
    }
    double getRoot1(){
        if (getDiscrisminat()>0){
            return (-b+Math.sqrt(b*b-4*a*c))/2*a;
        }
        else{
            return 0;
        }   
    }
    double getRoot2(){
        if (getDiscrisminat()>0){
            return (-b-Math.sqrt(b*b-4*a*c))/2*a;
        }
        else{
            return 0;
    }
}
}