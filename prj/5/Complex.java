public class Complex extends Number implements Cloneable,Comparable<Complex>{
    private double a=0; // real part
    private double b=0; // imaginary part
    public Complex(){ // zero in the complex set
        this(0,0); 
    }
    public Complex(double a){ // real number in the complex set
        this.a=a;
        this.b=0;
    }
    public Complex(double a, double b){ // complex number
        this.a=a;
        this.b=b;
    }
    public double getRealPart(){ // get the real part
        return this.a;
    }
    public double getImaginaryPart(){ // get the imaginary part
        return this.b;
    }
    public Complex add(Complex a){ // addition of two complex numbers
        double k=a.getRealPart()+this.a; // add the real parts
        double h=a.getImaginaryPart()+this.b; // add the complex parts
        return new Complex(k,h);
    }
    public Complex substract(Complex a){ // substraction of two complex  numbers
        double k=this.a-a.getRealPart(); // substract the real parts
        double h=this.b-a.getImaginaryPart(); // substract the complex parts
        return new Complex(k,h);
    }
    public Complex multiply(Complex a){ // multiplication of two complex number
        double k=this.a*a.getRealPart()-this.b*a.getImaginaryPart(); // the real part
        double h=this.b*a.getRealPart()+this.a*a.getImaginaryPart(); // the imaginary part
        return new Complex(k,h);
    }
    public static double abs(Complex a){// a static method for absolute value or modulus of a complex number
        return Math.sqrt(a.getRealPart()*a.getRealPart()+a.getImaginaryPart()*a.getImaginaryPart()); // sqrt(real**2+imaginary**2)
    }
    public Complex divide(Complex a){ // division between two complex number
        double k=(this.a*a.getRealPart()+this.b*a.getImaginaryPart())/Math.pow(abs(a), 2);// the real part 
        double h=(this.b*a.getRealPart()-this.a*a.getImaginaryPart())/Math.pow(abs(a), 2);// the imaginary part
        return new Complex(k,h);
    }
    @Override
    // overidding the toString method to return a standard representation of complex number
    public String toString(){
        if(this.b==0){
            // if the imaginary part is zero, return the real part
            return this.a+"";
        }
        // return the complex number as "a+bi"
        return this.a+" + "+ this.b+" i";
    }
    @Override
    //overriding the compareTo method in the Comparable interface to compare two complex numbers
    public int compareTo(Complex a){
        if(this.a>a.getRealPart()){
            // check if the real part our complex is bigger than the other real part complex and return one if it is the case
            return 1;
        }
        else if (this.a==a.getRealPart()){
            // check if the real parts of the two complex numbers are equal, and if they are:
            if(this.b==a.getImaginaryPart()){
                // if their imaginary parts are equalp, retun 0
                return 0;
            }
            else if(this.b>a.getImaginaryPart()){
                // if the imaginary part of our number is bigger, return one
                return 1;
            }
            else{
                // if it is not the two previous scenarios, then return negative one
                return -1;
            }
        }
        else{
            // check if the real part our complex is less than the real part of the other complex and return negative one if it is the case
            return -1;
        }
    }
    @Override
    // overriding the clone method in the Object class by making it more visible
    public Object clone(){
        try{
            // check if our object is clonable, and then clone it
            return super.clone();
        }
        catch(CloneNotSupportedException ex){ //otherwise throw an exception
            return null;
        }
    }
    @Override
    // overriding the intValue method in the Number abstract class
    public int intValue() {
        // return the real part as an integer
        return (int) this.a;
    }
    @Override
    // overriding the longValue method in the Number abstract class
    public long longValue() {
        // return the real part as a long
        return (long) this.a;
    }
    @Override
    // overriding the floatValue method in the Number abstract class
    public float floatValue() {
        // return the real part as a float
        return (float) this.a;
    }
    @Override
    //overriding the floatValue method in the Number abstract class
    public double doubleValue() {
        // return the real part
        return this.a;
    }
}