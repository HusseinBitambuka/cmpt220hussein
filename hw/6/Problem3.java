import java.util.Scanner;
public class Problem3{
    public static void main( String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the string to examined: ");
        String mixed=input.next(); // the mixed string
        System.out.println(counts(mixed));
    }
    public static int[] counts(String s){
        for (int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))==true){
                String collector=""+s.charAt(i);
            }            
        }
        char digits[]=collector.toCharArray();
        for(int j=0; j<collector.length;j++){
        }
    
}