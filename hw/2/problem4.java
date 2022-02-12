import java.util.*;
public class problem4{
    public static void main(String[]args){
        System.out.println("This program prompts the user to enter the number of mintues"+
        " and then convert them into years and remaining days");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        int minutes=input.nextInt();
        int years= minutes/(60*24*365);
        if(minutes%(60*24*365)==0){
            System.out.println(minutes+" minutes is "+ years+" years");
        }
        else{
            int remainingDays=minutes%(60*24*365);
            int days=remainingDays/(60*24);

            System.out.println(minutes+"minutes is approximately "+
            years+" years and "+ days+" days");

        }



    }
}