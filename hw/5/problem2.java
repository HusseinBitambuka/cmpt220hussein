import java.util.Scanner;
public class problem2{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Emter an integer: ");
        int integer=input.nextInt(); // the integer to be converted
        System.out.println("The binary value is "+ decimalTobinary(integer));


    }
    public static String decimalTobinary(int value){
        String result; // the reverse of the binary code that gives the true conversion
        String binary=""; // the binary in revirse
        String one="1"; // 1: the number to be printed 
        String zero="0";// 2: the number to be printed 
        do {
            if(value%2==1){
                binary+=one;
            }
            else{
                binary+=zero;
            }
            value/=2;
        } while (value>=1);
        result=new StringBuffer(binary).reverse().toString();
        return result;
    }
}