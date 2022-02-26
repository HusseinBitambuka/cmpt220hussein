import java.util.Scanner;
public class project1{
    public static void main(String[] args){
        int Sample1;int mean;int Sample2; //Sample one S1, mean T, and sample2 S2
        Scanner input=new Scanner(System.in);
        System.out.println("Enter S1 and T, both between -100 and 100");
        Sample1=input.nextInt();  mean= input.nextInt();
        Sample2= (mean*2)-Sample1;// Sample2 calculation from T and S1
        System.out.println("Sample Input"+ " Sample output");
    
        System.out.println(Sample1+" "+"  "+mean+"        "+Sample2);
    }
}