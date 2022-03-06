import java.util.Scanner;
public class problem3{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String capitalized=input.next();
        System.out.println(" The new string is: "+ title(capitalized));
        System.out.println(capitalized);
    }

    // This is only returning one word
    public static String title(String s){ // JA
        String firstAlph=s.substring(0,1);// first alphabet
        String remain= s.substring(1,s.length()); // the remaing alphabet of the words
        firstAlph=firstAlph.toUpperCase(); // capitalization of first alphabet
        String word= firstAlph+remain; // the word capitalized
        return word;
    }
}